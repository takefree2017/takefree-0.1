package com.takefree.controller;

import com.takefree.common.Exception.SimpleHttpException;
import com.takefree.common.annotation.Authorization;
import com.takefree.common.config.Constants;
import com.takefree.common.entry.JsonSimpleObject;
import com.takefree.common.entry.Token;
import com.takefree.common.util.JsonObjectUtils;
import com.takefree.common.web.constant.HttpStatus;
import com.takefree.dto.model.UserDTO;
import com.takefree.enums.UserLikeStautsEnum;
import com.takefree.enums.UserStatusEnum;
import com.takefree.pojo.model.UserLike;
import com.takefree.service.UserLikeService;
import com.takefree.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by gaoxiang on 2017/11/4.
 */
@Controller
@RequestMapping
public class UserLikeController {
    @Autowired
    private UserService userService;

    @Autowired
    private UserLikeService userLikeService;

    /**
     * 新建
     */
    @RequestMapping(value = "/userlike",method = RequestMethod.POST)
    @ResponseBody
    @Authorization
    public JsonSimpleObject<UserLike> createUserLike(@RequestAttribute(Constants.TAKEFREE_TOKEN) Token token, @RequestParam Long folleweeId) throws Exception{
        if(!folleweeId.equals(token.getUserDTO().getId())){
            throw new SimpleHttpException(HttpStatus.BAD_REQUEST, "不能关注自己");
        }

        UserDTO followee=userService.getUserInfoById(folleweeId);
        if(followee==null|| followee.getStatus() != UserStatusEnum.ACTIVE.getCode()){
            throw new SimpleHttpException(HttpStatus.BAD_REQUEST, "用户不存在");
        }

        UserLike userLike=null;
        if((userLike=userLikeService.getByFollowerAndFollowee(token.getUserDTO().getId(),folleweeId))!=null){ //已经关注过
            if( userLike.getStatus() .equals( UserLikeStautsEnum.ENABLE.getCode())) { //关注有效
                throw new SimpleHttpException(HttpStatus.BAD_REQUEST, "已经关注");
            }else{
                userLike.setStatus(UserLikeStautsEnum.ENABLE.getCode()); //关注已经取消
                userLikeService.update(userLike);
            }
        }else{
            userLike=new UserLike();
            userLike.setUserFollowerId(token.getUserDTO().getId());
            userLike.setUserFolloweeId(folleweeId);
            userLike.setStatus(UserLikeStautsEnum.ENABLE.getCode());
            userLikeService.create(userLike);
        }

        return JsonObjectUtils.buildSimpleObjectSuccess(userLike);
    }

    /**
     * 删除，非物理删除
     * @param token
     * @param id
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/userlike/{id}",method = RequestMethod.DELETE)
    @ResponseBody
    @Authorization
    public JsonSimpleObject<UserLike> deleteUserLike(@RequestAttribute(Constants.TAKEFREE_TOKEN) Token token, @PathVariable Long id) throws Exception{
        UserLike userLike=userLikeService.getById(id);
        if(userLike==null){
            throw new SimpleHttpException(HttpStatus.BAD_REQUEST, "未关注");
        }

        if(!userLike.getUserFollowerId().equals(token.getUserDTO().getId())){
            throw new SimpleHttpException(HttpStatus.FORBIDDEN, "无权限");
        }

        userLike.setStatus(UserLikeStautsEnum.DISABLE.getCode());
        int row=userLikeService.update(userLike);
        return JsonObjectUtils.buildSimpleObjectSuccess(null);
    }

    /**
     * @param token
     * @param folleweeId
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/userlike",method = RequestMethod.DELETE)
    @ResponseBody
    @Authorization
    public JsonSimpleObject<UserLike> deleteByFolloweeId(@RequestAttribute(Constants.TAKEFREE_TOKEN) Token token, @RequestParam Long folleweeId) throws Exception{
        UserLike userLike=userLikeService.getByFollowerAndFollowee(token.getUserDTO().getId(),folleweeId);
        if(userLike==null){
            throw new SimpleHttpException(HttpStatus.BAD_REQUEST, "未关注");
        }

        if(!userLike.getUserFollowerId().equals(token.getUserDTO().getId())){
            throw new SimpleHttpException(HttpStatus.FORBIDDEN, "无权限");
        }

        userLike.setStatus(UserLikeStautsEnum.DISABLE.getCode());
        int row=userLikeService.update(userLike);
        return JsonObjectUtils.buildSimpleObjectSuccess(null);
    }
}
