package com.takefree.controller;

import com.takefree.common.config.Constants;
import com.takefree.common.entry.JsonObjectBase;
import com.takefree.common.entry.JsonObjectList;
import com.takefree.common.util.JsonObjectUtils;
import com.takefree.common.web.constant.HttpStatus;
import com.takefree.pojo.model.ShareMode;
import com.takefree.service.ConfigurationService;
import com.takefree.service.ShareModeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by gaoxiang on 2017/11/4.
 */
@Controller
@RequestMapping(value = "sharemode")
public class ShareModeController {

    private Logger logger = LoggerFactory.getLogger(ShareModeController.class);
    @Autowired
    private ShareModeService shareModeService;

    @Autowired
    private ConfigurationService configurationService;

    /**
     * @param version
     * @return
     */
    @RequestMapping(value = "", method = RequestMethod.GET)
    @ResponseBody
    public JsonObjectList getAllCategoryInfo(@RequestParam(value = "version", required = false) Integer version) {
        String configVersionStr = configurationService.getConfiguration(Constants.CONFIG_SHARE_MOODE_VERION);

        if (version != null && configVersionStr != null) {
            Integer configVersion = -1;
            try {
                configVersion = Integer.valueOf(configVersionStr);
            } catch (NumberFormatException e) {
                logger.error("{} config error", Constants.CONFIG_SHARE_MOODE_VERION);
            }
            if (version > configVersion) {
                JsonObjectList jsonObjectList=JsonObjectUtils.buildListSuccess(null);
                jsonObjectList.setStatus(HttpStatus.NOT_MODIFIED.code());
                return jsonObjectList;
            }
        }
        return JsonObjectUtils.buildListSuccess(shareModeService.getShareModes());
    }
}
