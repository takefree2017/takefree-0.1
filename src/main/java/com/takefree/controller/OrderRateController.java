package com.takefree.controller;

import com.takefree.common.Exception.SimpleHttpException;
import com.takefree.common.annotation.Authorization;
import com.takefree.common.config.Constants;
import com.takefree.common.entry.JsonSimpleObject;
import com.takefree.common.entry.Token;
import com.takefree.common.util.JsonObjectUtils;
import com.takefree.common.web.constant.HttpStatus;
import com.takefree.dto.model.TakeOrderDTO;
import com.takefree.pojo.model.OrderRate;
import com.takefree.service.OrderRateService;
import com.takefree.service.TakeOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by gaoxiang on 2017/11/4.
 */
@Controller
@RequestMapping
public class OrderRateController {
    @Autowired
    private OrderRateService orderRateService;

    @Autowired
    private TakeOrderService takeOrderService;

    /**
     * 
     * @param token
     * @param orderRate
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/rate",method = RequestMethod.POST)
    @ResponseBody
    @Authorization
    public JsonSimpleObject<OrderRate> createOrderRate(@RequestAttribute(Constants.TAKEFREE_TOKEN) Token token,@RequestBody OrderRate orderRate) throws Exception{
        TakeOrderDTO takeOrderDTO=takeOrderService.getById(orderRate.getOrderId());

        if(takeOrderDTO==null){
            throw new SimpleHttpException(HttpStatus.BAD_REQUEST, "订单不存在");
        }else if(takeOrderDTO.getApplicantId().equals(token.getUserDTO().getId())){
            throw new SimpleHttpException(HttpStatus.FORBIDDEN, "无权限");
        }

        if(orderRateService.getByOrderId(orderRate.getOrderId()).size()>0){
            throw new SimpleHttpException(HttpStatus.BAD_REQUEST, "已记录订单号");
        }

        orderRateService.create(orderRate);
        return JsonObjectUtils.buildSimpleObjectSuccess(orderRate);
    }

    /**
     *
     * @param token
     * @param orderRate
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/rate/{id}",method = RequestMethod.POST)
    @ResponseBody
    @Authorization
    public JsonSimpleObject updateOrderRate(@RequestAttribute(Constants.TAKEFREE_TOKEN) Token token,@PathVariable Long id,@RequestBody OrderRate orderRate) throws Exception{
        OrderRate orderRate1=orderRateService.getById(id);

        if(orderRate1==null){
            throw new SimpleHttpException(HttpStatus.NOT_FOUND, "无此记录");
        }

        /**
         * TODO...权限检查
         */
        orderRate.setId(id);
        orderRateService.updateById(orderRate);
        return JsonObjectUtils.buildSimpleObjectSuccess(null);
    }

    /**
     *
     * @param token
     * @param id
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/rate/{id}",method = RequestMethod.DELETE)
    @ResponseBody
    @Authorization
    public JsonSimpleObject deleteOrderRate(@RequestAttribute(Constants.TAKEFREE_TOKEN) Token token,@PathVariable Long id) throws Exception{
        /**
         * TODO...权限判断
         */
        orderRateService.deleteById(id);

        return JsonObjectUtils.buildSimpleObjectSuccess(null);
    }

    /**
     * 按订单查询物流
     * @param token
     * @param orderId
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/rate",method = RequestMethod.GET)
    @ResponseBody
    @Authorization
    public JsonSimpleObject<OrderRate> getOrderRate(@RequestAttribute(value=Constants.TAKEFREE_TOKEN,required = false) Token token, @RequestParam Long orderId) throws Exception{
        /**
         * TODO...权限判断
         */
        List<OrderRate> logistics=orderRateService.getByOrderId(orderId);

        return JsonObjectUtils.buildSimpleObjectSuccess(logistics.get(0));
    }
}
