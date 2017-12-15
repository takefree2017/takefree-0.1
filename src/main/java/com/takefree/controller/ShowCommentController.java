package com.takefree.controller;

import com.takefree.common.Exception.SimpleHttpException;
import com.takefree.common.annotation.Authorization;
import com.takefree.common.config.Constants;
import com.takefree.common.entry.JsonObjectList;
import com.takefree.common.entry.JsonSimpleObject;
import com.takefree.common.entry.Token;
import com.takefree.common.util.JsonObjectUtils;
import com.takefree.common.web.constant.HttpStatus;
import com.takefree.dto.model.ShareCommentDTO;
import com.takefree.dto.model.ShareDTO;
import com.takefree.pojo.model.ShareComment;
import com.takefree.service.ShareCommentService;
import com.takefree.service.ShareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by gaoxiang on 2017/11/4.
 */
@Controller
public class ShowCommentController {
    @Autowired
    private ShareCommentService shareCommentService;

    @Autowired
    private ShareService shareService;

    @RequestMapping(value = "/sharecomment",method = RequestMethod.POST)
    @ResponseBody
    @Authorization
    public JsonSimpleObject<ShareComment> createShareComment(@RequestAttribute(Constants.TAKEFREE_TOKEN) Token token, @Valid @RequestBody ShareComment shareComment) throws Exception{
        ShareDTO shareInfo=shareService.getShareInfoById(shareComment.getShareId());

        if(shareInfo==null){
            throw new SimpleHttpException(HttpStatus.BAD_REQUEST, "分享不存在");
        }

        shareComment.setUserId(token.getUserDTO().getId());
        shareCommentService.create(shareComment);
        return JsonObjectUtils.buildSimpleObjectSuccess(shareComment);
    }

    /**
     * 删除
     */
    @RequestMapping(value = "/sharecomment/{id}",method = RequestMethod.DELETE)
    @ResponseBody
    @Authorization
    public JsonSimpleObject deleteShareComment(@RequestAttribute(Constants.TAKEFREE_TOKEN) Token token,@PathVariable Long id) throws Exception{
        /**
         * TODO 权限检查
         */
        int row=shareCommentService.delete(id);
        if(row==0) {
            throw new SimpleHttpException(HttpStatus.NOT_FOUND, "未关注");
        }else{
            return JsonObjectUtils.buildSimpleObjectSuccess(null);
        }
    }


    @RequestMapping(value = "/sharecomment",method = RequestMethod.GET)
    @ResponseBody
    public JsonObjectList<ShareCommentDTO> getShareComments(@RequestAttribute(value=Constants.TAKEFREE_TOKEN,required = false) Token token, Integer pageNo, Integer pageSize, Long userId, Long shareId) throws Exception{

        List<ShareCommentDTO> shareLikeDTOs=shareCommentService.getShareComments(pageNo, pageSize, null, userId);
        return JsonObjectUtils.buildListSuccess(shareLikeDTOs);
    }
}
