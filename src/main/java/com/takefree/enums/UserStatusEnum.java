package com.takefree.enums;

/**
 * Created by gaoxiang on 2017/11/14.
 */
public enum UserStatusEnum {
    NOT_ACTIVE("未激活",10),ACTIVE("已经激活",20);

    private String name ;
    private int code ;

    private UserStatusEnum(String name , int code ){
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
