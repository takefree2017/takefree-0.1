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
import com.takefree.common.web.constant.HttpStatus;
import com.takefree.model.UserDTO;
import com.takefree.model.UserInfo;
import com.takefree.query.UserInfoQuery;
import com.takefree.service.UserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

/**
 * Created by gaoxiang on 2017/11/4.
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private TokenManager tokenManager;

    /**
     * 注册,必须字段通过Valid检查
     */
    @RequestMapping(value = "/user",method = RequestMethod.POST)
    @ResponseBody
    @JsonView(ResultView.DetailView.class)
    public JsonSimpleObject<UserDTO> create(@Valid @RequestBody UserDTO userDTO, HttpServletResponse httpServletResponse) throws Exception{
        //检查手机是否已经注册
        if(userService.getUserInfoByMobile(userDTO.getMobile()).size() > 0){
            throw new SimpleHttpException(HttpStatus.BAD_REQUEST,"手机号已经注册");
        }

        boolean result = userService.create(userDTO);
        if(result) {
            return JsonObjectUtils.buildSimpleObjectSuccess(userDTO);
        }else{
            throw new SimpleHttpException(HttpStatus.INTERNAL_SERVER_ERROR,"创建失败，内部错误");
        }
    }


    /**
     * 登录
     * @param userDTO{mobile,password(md5两次)}
     * @param httpServletResponse
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @ResponseBody
    @JsonView(ResultView.DetailView.class)
    public JsonSimpleObject<Token> login(@RequestBody UserDTO userDTO, HttpServletResponse httpServletResponse) throws Exception{
        if(StringUtils.isEmpty(userDTO.getMobile())){
            throw new SimpleHttpException(HttpStatus.BAD_REQUEST,"手机号为空");
        }

        Token token=userService.login(userDTO);
        httpServletResponse.addCookie(new Cookie(Constants.TAKEFREE_TOKEN, token.getKey()));
        return JsonObjectUtils.buildSimpleObjectSuccess(token);
    }


    /**
     * 更新user
     * @param userDTO,mobile和password不能通过本接口修改
     * @param httpServletResponse
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/user",method = RequestMethod.PUT)
    @ResponseBody
    @Authorization
    @JsonView(ResultView.DetailView.class)
    public JsonSimpleObject update(@RequestAttribute(Constants.TAKEFREE_TOKEN) Token token, @RequestBody UserDTO userDTO, HttpServletResponse httpServletResponse) throws Exception{
        if(userDTO.getMobile() != null){
            throw new SimpleHttpException(HttpStatus.FORBIDDEN, "不能通过此接口修改手机号");
        }
        if(userDTO.getPassword() != null){
            throw new SimpleHttpException(HttpStatus.FORBIDDEN, "不能通过此接口修改密码");
        }
        userDTO.setId(token.getUserDTO().getId());
        userService.updateById(userDTO);

        //更新token中缓存user
        userDTO =userService.getUserDetailById(userDTO.getId());
        token.setUserDTO(userDTO);
        tokenManager.updateToken(token);

        return JsonObjectUtils.buildSimpleObjectSuccess(null);
    }

    /**
     * 查询当前用户
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/user/detail",method = RequestMethod.GET)
    @ResponseBody
    @Authorization
    @JsonView(ResultView.DetailView.class)
    public JsonSimpleObject<UserDTO> getCurrentUser(@RequestAttribute(Constants.TAKEFREE_TOKEN) Token token) throws Exception{
        UserDTO userDTO = userService.getUserDetailById(token.getUserDTO().getId());
        if(userDTO == null){
            throw new SimpleHttpException(HttpStatus.NOT_FOUND,"user not found");
        }
        return JsonObjectUtils.buildSimpleObjectSuccess(userDTO);
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
    public JsonSimpleObject<UserInfo> getUserBrief(@PathVariable Long userId) throws Exception{
        UserInfo userInfo = userService.getUserInfoById(userId);
        if(userInfo == null){
            throw new SimpleHttpException(HttpStatus.NOT_FOUND,"user not found");
        }
        return JsonObjectUtils.buildSimpleObjectSuccess(userInfo);
    }
}
