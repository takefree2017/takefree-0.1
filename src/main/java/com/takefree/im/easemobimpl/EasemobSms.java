package com.takefree.im.easemobimpl;

import com.takefree.configuration.SmsConfig;

import lombok.Data;

/**
 * Created by zhangzhongyuan on 2017/7/19.
 */
@Data
public class EasemobSms {
    private String receiver;

  	private String orderId;

  	private String sign;
    
	private String templateCode;
    
	private String params;

    private EasemobSms(){

    }
    
     public EasemobSms(SmsConfig smsconfig,String phone,String template,String pars){
		this.orderId = smsconfig.getOrderId();
		this.sign = smsconfig.getSign();
		this.receiver=phone;
		this.templateCode=template;
		this.params=pars;
    }

}
