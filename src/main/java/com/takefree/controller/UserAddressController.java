package com.takefree.controller;

import com.takefree.common.Exception.SimpleHttpException;
import com.takefree.common.annotation.Authorization;
import com.takefree.common.config.Constants;
import com.takefree.common.entry.JsonObjectList;
import com.takefree.common.entry.JsonSimpleObject;
import com.takefree.common.entry.Token;
import com.takefree.common.util.JsonObjectUtils;
import com.takefree.common.web.constant.HttpStatus;
import com.takefree.pojo.model.UserAddress;
import com.takefree.service.UserAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by gaoxiang on 2017/11/22.
 */
@Controller
public class UserAddressController {
    @Autowired
    private UserAddressService userAddressService;

    /**
     * 注意如果新增为默认地址则需要将原默认地址设置为非默认
     * @param token
     * @param userAddress
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/user/address",method = RequestMethod.POST)
    @ResponseBody
    @Authorization
    public JsonSimpleObject<UserAddress> createUserAddress(@RequestAttribute(Constants.TAKEFREE_TOKEN) Token token,@Valid @RequestBody UserAddress userAddress) throws Exception{
        userAddress.setUserId(token.getUserDTO().getId());

        userAddressService.create(userAddress);

        return JsonObjectUtils.buildSimpleObjectSuccess(userAddress);
    }

    /**
     *
     * @param token
     * @param id
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/user/address/{id}",method = RequestMethod.DELETE)
    @ResponseBody
    @Authorization
    public JsonSimpleObject<UserAddress> deleteUserAddress(@RequestAttribute(Constants.TAKEFREE_TOKEN) Token token,@PathVariable Long id) throws Exception{
        UserAddress userAddress=userAddressService.getUserAddressById(id);
        if(userAddress==null){
            throw new SimpleHttpException(HttpStatus.NOT_FOUND,"user address not found");
        }else if(!userAddress.getUserId().equals(token.getUserDTO().getId())){
            throw new SimpleHttpException(HttpStatus.FORBIDDEN,"无权限");
        }

        int row=userAddressService.deleteById(id);

        return JsonObjectUtils.buildSimpleObjectSuccess(null);
    }

    /**
     *
     * @param token
     * @param id
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/user/address/{id}",method = RequestMethod.GET)
    @ResponseBody
    @Authorization
    public JsonSimpleObject<UserAddress> getUserAddress(@RequestAttribute(Constants.TAKEFREE_TOKEN) Token token,@PathVariable Long id) throws Exception{
        UserAddress userAddress=userAddressService.getUserAddressById(id);
        if(userAddress==null){
            throw new SimpleHttpException(HttpStatus.NOT_FOUND,"user address not found");
        }else if(!userAddress.getUserId().equals(token.getUserDTO().getId())){
            throw new SimpleHttpException(HttpStatus.FORBIDDEN,"无权限");
        }

        return JsonObjectUtils.buildSimpleObjectSuccess(userAddress);
    }

    /**
     *
     * @param token
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/user/address",method = RequestMethod.GET)
    @ResponseBody
    @Authorization
    public JsonObjectList<UserAddress> getUserAddresss(@RequestAttribute(Constants.TAKEFREE_TOKEN) Token token,Integer isDefault) throws Exception{
        List<UserAddress> userAddresses=userAddressService.getUserAddresss(token.getUserDTO().getId(),isDefault);

        return JsonObjectUtils.buildListSuccess(userAddresses);
    }

    /**
     * 注意如果更新为默认地址则需要将原默认地址设置为非默认
     * @param token
     * @param id
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/user/address/{id}",method = RequestMethod.PUT)
    @ResponseBody
    @Authorization
    public JsonSimpleObject<UserAddress> updateUserAddress(@RequestAttribute(Constants.TAKEFREE_TOKEN) Token token,@PathVariable Long id,@RequestBody UserAddress userAddress) throws Exception{
        UserAddress oldUserAddress=userAddressService.getUserAddressById(id);
        if(oldUserAddress==null){
            throw new SimpleHttpException(HttpStatus.NOT_FOUND,"user address not found");
        }else if(!oldUserAddress.getUserId().equals(token.getUserDTO().getId())){
            throw new SimpleHttpException(HttpStatus.FORBIDDEN,"无权限");
        }

        userAddress.setUserId(token.getUserDTO().getId());
        userAddress.setId(id);

        int row=userAddressService.updateById(userAddress);

        return JsonObjectUtils.buildSimpleObjectSuccess(userAddress);
    }

}
