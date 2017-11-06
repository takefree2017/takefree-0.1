package com.takefree.common.util;

import com.takefree.common.entry.JsonObjectError;
import com.takefree.common.entry.JsonObjectList;
import com.takefree.common.entry.JsonSimpleObject;
import com.takefree.common.web.constant.HttpStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import java.util.List;

/**
 * 通用的JSON返回器
 */
@Component
public class JsonObjectUtils {
    protected static final Logger LOG = LoggerFactory.getLogger(JsonObjectUtils.class);

    /**
     * 返回正确(顶层结构), 非列表请求
     *
     * @param value
     *
     * @return
     */
    public static <T>JsonSimpleObject buildSimpleObjectSuccess(T value) {

        JsonSimpleObject json = new JsonSimpleObject();

        json.setResult(value);

        LOG.info(json.toString());

        return json;
    }

    /**
     * 返回正确, 列表请求
     *
     * @param value
     *
     * @return
     */
    public static <T>JsonObjectList buildListSuccess(List<T> value) {

        JsonObjectList json = new JsonObjectList();

        json.addData(value);

        LOG.info(json.toString());

        return json;
    }



    /**
     * 返回异常
     *
     * @return
     */
    public static ModelAndView buildError(HttpStatus httpStatus) {

        JsonObjectError error = new JsonObjectError();

        error.setStatus(httpStatus.code());

        error.setMessage(httpStatus.getReasonPhrase());

        LOG.info(error.toString());

        return JsonObjectError2ModelView(error);
    }

    /**
     * 返回异常
     *
     * @return
     */
    public static ModelAndView buildError(HttpStatus httpStatus, String errorMsg) {

        JsonObjectError error = new JsonObjectError();

        error.setStatus(httpStatus.code());

        error.setMessage(errorMsg);

        LOG.info(error.toString());

        return JsonObjectError2ModelView(error);
    }

    /**
     */
    public static ModelAndView JsonObjectError2ModelView(JsonObjectError json) {
        ModelAndView model = new ModelAndView(new MappingJackson2JsonView());
        model.addObject("message", json.getMessage());
        model.addObject("status", json.getStatus());

        return model;
    }

}
