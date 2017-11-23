package com.takefree.controller;

import com.takefree.common.Exception.SimpleHttpException;
import com.takefree.common.annotation.Authorization;
import com.takefree.common.config.Constants;
import com.takefree.common.entry.JsonSimpleObject;
import com.takefree.common.entry.Token;
import com.takefree.common.util.JsonObjectUtils;
import com.takefree.common.web.constant.HttpStatus;
import com.takefree.pojo.model.ShareLike;
import com.takefree.service.ShareLikeService;
import com.takefree.service.ShareService;
import org.apache.logging.log4j.core.config.plugins.validation.constraints.Required;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by gaoxiang on 2017/11/4.
 */
@Controller
@RequestMapping(value = "/like/share")
public class ShareLikeController {
    @Autowired
    private ShareLikeService shareLikeService;

    @Autowired
    private ShareService shareService;

    /**
     * 新建
     */
    @RequestMapping(value = "",method = RequestMethod.POST)
    @ResponseBody
    @Authorization
    public JsonSimpleObject<ShareLike> create(@RequestAttribute(Constants.TAKEFREE_TOKEN) Token token,@RequestParam Long shareId) throws Exception{
        if(shareService.getShareInfoById(shareId)==null){
            throw new SimpleHttpException(HttpStatus.BAD_REQUEST, "分享不存在");
        }
        if(shareLikeService.getCount(shareId,token.getUserDTO().getId())>0){
            throw new SimpleHttpException(HttpStatus.BAD_REQUEST, "已经关注");
        }

        ShareLike shareLike=new ShareLike();
        shareLike.setUserId(token.getUserDTO().getId());
        shareLike.setShareId(shareId);
        shareLike=shareLikeService.create(shareLike);
        return JsonObjectUtils.buildSimpleObjectSuccess(shareLike);
    }

    /**
     * 删除
     */
    @RequestMapping(value = "",method = RequestMethod.DELETE)
    @ResponseBody
    @Authorization
    public JsonSimpleObject delete(@RequestAttribute(Constants.TAKEFREE_TOKEN) Token token,@RequestParam Long shareId) throws Exception{
        if(shareLikeService.getCount(shareId,token.getUserDTO().getId())==0){
            throw new SimpleHttpException(HttpStatus.BAD_REQUEST, "未关注");
        }
        shareLikeService.delete(shareId,token.getUserDTO().getId());
        return JsonObjectUtils.buildSimpleObjectSuccess(null);
    }

}
