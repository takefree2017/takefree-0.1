package com.takefree.controller;

import com.takefree.common.entry.JsonObjectList;
import com.takefree.common.util.JsonObjectUtils;
import com.takefree.pojo.model.RegionInfo;
import com.takefree.service.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by gaoxiang on 2017/11/4.
 */
@Controller
@RequestMapping(value = "/regioninfo")
public class RegionController {
    @Autowired
    RegionService regionService;

    /**
     *
     * @return
     */
    @RequestMapping(value = "",method = RequestMethod.GET)
    @ResponseBody
    public JsonObjectList<RegionInfo> getAllRegionInfo(){
        return JsonObjectUtils.buildListSuccess(regionService.getAll());
    }
}
