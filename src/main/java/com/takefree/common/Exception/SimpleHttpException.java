package com.takefree.common.Exception;

import com.takefree.common.vo.JsonObjectError;

/**
 * Created by gaoxiang on 2017/7/11.
 */
public class SimpleHttpException extends Exception{
    JsonObjectError error;

    public SimpleHttpException(JsonObjectError error){
        super(error.getMessage());
        this.error=error;
    }

    public JsonObjectError getError() {
        return error;
    }

    public void setError(JsonObjectError error) {
        this.error = error;
    }

}
