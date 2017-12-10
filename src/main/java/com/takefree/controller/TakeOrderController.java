package com.takefree.controller;

import com.fasterxml.jackson.annotation.JsonView;
import com.takefree.common.annotation.Authorization;
import com.takefree.common.config.Constants;
import com.takefree.common.entry.JsonObjectList;
import com.takefree.common.entry.JsonSimpleObject;
import com.takefree.common.entry.ResultView;
import com.takefree.common.entry.Token;
import com.takefree.common.util.JsonObjectUtils;
import com.takefree.dto.model.ShareDTO;
import com.takefree.dto.model.TakeOrderDTO;
import com.takefree.dto.model.UserDTO;
import com.takefree.pojo.model.TakeOrder;
import com.takefree.service.ShareOrderService;
import com.takefree.service.ShareService;
import com.takefree.vo.CreateOrderForm;
import org.apache.logging.log4j.core.config.plugins.validation.constraints.Required;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by gaoxiang on 2017/11/4.
 */
@Controller
public class TakeOrderController {
    @Autowired
    private ShareService shareService;

    @Autowired
    private ShareOrderService shareOrderService;

    @RequestMapping(value = "/order",method = RequestMethod.POST)
    @ResponseBody
    @Authorization
    public JsonSimpleObject createOrders(@RequestAttribute(Constants.TAKEFREE_TOKEN) Token token,@Valid @RequestBody CreateOrderForm createOrderForm) throws Exception{
        shareOrderService.createOrders(token, createOrderForm);
        return JsonObjectUtils.buildSimpleObjectSuccess(null);
    }

    @RequestMapping(value = "/order/{id}",method = RequestMethod.DELETE)
    @ResponseBody
    @Authorization
    public JsonSimpleObject deleteOrder(@RequestAttribute(Constants.TAKEFREE_TOKEN) Token token,@PathVariable("id") Long orderId) throws Exception{
        shareOrderService.deleteById(orderId);
        return JsonObjectUtils.buildSimpleObjectSuccess(null);
    }

    /**
     * 获取收到指定分享的用户
     * @param token
     * @param shareId
     * @param pageNo 可选
     * @param pageSize 可选
     * @param status 可选 10初始状态; 20
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/order",method = RequestMethod.GET)
    @ResponseBody
    public JsonObjectList<TakeOrderDTO> getOrdersByShare(@RequestAttribute(Constants.TAKEFREE_TOKEN) Token token, Integer pageNo, Integer pageSize, @RequestParam(required=true) Long shareId, Integer status) throws Exception{
        List<TakeOrderDTO> shareDTOS=shareOrderService.getOrders(pageNo, pageSize,shareId,null,null,status);
        return JsonObjectUtils.buildListSuccess(shareDTOS);
    }

    @RequestMapping(value = "/order",method = RequestMethod.PUT)
    @ResponseBody
    @Authorization
    public JsonSimpleObject updateOrder(@RequestAttribute(Constants.TAKEFREE_TOKEN) Token token, @RequestBody TakeOrder takeOrder) throws Exception{
        shareOrderService.updateByIdSelected(token,takeOrder);
        return JsonObjectUtils.buildSimpleObjectSuccess(null);
    }

    /**
     * 获取用户收到的分享
     * @param token
     * @param pageNo 可选
     * @param pageSize 可选
     * @param status 可选 10初始状态; 20
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/order/takein",method = RequestMethod.GET)
    @ResponseBody
    @Authorization
    public JsonObjectList<TakeOrderDTO> getTakeInOrders(@RequestAttribute(Constants.TAKEFREE_TOKEN) Token token, Integer pageNo, Integer pageSize,Integer status) throws Exception{
        List<TakeOrderDTO> takeOrderDTOS=shareOrderService.getOrders(pageNo, pageSize,null,null, token.getUserDTO().getId(), status);
        return JsonObjectUtils.buildListSuccess(takeOrderDTOS);
    }

    /**
     * 获取用户收到的分享
     * @param token
     * @param pageNo 可选
     * @param pageSize 可选
     * @param status 可选 10初始状态; 20
     * @param ownerId 可选,默认不需要
     * @return
     * @throws Exception
     */
    @JsonView(ResultView.BriefView.class)
    @RequestMapping(value = "/order/takeout",method = RequestMethod.GET)
    @ResponseBody
    @Authorization
    public JsonObjectList<ShareDTO> getTakeOutShares(@RequestAttribute(Constants.TAKEFREE_TOKEN) Token token, Integer pageNo, Integer pageSize, Integer status, Long ownerId) throws Exception{
        /**
         * TODO
         */

        return null;
    }
}
