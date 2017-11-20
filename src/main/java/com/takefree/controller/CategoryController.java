package com.takefree.controller;

import com.takefree.common.entry.JsonObjectBase;
import com.takefree.common.util.JsonObjectUtils;
import com.takefree.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by gaoxiang on 2017/11/4.
 */
@Controller
@RequestMapping(value = "category")
public class CategoryController {
    @Autowired
    CategoryService categoryService;
    /**
     *
     * @param version
     * @return
     */
    @RequestMapping(value = "",method = RequestMethod.GET)
    @ResponseBody
    public JsonObjectBase getAllCategoryInfo(Integer version){
//        if(version!=null){
//            if(version>=lastVersion) {
//                JsonObjectBase jsonObjectBase = JsonObjectUtils.buildSimpleObjectSuccess("").setStatus(
//                        HttpStatus.NOT_MODIFIED);
//                return jsonObjectBase;
//            }
//        }
        return JsonObjectUtils.buildSimpleObjectSuccess(categoryService.getAll());
    }
}
