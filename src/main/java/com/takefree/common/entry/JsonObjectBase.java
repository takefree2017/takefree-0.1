package com.takefree.common.entry;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonView;
import com.takefree.common.web.constant.HttpStatus;

import java.io.Serializable;

/**
 * @author gaoxiang
 * @Description: JSON 基本类
 * @date 2016年9月12日 下午5:00:32
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class JsonObjectBase implements Serializable {

    private static final long serialVersionUID = 1L;

    @JsonView(ResultView.ResultDataView.class)
    private String status = HttpStatus.OK.code();

    @JsonView(ResultView.ResultDataView.class)
    private String message = "操作成功";

    private long timestamp= System.currentTimeMillis();

    private String info;

    public JsonObjectBase() {

    }

    public JsonObjectBase(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "JsonObjectBase [message=" + message + ",  status=" + status + "]";
    }

}
