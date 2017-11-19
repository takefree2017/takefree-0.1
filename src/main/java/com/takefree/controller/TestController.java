package com.takefree.controller;

import com.takefree.common.entry.JsonSimpleObject;
import com.takefree.dataobject.CategoryInfoObject;
import com.takefree.dataobject.RegionInfoObject;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.takefree.service.CategoryInfoService;
import com.takefree.service.RegionInfoService;

//@SpringBootApplication
@RestController
@RequestMapping("/test")
public class TestController {
    
    @Autowired
    private RegionInfoService regionInfoService;
    @Autowired
    private CategoryInfoService categoryInfoService;

    //取全国layer(含)级以上所有地区编码,10省 20省市 30省市县
    @RequestMapping(value = "/regioninfo/{layer}",method = RequestMethod.GET)
    @ResponseBody
    public List<RegionInfoObject> getAllRegionInfo(@PathVariable int layer){
        return regionInfoService.getAll(layer);
    }
    
    //取layer(含)级以上所有物品分类,10一级分类 20一二级分类 30一二三级分类
    @RequestMapping(value = "/categoryinfo/{layer}",method = RequestMethod.GET)
    @ResponseBody
    public List<CategoryInfoObject> getAllCategoryInfo(@PathVariable int layer){
        return categoryInfoService.getAll(layer);
    }
    
}
