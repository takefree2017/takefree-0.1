package com.takefree.controller;

import com.fasterxml.jackson.annotation.JsonView;
import com.takefree.common.Exception.SimpleHttpException;
import com.takefree.common.annotation.Authorization;
import com.takefree.common.config.Constants;
import com.takefree.common.entry.JsonSimpleObject;
import com.takefree.common.entry.ResultView;
import com.takefree.common.entry.Token;
import com.takefree.common.service.TokenManager;
import com.takefree.common.util.JsonObjectUtils;
import com.takefree.common.util.Util;
import com.takefree.common.web.constant.HttpStatus;
import com.takefree.model.UserDescriptionDO;
import com.takefree.model.UserInfoDO;
import com.takefree.service.UserManager;
import com.xiaoleilu.hutool.crypto.SecureUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.util.List;

/**
 * Created by gaoxiang on 2017/11/4.
 */
@Controller
public class UserController {
    @Autowired
    private UserManager userManager;

    @Autowired
    private TokenManager tokenManager;

    /**
     * 注册,必须字段通过Valid检查
     */
    @RequestMapping(value = "/user",method = RequestMethod.POST)
    @ResponseBody
    @JsonView(ResultView.DetailView.class)
    public JsonSimpleObject<UserInfoDO> create(@Valid @RequestBody UserInfoDO userInfoDO, @Valid @RequestBody UserDescriptionDO userDescriptionDO, HttpServletResponse httpServletResponse) throws Exception{
        //检查手机是否已经注册
        if(userManager.selectByMobile(userInfoDO.getMobile()).size()>0){
            throw new SimpleHttpException(HttpStatus.BAD_REQUEST,"手机号已经注册");
        }

        //密码MD5两次保存
        userInfoDO.setPassword(SecureUtil.md5(SecureUtil.md5(userInfoDO.getPassword())));

        long id= userManager.insertSelective(userInfoDO);
        userInfoDO.setId(id);
        return JsonObjectUtils.buildSimpleObjectSuccess(userInfoDO);
    }

    /**
     * 登录，手机号+密码登录(md5两次)
     */
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @ResponseBody
    @JsonView(ResultView.DetailView.class)
    public JsonSimpleObject<Token> login(@RequestBody UserInfoDO userInfoDO,  HttpServletResponse httpServletResponse) throws Exception{
        if(StringUtils.isEmpty(userInfoDO.getMobile())){
            throw new SimpleHttpException(HttpStatus.BAD_REQUEST,"手机号为空");
        }

        List<UserInfoDO> users=userManager.selectByMobile(userInfoDO.getMobile());
        if(users.size()==0) {
            throw new SimpleHttpException(HttpStatus.BAD_REQUEST, "手机号错误");
        }
        if(!userInfoDO.getPassword().equals(users.get(0).getPassword())){
            throw new SimpleHttpException(HttpStatus.BAD_REQUEST, "手机号或密码错误");
        }

        userInfoDO=users.get(0);
        userInfoDO.setPassword(null); //token缓存中不保存登录密码
        Token token=tokenManager.createToken(userInfoDO);
        httpServletResponse.addCookie(new Cookie(Constants.TAKEFREE_TOKEN, token.getKey()));
        return JsonObjectUtils.buildSimpleObjectSuccess(token);
    }

    /**
     * 登录，手机号+密码登录(md5两次)
     */
    @RequestMapping(value = "/user",method = RequestMethod.PUT)
    @ResponseBody
    @Authorization
    @JsonView(ResultView.DetailView.class)
    public JsonSimpleObject update(@RequestAttribute(Constants.TAKEFREE_TOKEN) Token token,@RequestBody UserInfoDO userInfoDO,  HttpServletResponse httpServletResponse) throws Exception{
        if(userInfoDO.getMobile()!=null){
            throw new SimpleHttpException(HttpStatus.FORBIDDEN, "不能通过此接口修改手机号");
        }
        if(userInfoDO.getPassword()!=null){
            throw new SimpleHttpException(HttpStatus.FORBIDDEN, "不能通过此接口修改密码");
        }
        userInfoDO.setId(token.getUserInfoDO().getId());
        int number=userManager.updateByPrimaryKeySelective(userInfoDO);

        return JsonObjectUtils.buildSimpleObjectSuccess(null);
    }

    /**
     * 查询当前用户
     * @param token
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/user/detail",method = RequestMethod.GET)
    @ResponseBody
    @Authorization
    @JsonView(ResultView.DetailView.class)
    public JsonSimpleObject<UserInfoDO> getCurrentUser(@RequestAttribute(Constants.TAKEFREE_TOKEN) Token token) throws Exception{
        UserInfoDO userInfoDO= userManager.selectByPrimaryKey(token.getUserInfoDO().getId());
        if(userInfoDO==null){
            throw new SimpleHttpException(HttpStatus.NOT_FOUND,"user not found");
        }
        return JsonObjectUtils.buildSimpleObjectSuccess(userInfoDO);
    }

    /**
     * 查询用户基本信息
     * @param userId
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/user/brief/{userId}",method = RequestMethod.GET)
    @ResponseBody
    @JsonView(ResultView.BriefView.class)
    public JsonSimpleObject<UserInfoDO> getUserBrief(@PathVariable Long userId) throws Exception{
        UserInfoDO userInfoDO= userManager.selectByPrimaryKey(userId);
        if(userInfoDO==null){
            throw new SimpleHttpException(HttpStatus.NOT_FOUND,"user not found");
        }
        return JsonObjectUtils.buildSimpleObjectSuccess(userInfoDO);
    }
}
