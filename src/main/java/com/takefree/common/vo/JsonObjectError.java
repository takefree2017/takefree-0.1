package com.takefree.common.vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonView;
import com.takefree.common.web.constant.HttpStatus;

@JsonIgnoreProperties(ignoreUnknown = true)
public class JsonObjectError extends JsonObjectBase {
    private static final long serialVersionUID = 1L;

    @JsonView(ResultView.ResultStatusView.class)
    private String status = HttpStatus.INTERNAL_SERVER_ERROR.code();

    public JsonObjectError() {
        super();
    }

    public JsonObjectError(String status,String message) {
        super();
        this.status=status;
        this.setMessage(message);
    }

    public JsonObjectError(HttpStatus status,String message) {
        super();
        this.status=status.code();
        this.setMessage(message);
    }

}
