package com.takefree.common.handle;

import com.takefree.common.Exception.SimpleHttpException;
import com.takefree.common.entry.JsonObjectError;
import com.takefree.common.web.constant.HttpStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.InvalidPropertyException;
import org.springframework.beans.TypeMismatchException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.http.converter.HttpMessageConversionException;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Service
@ControllerAdvice
public class ExceptionHandler extends SimpleMappingExceptionResolver
        implements
        ApplicationContextAware {

    protected static final Logger LOG = LoggerFactory
            .getLogger(ExceptionHandler.class);

    protected ApplicationContext context;

    public void setApplicationContext(ApplicationContext arg0)
            throws BeansException {
        this.context = arg0;
    }

    @org.springframework.web.bind.annotation.ExceptionHandler
    public ModelAndView resolveException(HttpServletRequest request,
                                         HttpServletResponse response, Object o, Exception e) {
        LOG.warn( " ExceptionHandler!"  + request.getRequestURI() +" "+ e.toString());
        if (e instanceof SimpleHttpException){
            SimpleHttpException simpleHttpException=(SimpleHttpException) e;
            return buildError(simpleHttpException.getHttpStatus(),simpleHttpException.getMesasge());
        }

        LOG.error("",e);

        if (e instanceof TypeMismatchException) {
            return buildError(HttpStatus.BAD_REQUEST, ((TypeMismatchException) e).getPropertyName() + " parameter type error!");
        }

        if (e instanceof InvalidPropertyException) {
            return buildError(HttpStatus.BAD_REQUEST, ((InvalidPropertyException) e).getPropertyName() + " parameter cannot find!");
        }

        if (e instanceof BindException) {
            return getParamErrors(((BindException) e)
                    .getBindingResult());
        }

        if (e instanceof MethodArgumentNotValidException) {
            return getParamErrors(((MethodArgumentNotValidException) e)
                    .getBindingResult());
        }

        if (e instanceof HttpRequestMethodNotSupportedException) {
            return buildError(HttpStatus.METHOD_NOT_ALLOWED);
        }

        if (e instanceof MissingServletRequestParameterException) {
            return buildError(HttpStatus.BAD_REQUEST,
                    e.getMessage());
        }

        if (e instanceof HttpMessageConversionException){
            return buildError(HttpStatus.BAD_REQUEST,
                    "request body error!");
        }

        {
            return buildError(HttpStatus.INTERNAL_SERVER_ERROR, "内部错误");
        }
    }

    /**
     * 从bindException中获取到参数错误类型，参数错误
     */
    public static ModelAndView getParamErrors(BindingResult bindingResult) {
        StringBuilder errorMessage = new StringBuilder();
        for (Object error : bindingResult.getAllErrors()) {
            if (error instanceof FieldError) {
                FieldError fe = (FieldError) error;
                String field = fe.getField();
                errorMessage.append(field);
                errorMessage.append(":");
                errorMessage.append(fe.getDefaultMessage());
                errorMessage.append(".");
            }
        }
        return buildError(HttpStatus.BAD_REQUEST, errorMessage.toString());
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

        LOG.debug(error.toString());

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

        LOG.debug(error.toString());

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
