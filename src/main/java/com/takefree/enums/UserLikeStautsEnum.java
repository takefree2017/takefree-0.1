package com.takefree.enums;

/**
 * Created by gaoxiang on 2017/11/14.
 */
public enum UserLikeStautsEnum {
    ENABLE("关注",1),DISABLE("取消关注",0);

    private String name ;
    private int code ;

    private UserLikeStautsEnum(String name , int code ){
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
