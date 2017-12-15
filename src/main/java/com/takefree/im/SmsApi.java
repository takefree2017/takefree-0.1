package com.takefree.im;

/**
 * Created by gaoxiang on 2017/7/7.
 */
public interface SmsApi {
	//按模板发手机短信
    public boolean send(String receiver, String template,String kvs) throws Exception;
    //发手机验证码
    public boolean sendCode(String mobilePhone,String redisPreKey ) throws Exception;
    //验证手机验证码
    public boolean checkCode(String mobilePhone,String redisPreKey,String code) throws Exception;
}
