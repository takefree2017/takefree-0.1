package com.takefree.controller;

import com.takefree.common.config.Config;
import com.takefree.common.entry.JsonObjectList;
import com.takefree.common.util.JsonObjectUtils;
import com.takefree.pojo.model.Configuration;
import com.takefree.service.ConfigurationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by gaoxiang on 2017/11/4.
 */
@Controller
@RequestMapping
public class CommonController {
    @Autowired
    Config config;

    @Autowired
    private ConfigurationService configurationService;

    /**
     *
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/config",method = RequestMethod.GET)
    @ResponseBody
    public JsonObjectList<Configuration> getConfig() throws Exception{
        return JsonObjectUtils.buildListSuccess(configurationService.getConfigurations());
    }

    /**
     *
     * @param number
     * @param space "share","rate","common"
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/filename",method = RequestMethod.GET)
    @ResponseBody
    public JsonObjectList<String> getPictureNames(Integer number,String space) throws Exception{
        List<String> ids=new ArrayList<String>();
        if(number==null){
            number=1;
        }
        if(space==null){
            space="";
        }else{
            space=space+"/";
        }
        for(int i=0;i<number;i++){
            ids.add(config.getPictureBaseSpace()+space+UUID.randomUUID().toString().replace("-", ""));
        }

        return JsonObjectUtils.buildListSuccess(ids);
    }
}
