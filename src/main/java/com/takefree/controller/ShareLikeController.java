package com.takefree.controller;

import com.fasterxml.jackson.annotation.JsonView;
import com.takefree.common.Exception.SimpleHttpException;
import com.takefree.common.annotation.Authorization;
import com.takefree.common.config.Constants;
import com.takefree.common.entry.JsonObjectList;
import com.takefree.common.entry.JsonSimpleObject;
import com.takefree.common.entry.ResultView;
import com.takefree.common.entry.Token;
import com.takefree.common.util.JsonObjectUtils;
import com.takefree.common.web.constant.HttpStatus;
import com.takefree.dto.model.ShareDTO;
import com.takefree.pojo.model.ShareLike;
import com.takefree.service.ShareLikeService;
import com.takefree.service.ShareService;
import org.apache.logging.log4j.core.config.plugins.validation.constraints.Required;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by gaoxiang on 2017/11/4.
 */
@Controller
@RequestMapping
public class ShareLikeController {
    @Autowired
    private ShareLikeService shareLikeService;

    @Autowired
    private ShareService shareService;

    /**
     * 新建
     */
    @RequestMapping(value = "/sharelike",method = RequestMethod.POST)
    @ResponseBody
    @Authorization
    public JsonSimpleObject<ShareLike> createShareLike(@RequestAttribute(Constants.TAKEFREE_TOKEN) Token token,@RequestParam Long shareId) throws Exception{
        ShareDTO shareInfo=shareService.getShareInfoById(shareId);

        if(shareInfo==null){
            throw new SimpleHttpException(HttpStatus.BAD_REQUEST, "分享不存在");
        }else if(shareInfo.getOwnerId().equals(token.getUserDTO().getId())){
            throw new SimpleHttpException(HttpStatus.BAD_REQUEST, "不能like本人分享");
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
    @RequestMapping(value = "/sharelike",method = RequestMethod.DELETE)
    @ResponseBody
    @Authorization
    public JsonSimpleObject deleteShareLike(@RequestAttribute(Constants.TAKEFREE_TOKEN) Token token,@Required Long shareId) throws Exception{
        if(shareLikeService.getCount(shareId,token.getUserDTO().getId())==0){
            throw new SimpleHttpException(HttpStatus.BAD_REQUEST, "未关注");
        }
        shareLikeService.delete(shareId,token.getUserDTO().getId());
        return JsonObjectUtils.buildSimpleObjectSuccess(null);
    }

    /**
     * 获取用户喜欢的分享
     * @param token
     * @param pageNo 可选
     * @param pageSize 可选
     * @param shareStatus 10(草稿),20(发布中),30(已完成),40(作废)
     * @param ownerId 可选
     * @return
     * @throws Exception
     */
    @JsonView(ResultView.BriefView.class)
    @RequestMapping(value = "/sharelike/share",method = RequestMethod.GET)
    @ResponseBody
    @Authorization
    public JsonObjectList<ShareDTO> getUserLikeShareInfos(@RequestAttribute(Constants.TAKEFREE_TOKEN) Token token, Integer pageNo, Integer pageSize, Integer shareStatus, Long ownerId) throws Exception{
        List<ShareDTO> shareDTOS=shareLikeService.getUserLikeShareInfos(pageNo, pageSize, token.getUserDTO().getId(), ownerId, shareStatus);
        return JsonObjectUtils.buildListSuccess(shareDTOS);
    }

}
