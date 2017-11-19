package com.takefree.enums;

/**
 * Created by gaoxiang on 2017/11/14.
 */
public enum ShareStatusEnum {
    DRAFE("草稿",10),PUBLISH("发布中",20),FINISH("完成",30),DELETE("取消",40);

    private String name ;
    private int code ;

    private ShareStatusEnum( String name , int code ){
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
