package com.takefree.controller;

import com.takefree.common.Exception.SimpleHttpException;
import com.takefree.common.annotation.Authorization;
import com.takefree.common.config.Constants;
import com.takefree.common.entry.JsonSimpleObject;
import com.takefree.common.entry.Token;
import com.takefree.common.util.JsonObjectUtils;
import com.takefree.common.web.constant.HttpStatus;
import com.takefree.dto.model.TakeOrderDTO;
import com.takefree.pojo.model.Logistics;
import com.takefree.service.LogisticsService;
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
@RequestMapping
public class LogisticsController {
    @Autowired
    private LogisticsService logisticsService;

    @Autowired
    private TakeOrderService takeOrderService;

    /**
     *
     * @param token
     * @param logistics
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/logistics",method = RequestMethod.POST)
    @ResponseBody
    @Authorization
    public JsonSimpleObject<Logistics> createLogistics(@RequestAttribute(Constants.TAKEFREE_TOKEN) Token token,@Valid @RequestBody Logistics logistics) throws Exception{
        TakeOrderDTO takeOrderDTO=takeOrderService.getTakeOrderDTOById(logistics.getOrderId());

        if(takeOrderDTO==null){
            throw new SimpleHttpException(HttpStatus.BAD_REQUEST, "订单不存在");
        }

        if(!takeOrderDTO.getOwnerId().equals(token.getUserDTO().getId())){
            throw new SimpleHttpException(HttpStatus.FORBIDDEN, "非送出人无权限");
        }

        if(logisticsService.getByOrderId(logistics.getOrderId()).size()>0){
            throw new SimpleHttpException(HttpStatus.BAD_REQUEST, "已记录订单号");
        }

        logisticsService.create(logistics);
        return JsonObjectUtils.buildSimpleObjectSuccess(logistics);
    }

    /**
     *
     * @param token
     * @param logistics
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/logistics/{id}",method = RequestMethod.PUT)
    @ResponseBody
    @Authorization
    public JsonSimpleObject updateLogistics(@RequestAttribute(Constants.TAKEFREE_TOKEN) Token token,@PathVariable Long id,@RequestBody Logistics logistics) throws Exception{
        Logistics logistics1=logisticsService.getById(id);

        if(logistics1==null){
            throw new SimpleHttpException(HttpStatus.NOT_FOUND, "无此记录");
        }
        /**
         * TODO...权限检查
         */

        logistics.setId(id);
        int row=logisticsService.updateById(logistics);
        if(row==0) {
            throw new SimpleHttpException(HttpStatus.NOT_FOUND, "无此记录");
        }else{
            return JsonObjectUtils.buildSimpleObjectSuccess(null);
        }
    }

    /**
     *
     * @param token
     * @param id
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/logistics/{id}",method = RequestMethod.DELETE)
    @ResponseBody
    @Authorization
    public JsonSimpleObject deleteLogistics(@RequestAttribute(Constants.TAKEFREE_TOKEN) Token token,@PathVariable Long id) throws Exception{
        /**
         * TODO...权限判断
         */
        int row=logisticsService.deleteById(id);
        if(row==0) {
            throw new SimpleHttpException(HttpStatus.NOT_FOUND, "无此记录");
        }else{
            return JsonObjectUtils.buildSimpleObjectSuccess(null);
        }
    }

    /**
     * 按订单查询订单号
     * @param token
     * @param orderId
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/logistics",method = RequestMethod.GET)
    @ResponseBody
    @Authorization
    public JsonSimpleObject<Logistics> getLogistics(@RequestAttribute(value=Constants.TAKEFREE_TOKEN,required = false) Token token, @RequestParam Long orderId) throws Exception{
        /**
         * TODO...权限判断
         */
        List<Logistics> logistics=logisticsService.getByOrderId(orderId);
        if(logistics.size()>0) {
            return JsonObjectUtils.buildSimpleObjectSuccess(logistics.get(0));
        }else{
            return JsonObjectUtils.buildSimpleObjectSuccess(null);
        }
    }
}
