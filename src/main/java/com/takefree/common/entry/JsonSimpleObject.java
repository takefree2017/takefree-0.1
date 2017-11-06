package com.takefree.common.entry;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonView;

@JsonIgnoreProperties(ignoreUnknown = true)
public class JsonSimpleObject<T> extends JsonObjectBase {
    private static final long serialVersionUID = 1L;

    @JsonView(ResultView.ResultDataView.class)
    private T result;

    public JsonSimpleObject() {
        super();
    }

    public JsonSimpleObject(T result) {
        super();
        this.result=result;
    }


    @Override
    public String toString() {
        return "JsonSimpleObject [result=" + result + "]";
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

}
