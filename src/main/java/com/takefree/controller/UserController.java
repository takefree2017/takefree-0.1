package com.takefree.controller;

import com.fasterxml.jackson.annotation.JsonView;
import com.takefree.common.MyJsonView;
import com.takefree.common.annotation.Authorization;
import com.takefree.common.config.Constants;
import com.takefree.common.entry.JsonSimpleObject;
import com.takefree.common.util.JsonObjectUtils;
import com.takefree.model.UserInfoDO;
import com.takefree.service.UserInfoManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by gaoxiang on 2017/11/4.
 */
@Controller
@RequestMapping(value = "user")
public class UserController {
    @Autowired
    private UserInfoManager userInfoManager;

    //注册
    @RequestMapping(value = "",method = RequestMethod.POST)
    @ResponseBody
    public JsonSimpleObject<UserInfoDO> create(@RequestBody UserInfoDO userInfoDO,  HttpServletResponse httpServletResponse) throws Exception{
        long id=userInfoManager.insertSelective(userInfoDO);
        userInfoDO.setId(id);
        return JsonObjectUtils.buildSimpleObjectSuccess(userInfoDO);
    }

    //查询当前用户
    @RequestMapping(value = "/detail/{userId}",method = RequestMethod.GET)
    @ResponseBody
    //@Authorization
    @JsonView(MyJsonView.DetailView.class)
    public JsonSimpleObject<UserInfoDO> getCurrentUser(@PathVariable Long userId) throws Exception{
        UserInfoDO userInfoDO=userInfoManager.selectByPrimaryKey(userId);
        return JsonObjectUtils.buildSimpleObjectSuccess(userInfoDO);
    }

    //查询当前用户
    @RequestMapping(value = "/brief/{userId}",method = RequestMethod.GET)
    @ResponseBody
    @JsonView(MyJsonView.BriefView.class)
    public JsonSimpleObject<UserInfoDO> getUserBrief(@PathVariable Long userId) throws Exception{
        UserInfoDO userInfoDO=userInfoManager.selectByPrimaryKey(userId);
        return JsonObjectUtils.buildSimpleObjectSuccess(userInfoDO);
    }
}
