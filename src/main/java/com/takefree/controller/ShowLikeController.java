package com.takefree.controller;

import com.takefree.common.Exception.SimpleHttpException;
import com.takefree.common.annotation.Authorization;
import com.takefree.common.config.Constants;
import com.takefree.common.entry.JsonObjectList;
import com.takefree.common.entry.JsonSimpleObject;
import com.takefree.common.entry.Token;
import com.takefree.common.util.JsonObjectUtils;
import com.takefree.common.web.constant.HttpStatus;
import com.takefree.dto.model.ShowLikeDTO;
import com.takefree.pojo.model.OrderShow;
import com.takefree.pojo.model.ShowLike;
import com.takefree.service.OrderShowService;
import com.takefree.service.ShowLikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by gaoxiang on 2017/11/4.
 */
@Controller
@RequestMapping
public class ShowLikeController {
    @Autowired
    private ShowLikeService showLikeService;

    @Autowired
    private OrderShowService orderShowService;

    /**
     *
     * @param token
     * @param showId
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/showlike",method = RequestMethod.POST)
    @ResponseBody
    @Authorization
    public JsonSimpleObject<ShowLike> createShowLike(@RequestAttribute(Constants.TAKEFREE_TOKEN) Token token,@RequestParam Long showId) throws Exception{
        OrderShow orderShow=orderShowService.getShowInfoById(showId);

        if(orderShow==null){
            throw new SimpleHttpException(HttpStatus.BAD_REQUEST, "显摆不存在");
        }

        if(showLikeService.getCount(showId,token.getUserDTO().getId())>0){
            throw new SimpleHttpException(HttpStatus.BAD_REQUEST, "已经关注");
        }

        ShowLike showLike=new ShowLike();
        showLike.setUserId(token.getUserDTO().getId());
        showLike.setShowId(showId);
        showLike=showLikeService.create(showLike);
        return JsonObjectUtils.buildSimpleObjectSuccess(showLike);
    }

    /**
     * 删除
     */
    @RequestMapping(value = "/showlike",method = RequestMethod.DELETE)
    @ResponseBody
    @Authorization
    public JsonSimpleObject deleteShowLike(@RequestAttribute(Constants.TAKEFREE_TOKEN) Token token,@RequestParam Long showId) throws Exception{
        if(showLikeService.getCount(showId,token.getUserDTO().getId())==0){
            throw new SimpleHttpException(HttpStatus.BAD_REQUEST, "未关注");
        }
        showLikeService.delete(showId,token.getUserDTO().getId());
        return JsonObjectUtils.buildSimpleObjectSuccess(null);
    }


    @RequestMapping(value = "/showlike",method = RequestMethod.GET)
    @ResponseBody
    public JsonObjectList<ShowLikeDTO> getShowLikes(@RequestAttribute(value=Constants.TAKEFREE_TOKEN,required = false) Token token, Integer pageNo, Integer pageSize, Long userId, Long showId) throws Exception{
//        if(userId!=null){
//            if(token==null||!token.getUserDTO().getId().equals(userId)){
//                throw new SimpleHttpException(HttpStatus.UNAUTHORIZED, "Unauthorized");
//            }
//        }

        List<ShowLikeDTO> showLikeDTOs=showLikeService.getShowLikeDTOs(pageNo, pageSize, null, showId, userId);
        return JsonObjectUtils.buildListSuccess(showLikeDTOs);
    }
}
