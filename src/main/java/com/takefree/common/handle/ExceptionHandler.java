package com.takefree.common.handle;

import com.takefree.common.Exception.SimpleHttpException;
import com.takefree.common.util.JsonObjectUtils;
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
        LOG.warn(request.getRequestURI() + " ExceptionHandler FOUND. "  + e.toString(),e);
        if (e instanceof TypeMismatchException) {
            return JsonObjectUtils.buildError(HttpStatus.BAD_REQUEST, ((TypeMismatchException) e).getPropertyName() + " parameter type error!");
        } else if (e instanceof InvalidPropertyException) {
            return JsonObjectUtils.buildError(HttpStatus.BAD_REQUEST, ((InvalidPropertyException) e).getPropertyName() + " parameter cannot find!");
        } else if (e instanceof BindException) {
            return getParamErrors(((BindException) e)
                    .getBindingResult());
        } else if (e instanceof MethodArgumentNotValidException) {
            return getParamErrors(((MethodArgumentNotValidException) e)
                    .getBindingResult());
        } else if (e instanceof HttpRequestMethodNotSupportedException) {
            return JsonObjectUtils.buildError(HttpStatus.METHOD_NOT_ALLOWED);
        } else if (e instanceof MissingServletRequestParameterException) {
            return JsonObjectUtils.buildError(HttpStatus.BAD_REQUEST,
                    e.getMessage());
        } else if (e instanceof HttpMessageConversionException){
            return JsonObjectUtils.buildError(HttpStatus.BAD_REQUEST,
                    "request body error!");
        } else if (e instanceof SimpleHttpException){
            return JsonObjectUtils.JsonObjectError2ModelView(((SimpleHttpException) e).getError());
        } else {
            return JsonObjectUtils.buildError(HttpStatus.INTERNAL_SERVER_ERROR, e.getMessage());
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
        return JsonObjectUtils.buildError(HttpStatus.BAD_REQUEST, errorMessage.toString());
    }
}
