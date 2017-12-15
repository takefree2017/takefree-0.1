package com.takefree.controller;

import com.takefree.common.Exception.SimpleHttpException;
import com.takefree.common.annotation.Authorization;
import com.takefree.common.config.Constants;
import com.takefree.common.entry.JsonObjectList;
import com.takefree.common.entry.JsonSimpleObject;
import com.takefree.common.entry.Token;
import com.takefree.common.util.JsonObjectUtils;
import com.takefree.common.web.constant.HttpStatus;
import com.takefree.dto.model.ShowCommentDTO;
import com.takefree.pojo.model.OrderShow;
import com.takefree.pojo.model.ShowComment;
import com.takefree.service.ShowCommentService;
import com.takefree.service.OrderShowService;
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
    private ShowCommentService showCommentService;

    @Autowired
    private OrderShowService orderShowService;

    @RequestMapping(value = "/showcomment",method = RequestMethod.POST)
    @ResponseBody
    @Authorization
    public JsonSimpleObject<ShowComment> createShowComment(@RequestAttribute(Constants.TAKEFREE_TOKEN) Token token, @Valid @RequestBody ShowComment showComment) throws Exception{
        OrderShow orderShow=orderShowService.getShowInfoById(showComment.getShowId());
        if(orderShow==null){
            throw new SimpleHttpException(HttpStatus.BAD_REQUEST, "显摆不存在");
        }

        /**
         * TODO parentId检查
         */
        showComment.setUserId(token.getUserDTO().getId());
        showCommentService.create(showComment);
        return JsonObjectUtils.buildSimpleObjectSuccess(showComment);
    }

    /**
     * 删除
     */
    @RequestMapping(value = "/showcomment/{id}",method = RequestMethod.DELETE)
    @ResponseBody
    @Authorization
    public JsonSimpleObject deleteShowComment(@RequestAttribute(Constants.TAKEFREE_TOKEN) Token token,@PathVariable Long id) throws Exception{
        /**
         * TODO 权限检查
         */
        int row=showCommentService.delete(id);
        if(row==0) {
            throw new SimpleHttpException(HttpStatus.NOT_FOUND, "评论不存在");
        }else{
            return JsonObjectUtils.buildSimpleObjectSuccess(null);
        }
    }

    @RequestMapping(value = "/showcomment/{id}",method = RequestMethod.GET)
    @ResponseBody
    public JsonSimpleObject<ShowCommentDTO> getShowComment(@RequestAttribute(Constants.TAKEFREE_TOKEN) Token token,@PathVariable Long id) throws Exception{
        ShowCommentDTO showCommentDTO=showCommentService.get(id);
        if(showCommentDTO==null){
            throw new SimpleHttpException(HttpStatus.BAD_REQUEST, "评论不存在");
        }
        return JsonObjectUtils.buildSimpleObjectSuccess(showCommentDTO);
    }

    @RequestMapping(value = "/showcomment",method = RequestMethod.GET)
    @ResponseBody
    public JsonObjectList<ShowCommentDTO> getShowComments(@RequestAttribute(value=Constants.TAKEFREE_TOKEN,required = false) Token token, Integer pageNo, Integer pageSize, Long userId, Long showId) throws Exception{
        List<ShowCommentDTO> showLikeDTOs=showCommentService.getShowComments(pageNo, pageSize, showId, userId);
        return JsonObjectUtils.buildListSuccess(showLikeDTOs);
    }
}
