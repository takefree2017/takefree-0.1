package com.takefree.controller;

import com.takefree.common.entry.JsonObjectBase;
import com.takefree.common.util.JsonObjectUtils;
import com.takefree.common.web.constant.HttpStatus;
import com.takefree.service.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by gaoxiang on 2017/11/4.
 */
@Controller
@RequestMapping(value = "/region")
public class RegionController {
    @Autowired
    RegionService regionService;

    
    @Value("${takefree.regioninfo.version}")
 	private int lastVersion;
     
     /**
      *
      * @param version
      * @return
      */
     @RequestMapping(value = "",method = RequestMethod.GET)
     @ResponseBody
     public JsonObjectBase getAllRegionInfo(@RequestParam(value="version",required=false)Integer version){
         if(version!=null){
         	
             if(version>=lastVersion) {
                 JsonObjectBase jsonObjectBase = JsonObjectUtils.buildSimpleObjectSuccess("");
                 jsonObjectBase.setStatus(HttpStatus.NOT_MODIFIED.code());
                 return jsonObjectBase;
             }
         }
         return JsonObjectUtils.buildSimpleObjectSuccess(regionService.getAll());
   
     }
}
