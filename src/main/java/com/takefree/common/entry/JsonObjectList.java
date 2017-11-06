package com.takefree.common.entry;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonView;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class JsonObjectList<T> extends JsonObjectBase {

    private static final long serialVersionUID = 1L;

    @JsonView(ResultView.ResultDataView.class)
    private List<T> result;

    public JsonObjectList() {
        super();
    }

    public JsonObjectList(List<T> result) {
        super();
        this.result=result;
    }

    public void addData(List<T> valueList) {
        result=valueList;
    }

    public List<T> getResult() {
        return result;
    }

    public void setResult(List<T> result) {
        this.result = result;
    }

}
