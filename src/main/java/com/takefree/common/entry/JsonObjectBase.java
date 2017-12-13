package com.takefree.common.entry;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonView;
import com.takefree.common.web.constant.HttpStatus;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author gaoxiang
 * @Description: JSON 基本类
 * @date 2016年9月12日 下午5:00:32
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class JsonObjectBase implements Serializable {

    private static final long serialVersionUID = 1L;

    @JsonView(ResultView.ResultDataView.class)
    private String status = HttpStatus.OK.code();

    @JsonView(ResultView.ResultDataView.class)
    private String message = "操作成功";

    @JsonView(ResultView.ResultDataView.class)
    private Date timestamp = new Date();

    @JsonView(ResultView.ResultDataView.class)
    private String info;

    public JsonObjectBase() {

    }

    @Override
    public String toString() {
        return "JsonObjectBase [message=" + message + ",  status=" + status + "]";
    }

}
