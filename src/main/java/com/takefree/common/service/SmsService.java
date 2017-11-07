package com.takefree.common.service;

/**
 * Created by gaoxiang on 2017/7/7.
 */
public interface SmsService {
    public boolean send(String mobilePhone, String content) throws Exception;
}
