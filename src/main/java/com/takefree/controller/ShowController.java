package com.takefree.controller;

import com.takefree.common.Exception.SimpleHttpException;
import com.takefree.common.annotation.Authorization;
import com.takefree.common.config.Constants;
import com.takefree.common.entry.JsonObjectList;
import com.takefree.common.entry.JsonSimpleObject;
import com.takefree.common.entry.Token;
import com.takefree.common.util.JsonObjectUtils;
import com.takefree.common.web.constant.HttpStatus;
import com.takefree.dto.model.OrderShowDTO;
import com.takefree.dto.model.TakeOrderDTO;
import com.takefree.pojo.model.OrderShow;
import com.takefree.service.OrderShowService;
import com.takefree.service.TakeOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by gaoxiang on 2017/11/4.
 */
@Controller
public class ShowController {
    @Autowired
    private OrderShowService orderShowService;

    @Autowired
    private TakeOrderService takeOrderService;

    /**
     * @param token
     * @param orderShowDTO
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/show", method = RequestMethod.POST)
    @ResponseBody
    @Authorization
    public JsonSimpleObject createShow(@RequestAttribute(Constants.TAKEFREE_TOKEN) Token token, @Valid @RequestBody OrderShowDTO orderShowDTO)
            throws Exception {
        TakeOrderDTO takeOrder=takeOrderService.getTakeOrderDTOById(orderShowDTO.getOrderId());
        if(takeOrder==null){
            throw new SimpleHttpException(HttpStatus.BAD_REQUEST, "订单不存在");
        }

        if(!takeOrder.getApplicantId().equals(token.getUserDTO().getId())){
            throw new SimpleHttpException(HttpStatus.FORBIDDEN, "只能接收方显摆");
        }

        if(orderShowService.getShowDTOs(null, 1, null, null, takeOrder.getId(), null, null).size()!=0){
            throw new SimpleHttpException(HttpStatus.BAD_REQUEST, "已经显摆");
        }

        orderShowDTO.setReceiverId(token.getUserDTO().getId());
        orderShowDTO.setGiverId(takeOrder.getOwnerId());
        orderShowDTO.setReceiverId(takeOrder.getApplicantId());
        orderShowService.create(orderShowDTO);
        return JsonObjectUtils.buildSimpleObjectSuccess(null);
    }

    /**
     * @param token
     * @param id
     * @param orderShowDTO
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/show/{id}", method = RequestMethod.PUT)
    @ResponseBody
    @Authorization
    public JsonSimpleObject updateShow(@RequestAttribute(Constants.TAKEFREE_TOKEN) Token token, @PathVariable Long id,
                                       @RequestBody OrderShowDTO orderShowDTO) throws Exception {
        OrderShow orderShow = orderShowService.getShowInfoById(id);
        if (orderShow == null) {
            throw new SimpleHttpException(HttpStatus.NOT_FOUND, "显摆不存在");
        }

        if (!orderShow.getReceiverId().equals(token.getUserDTO().getId())) {
            throw new SimpleHttpException(HttpStatus.FORBIDDEN, "无权限");
        }

        orderShowDTO.setId(id);
        orderShowService.updateByIdSelective(orderShowDTO);
        return JsonObjectUtils.buildSimpleObjectSuccess(null);
    }

    /**
     * @param token
     * @param id
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/show/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    @Authorization
    public JsonSimpleObject deleteShow(@RequestAttribute(Constants.TAKEFREE_TOKEN) Token token,@PathVariable Long id) throws Exception {
        OrderShow orderShow = orderShowService.getShowInfoById(id);
        if (orderShow == null) {
            throw new SimpleHttpException(HttpStatus.NOT_FOUND, "显摆不存在");
        }

        if (!orderShow.getReceiverId().equals(token.getUserDTO().getId())) {
            throw new SimpleHttpException(HttpStatus.FORBIDDEN, "无权限");
        }

        int row=orderShowService.deleteById(id);
        return JsonObjectUtils.buildSimpleObjectSuccess(null);
    }

    /**
     * 获取详细信息
     *
     * @param id
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/show/{id}", method = RequestMethod.GET)
    @ResponseBody
    public JsonSimpleObject<OrderShowDTO> getShowDetail(@RequestAttribute(value = Constants.TAKEFREE_TOKEN, required = false) Token token,@PathVariable Long id) throws Exception {
        OrderShowDTO orderShowDTO = orderShowService.getShowDTODetailById(id);
        if (orderShowDTO == null) {
            throw new SimpleHttpException(HttpStatus.NOT_FOUND, "显摆不存在");
        }

        Long userId = null;
        if (token != null) {
            userId = token.getUserDTO().getId();
        }

        orderShowService.updateViewInfo(orderShowDTO, userId);
        return JsonObjectUtils.buildSimpleObjectSuccess(orderShowDTO);
    }

    /**
     *
     * @param pageNo
     * @param pageSize
     * @param maxId
     * @param shareId
     * @param orderId
     * @param receiverId
     * @param giverId
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/show", method = RequestMethod.GET)
    @ResponseBody
    public JsonObjectList<OrderShowDTO> getShows(Integer pageNo, Integer pageSize, Long maxId,Long shareId, Long orderId, Long receiverId, Long giverId) throws Exception {
        List<OrderShowDTO> orderShowDTOS = orderShowService.getShowDTOs(pageNo, pageSize, maxId, shareId, orderId, receiverId, giverId);
        return JsonObjectUtils.buildListSuccess(orderShowDTOS);
    }
}
