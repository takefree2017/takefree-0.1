package com.takefree.common.entry;

import lombok.Data;

/**
 * Created by gaoxiang on 2017/7/19.
 */
@Data
public class Sms {
    private String phone;
    private String content;

    private Sms(){

    }

    public Sms(String phone, String content){
        this.phone=phone;
        this.content=content;
    }
}
