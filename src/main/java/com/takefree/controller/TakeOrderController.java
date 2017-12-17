package com.takefree.controller;

import com.takefree.common.Exception.SimpleHttpException;
import com.takefree.common.annotation.Authorization;
import com.takefree.common.config.Constants;
import com.takefree.common.entry.JsonObjectList;
import com.takefree.common.entry.JsonSimpleObject;
import com.takefree.common.entry.Token;
import com.takefree.common.util.JsonObjectUtils;
import com.takefree.common.web.constant.HttpStatus;
import com.takefree.dto.model.TakeOrderDTO;
import com.takefree.pojo.model.TakeOrder;
import com.takefree.service.TakeOrderService;
import com.takefree.vo.CreateOrderForm;
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
    private TakeOrderService takeOrderService;

    @RequestMapping(value = "/order",method = RequestMethod.POST)
    @ResponseBody
    @Authorization
    public JsonSimpleObject createOrders(@RequestAttribute(Constants.TAKEFREE_TOKEN) Token token,@Valid @RequestBody CreateOrderForm createOrderForm) throws Exception{
        takeOrderService.createOrders(token, createOrderForm);
        return JsonObjectUtils.buildSimpleObjectSuccess(null);
    }

    @RequestMapping(value = "/order/{id}",method = RequestMethod.DELETE)
    @ResponseBody
    @Authorization
    public JsonSimpleObject deleteOrder(@RequestAttribute(Constants.TAKEFREE_TOKEN) Token token,@PathVariable("id") Long orderId) throws Exception{
        /*
         * TODO...权限校验
         */
        int row=takeOrderService.deleteById(orderId);
        if(row==0) {
            throw new SimpleHttpException(HttpStatus.NOT_FOUND, "无此记录");
        }else{
            return JsonObjectUtils.buildSimpleObjectSuccess(null);
        }
    }

    @RequestMapping(value = "/order/{id}",method = RequestMethod.PUT)
    @ResponseBody
    @Authorization
    public JsonSimpleObject<TakeOrderDTO> updateOrder(@RequestAttribute(Constants.TAKEFREE_TOKEN) Token token,@PathVariable("id") Long orderId, @RequestBody TakeOrder takeOrder) throws Exception{
        /*
         * TODO...权限校验
         */
        takeOrder.setId(orderId);
        int row=takeOrderService.updateByIdSelected(token, takeOrder);
        if(row==0) {
            throw new SimpleHttpException(HttpStatus.NOT_FOUND, "无此记录");
        }else{
            return JsonObjectUtils.buildSimpleObjectSuccess(null);
        }
    }

    @RequestMapping(value = "/order/{id}",method = RequestMethod.GET)
    @ResponseBody
    @Authorization
    public JsonSimpleObject<TakeOrderDTO> getOrder(@RequestAttribute(Constants.TAKEFREE_TOKEN) Token token,@PathVariable("id") Long orderId) throws Exception{
        TakeOrderDTO takeOrderDTO=takeOrderService.getTakeOrderDTOById(orderId);
        if(takeOrderDTO==null){
            throw new SimpleHttpException(HttpStatus.NOT_FOUND, "无此订单");
        }
        if(!takeOrderDTO.getApplicantId().equals(token.getUserDTO().getId())&&!takeOrderDTO.getOwnerId().equals(token.getUserDTO().getId())){
            throw new SimpleHttpException(HttpStatus.FORBIDDEN, "无权限");
        }
        return JsonObjectUtils.buildSimpleObjectSuccess(takeOrderDTO);
    }

    /**
     * 获取分享订单
     * @param applicantId 可选
     * @param shareId 可选
     * @param pageNo 可选
     * @param pageSize 可选
     * @param status 可选 10初始状态; 20
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/order",method = RequestMethod.GET)
    @ResponseBody
    public JsonObjectList<TakeOrderDTO> getOrders(@RequestAttribute(value=Constants.TAKEFREE_TOKEN,required = false) Token token, Integer pageNo, Integer pageSize, Long applicantId, Long shareId, Integer status) throws Exception{
        if(applicantId!=null){
            if(token==null||!token.getUserDTO().getId().equals(applicantId)){
                throw new SimpleHttpException(HttpStatus.UNAUTHORIZED, "Unauthorized");
            }
        }

        List<TakeOrderDTO> shareDTOS= takeOrderService.getTakeOrderDTOs(pageNo, pageSize, shareId, null, applicantId, status);
        return JsonObjectUtils.buildListSuccess(shareDTOS);
    }
}
