package com.takefree.common.Exception;

import com.takefree.common.web.constant.HttpStatus;

/**
 * Created by gaoxiang on 2017/7/11.
 */
public class SimpleHttpException extends Exception {
    private HttpStatus httpStatus;
    private String     mesasge;

    public SimpleHttpException(HttpStatus httpStatus, String message) {
        super(message);
        this.httpStatus = httpStatus;
        this.mesasge = message;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
    }

    public String getMesasge() {
        return mesasge;
    }

    public void setMesasge(String mesasge) {
        this.mesasge = mesasge;
    }

}
