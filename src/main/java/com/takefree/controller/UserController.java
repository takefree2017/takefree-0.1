package com.takefree.controller;

import com.fasterxml.jackson.annotation.JsonView;
import com.takefree.common.Exception.SimpleHttpException;
import com.takefree.common.annotation.Authorization;
import com.takefree.common.config.Constants;
import com.takefree.common.entry.*;
import com.takefree.common.service.TokenManager;
import com.takefree.common.util.JsonObjectUtils;
import com.takefree.common.util.Util;
import com.takefree.common.web.constant.HttpStatus;
import com.takefree.dto.model.UserDTO;
import com.takefree.service.UserService;
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
     *
     */
    @RequestMapping(value = "/user", method = RequestMethod.POST)
    @ResponseBody
    @Authorization
    @JsonView(ResultView.DetailView.class)
    public JsonSimpleObject<UserDTO> createUser(@RequestAttribute(Constants.TAKEFREE_TOKEN) Token token,@Valid @RequestBody UserDTO userDTO) throws Exception {
        //检查手机是否已经注册
        if (userService.getUserInfoByMobile(userDTO.getMobile()).size() > 0) {
            throw new SimpleHttpException(HttpStatus.BAD_REQUEST, "手机号已经注册");
        }
        userDTO.setEndorserId(token.getUserDTO().getId());
        userDTO.setPassword(Util.encryptPassword("123456"));
        boolean result = userService.create(userDTO);
        if (result) {
            return JsonObjectUtils.buildSimpleObjectSuccess(userDTO);
        } else {
            throw new SimpleHttpException(HttpStatus.INTERNAL_SERVER_ERROR, "创建失败，内部错误");
        }
    }

    /**
     * 登录
     *
     * @param httpServletResponse
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/login/password", method = RequestMethod.POST)
    @ResponseBody
    @JsonView(ResultView.DetailView.class)
    public JsonSimpleObject<Token> loginByPassword(@RequestParam String mobile, @RequestParam String password,
                                                   HttpServletResponse httpServletResponse) throws Exception {
        Token token = userService.loginByPassword(mobile, password);
        Cookie cookie=new Cookie(Constants.TAKEFREE_TOKEN, token.getToken());
        cookie.setPath("/");
        httpServletResponse.addCookie(cookie);
        return JsonObjectUtils.buildSimpleObjectSuccess(token);
    }

    /**
     * 登录
     * 首次登陆不默认激活,让前端调用修改接口决定是否激活
     * @param httpServletResponse
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/login/sms", method = RequestMethod.POST)
    @ResponseBody
    @JsonView(ResultView.DetailView.class)
    public JsonSimpleObject<Token> loginBySms(@RequestParam String mobile, @RequestParam String smsCode,
                                              HttpServletResponse httpServletResponse) throws Exception {
        Token token = userService.loginBySms(mobile, smsCode);
        Cookie cookie=new Cookie(Constants.TAKEFREE_TOKEN, token.getToken());
        cookie.setPath("/");
        httpServletResponse.addCookie(cookie);
        return JsonObjectUtils.buildSimpleObjectSuccess(token);
    }

    /**
     * 登录
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/login/sms", method = RequestMethod.GET)
    @ResponseBody
    public JsonObjectBase sendLoginSms(@RequestParam String mobile) throws Exception {
        if (userService.sendLoginSms(mobile)) {
            return JsonObjectUtils.buildSimpleObjectSuccess(null);
        } else {
            return JsonObjectUtils.buildError(HttpStatus.INTERNAL_SERVER_ERROR, "短信发送失败");
        }
    }

    /**
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/logout", method = RequestMethod.DELETE)
    @ResponseBody
    @Authorization
    public JsonSimpleObject<Token> logout(@RequestAttribute(Constants.TAKEFREE_TOKEN) Token token) throws Exception {
        userService.logout(token);
        return JsonObjectUtils.buildSimpleObjectSuccess("");
    }

    /**
     * 更新user
     *
     * @param userDTO,mobile和password不能通过本接口修改
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/user", method = RequestMethod.PUT)
    @ResponseBody
    @Authorization
    @JsonView(ResultView.DetailView.class)
    public JsonSimpleObject updateUser(@RequestAttribute(Constants.TAKEFREE_TOKEN) Token token,
                                   @RequestBody UserDTO userDTO) throws Exception {
        if (userDTO.getMobile() != null) {
            throw new SimpleHttpException(HttpStatus.FORBIDDEN, "不能通过此接口修改手机号");
        }
        if (userDTO.getPassword() != null) {
            userDTO.setPassword(Util.encryptPassword(userDTO.getPassword()));
            //throw new SimpleHttpException(HttpStatus.FORBIDDEN, "不能通过此接口修改密码");
        }
        userDTO.setId(token.getUserDTO().getId());
        int row=userService.updateById(userDTO);

        //更新token中缓存user
        userDTO = userService.getUserDetailById(userDTO.getId());
        token.setUserDTO(userDTO);
        tokenManager.updateToken(token);

        return JsonObjectUtils.buildSimpleObjectSuccess(null);
    }

    /**
     * 查询当前用户
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/user", method = RequestMethod.GET)
    @ResponseBody
    @Authorization
    @JsonView(ResultView.DetailView.class)
    public JsonSimpleObject<UserDTO> getCurrentUser(@RequestAttribute(Constants.TAKEFREE_TOKEN) Token token)
            throws Exception {
        UserDTO userDTO = userService.getUserDetailById(token.getUserDTO().getId());
        if (userDTO == null) {
            throw new SimpleHttpException(HttpStatus.NOT_FOUND, "user not found");
        }
        return JsonObjectUtils.buildSimpleObjectSuccess(userDTO);
    }

    /**
     * 查询用户基本信息
     * @param userId
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/user/brief/{userId}", method = RequestMethod.GET)
    @ResponseBody
    @JsonView(ResultView.BriefView.class)
    public JsonSimpleObject<UserDTO> getUserBrief(@PathVariable Long userId) throws Exception {
        UserDTO user = userService.getUserInfoById(userId);
        if (user == null) {
            throw new SimpleHttpException(HttpStatus.NOT_FOUND, "user not found");
        }
        return JsonObjectUtils.buildSimpleObjectSuccess(user);
    }

    /**
     * @param token
     * @param pageNo
     * @param pageSize
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/user/follower", method = RequestMethod.GET)
    @ResponseBody
    @JsonView(ResultView.UserFollowerView.class)
    @Authorization
    public JsonObjectList<UserDTO> getFollowers(@RequestAttribute(Constants.TAKEFREE_TOKEN) Token token, Integer pageNo,
                                               Integer pageSize) throws Exception {
        return JsonObjectUtils.buildListSuccess(
                userService.getFollowersByFolloweeId(pageNo, pageSize, token.getUserDTO().getId()));
    }

    /**
     * @param token
     * @param pageNo
     * @param pageSize
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/user/followee", method = RequestMethod.GET)
    @ResponseBody
    @JsonView(ResultView.BriefView.class)
    @Authorization
    public JsonObjectList<UserDTO> getFollowees(@RequestAttribute(Constants.TAKEFREE_TOKEN) Token token, Integer pageNo,
                                               Integer pageSize) throws Exception {
        return JsonObjectUtils.buildListSuccess(
                userService.getFolloweesByFollowerId(pageNo, pageSize, token.getUserDTO().getId()));
    }
}
