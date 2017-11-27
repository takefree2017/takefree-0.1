package com.takefree.common.service;

/**
 * Created by gaoxiang on 2017/7/7.
 */
public interface SmsService {
    public boolean send(String mobilePhone, String content) throws Exception;

    public boolean sendCode(String mobilePhone,String redisPreKey ,String smsTemplete) throws Exception;

    public boolean checkCode(String mobilePhone,String redisPreKey,String code) throws Exception;
}
