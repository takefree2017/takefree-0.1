package com.takefree.enums;

/**
 * Created by gaoxiang on 2017/11/14.
 */
public enum LogisticsStatusEnum {
    NO("无物流单",10),YES("有物流单",20);

    private String name ;
    private int code ;

    private LogisticsStatusEnum(String name , int code ){
        this.name = name ;
        this.code = code ;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }
}
