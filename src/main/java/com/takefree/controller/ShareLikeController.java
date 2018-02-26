package com.takefree.controller;

import com.takefree.common.Exception.SimpleHttpException;
import com.takefree.common.annotation.Authorization;
import com.takefree.common.config.Constants;
import com.takefree.common.entry.JsonObjectList;
import com.takefree.common.entry.JsonSimpleObject;
import com.takefree.common.entry.Token;
import com.takefree.common.util.JsonObjectUtils;
import com.takefree.common.web.constant.HttpStatus;
import com.takefree.dto.model.ShareDTO;
import com.takefree.dto.model.ShareLikeDTO;
import com.takefree.pojo.model.ShareLike;
import com.takefree.service.ShareLikeService;
import com.takefree.service.ShareService;
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
        }

//        else if(shareInfo.getOwnerId().equals(token.getUserDTO().getId())){
//            throw new SimpleHttpException(HttpStatus.FORBIDDEN, "不能like本人分享");
//        }
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
    public JsonSimpleObject deleteShareLike(@RequestAttribute(Constants.TAKEFREE_TOKEN) Token token,@RequestParam Long shareId) throws Exception{
        int row=shareLikeService.delete(shareId,token.getUserDTO().getId());
        if(row==0) {
            throw new SimpleHttpException(HttpStatus.NOT_FOUND, "未like");
        }else{
            return JsonObjectUtils.buildSimpleObjectSuccess(null);
        }
    }


    @RequestMapping(value = "/sharelike",method = RequestMethod.GET)
    @ResponseBody
    public JsonObjectList<ShareLikeDTO> getShareLikes(@RequestAttribute(value=Constants.TAKEFREE_TOKEN,required = false) Token token, Integer pageNo, Integer pageSize, Long userId, Long shareId) throws Exception{
        if(userId!=null){
            if(token==null||!token.getUserDTO().getId().equals(userId)){
                throw new SimpleHttpException(HttpStatus.UNAUTHORIZED, "Unauthorized");
            }
        }

        List<ShareLikeDTO> shareLikeDTOs=shareLikeService.getShareLikes(pageNo, pageSize, null, shareId, userId);
        return JsonObjectUtils.buildListSuccess(shareLikeDTOs);
    }
}
