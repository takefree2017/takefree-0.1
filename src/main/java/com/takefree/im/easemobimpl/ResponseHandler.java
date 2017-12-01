package com.takefree.im.easemobimpl;

import com.google.gson.Gson;
import com.takefree.common.entry.JsonObjectBase;
import com.takefree.common.util.JsonObjectUtils;
import com.takefree.common.web.constant.HttpStatus;
import com.takefree.im.EasemobAPI;

import io.swagger.client.ApiException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * Created by easemob on 2017/3/16.
 */
public class ResponseHandler {
    private static final Logger logger = LoggerFactory.getLogger(ResponseHandler.class);

    public JsonObjectBase handle(EasemobAPI easemobAPI) {
        Object result = null;
        JsonObjectBase jresult = null;
        try {
        	result = easemobAPI.invokeEasemobAPI();
        	jresult = JsonObjectUtils.buildSimpleObjectSuccess(result);
        } catch (ApiException e) {
        	String errMsg;
            if (e.getCode() == 401) {
            	errMsg = "The current token is invalid, re-generating token for you and calling it again";
                logger.info(errMsg);
                TokenUtil.initTokenByProp();
                try {//401需要重新请求token,重连
                    result = easemobAPI.invokeEasemobAPI();
                    jresult = JsonObjectUtils.buildSimpleObjectSuccess(result);
                    return jresult;
                } catch (ApiException e1) {
                    logger.error(e1.getMessage());
                    jresult = JsonObjectUtils.buildError(HttpStatus.valueOf(e.getCode()), errMsg);
                    return jresult; 
                }
            }else if (e.getCode() == 429) {
            	errMsg = "The api call is too frequent";
                logger.warn(errMsg);
                
            }else if (e.getCode() >= 500) {
            	errMsg = "The server may be faulty. Please try again later";
                logger.error(errMsg);
            }else {
            	Gson gson = new Gson();
                Map<String, String> map = gson.fromJson(e.getResponseBody(), Map.class);
                logger.error("error_code:{} error_msg:{} error_desc:{}", e.getCode(), e.getMessage(), map.get("error_description"));
                errMsg = e.getMessage();
            }
            jresult = JsonObjectUtils.buildError(HttpStatus.valueOf(e.getCode()), errMsg);
            return jresult; 
        }
        return jresult;
    }

    public Object retry(EasemobAPI easemobAPI) {
        Object result = null;
        long time = 5;
        for (int i = 0; i < 3; i++) {
            try {
                TimeUnit.SECONDS.sleep(time);
                logger.info("Reconnection is in progress..." + i);
                result = easemobAPI.invokeEasemobAPI();
                if (result != null) {
                    return result;
                }
            } catch (ApiException e1) {
                time *= 3;
            } catch (InterruptedException e1) {
                logger.error(e1.getMessage());
            }
        }
        return result;
    }
}
