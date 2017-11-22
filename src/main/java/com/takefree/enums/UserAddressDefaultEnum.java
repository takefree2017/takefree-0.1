package com.takefree.enums;

/**
 * Created by gaoxiang on 2017/11/14.
 */
public enum UserAddressDefaultEnum {
    DEFAULT("默认地址",1),NOT_DEFAULT("非默认地址",0);

    private String name ;
    private int code ;

    private UserAddressDefaultEnum(String name , int code ){
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
