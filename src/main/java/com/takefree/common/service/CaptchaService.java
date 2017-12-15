package com.takefree.common.service;

/**
 * Created by gaoxiang on 2017/7/7.
 */
public interface CaptchaService {
//    public boolean send(String mobilePhone, String content) throws Exception;

    public boolean sendLoginCode(String mobile) throws Exception;

    public boolean checkLoginCode(String mobilePhone,String code) throws Exception;
}
