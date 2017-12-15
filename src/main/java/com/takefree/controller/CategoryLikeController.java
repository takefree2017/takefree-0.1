package com.takefree.controller;

import com.takefree.common.Exception.SimpleHttpException;
import com.takefree.common.annotation.Authorization;
import com.takefree.common.config.Constants;
import com.takefree.common.entry.JsonObjectList;
import com.takefree.common.entry.JsonSimpleObject;
import com.takefree.common.entry.Token;
import com.takefree.common.util.JsonObjectUtils;
import com.takefree.common.web.constant.HttpStatus;
import com.takefree.pojo.model.CategoryInfo;
import com.takefree.pojo.model.CategoryLike;
import com.takefree.service.CategoryLikeService;
import com.takefree.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by gaoxiang on 2017/11/4.
 */
@Controller
@RequestMapping
public class CategoryLikeController {
    @Autowired
    private CategoryLikeService categoryLikeService;

    @Autowired
    private CategoryService categoryService;

    @RequestMapping(value = "/categorylike",method = RequestMethod.POST)
    @ResponseBody
    @Authorization
    public JsonSimpleObject<CategoryLike> createCategoryLike(@RequestAttribute(Constants.TAKEFREE_TOKEN) Token token, @RequestParam Long categoryId) throws Exception{
        CategoryInfo categoryInfo=categoryService.getCategoryInfoById(categoryId);

        if(categoryInfo==null){
            throw new SimpleHttpException(HttpStatus.BAD_REQUEST, "分类不存在");
        }

        if(categoryLikeService.getCount(categoryId,token.getUserDTO().getId())>0){
            throw new SimpleHttpException(HttpStatus.BAD_REQUEST, "已经关注");
        }

        CategoryLike categoryLike=new CategoryLike();
        categoryLike.setUserId(token.getUserDTO().getId());
        categoryLike.setCategoryId(categoryId);
        categoryLikeService.create(categoryLike);
        return JsonObjectUtils.buildSimpleObjectSuccess(categoryLike);
    }

    @RequestMapping(value = "/categorylike",method = RequestMethod.DELETE)
    @ResponseBody
    @Authorization
    public JsonSimpleObject deleteCategoryLike(@RequestAttribute(Constants.TAKEFREE_TOKEN) Token token,@RequestParam Long categoryId) throws Exception{
        /**
         * TODO 权限校验
         */
        int row=categoryLikeService.delete(categoryId,token.getUserDTO().getId());
        if(row==0) {
            throw new SimpleHttpException(HttpStatus.NOT_FOUND, "未关注");
        }else{
            return JsonObjectUtils.buildSimpleObjectSuccess(null);
        }
    }


    @RequestMapping(value = "/categorylike",method = RequestMethod.GET)
    @ResponseBody
    public JsonObjectList<CategoryLike> getCategoryLikes(@RequestAttribute(value=Constants.TAKEFREE_TOKEN,required = false) Token token, Integer pageNo, Integer pageSize, Long userId) throws Exception{
//        if(userId!=null){
//            if(token==null||!token.getUserDTO().getId().equals(userId)){
//                throw new SimpleHttpException(HttpStatus.UNAUTHORIZED, "Unauthorized");
//            }
//        }

        List<CategoryLike> showLikeDTOs=categoryLikeService.getCategoryLikes(pageNo, pageSize, null,  userId);
        return JsonObjectUtils.buildListSuccess(showLikeDTOs);
    }
}
