package com.takefree.im.aliyunimpl;

import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.dysmsapi.model.v20170525.QuerySendDetailsRequest;
import com.aliyuncs.dysmsapi.model.v20170525.QuerySendDetailsResponse;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsRequest;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.profile.DefaultProfile;
import com.aliyuncs.profile.IClientProfile;
import com.takefree.common.service.SmsService;
import lombok.Data;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Service;


/**
 * Created by zhangzhongyuan on 2017/7/10.
 */
@Service
@ConfigurationProperties(prefix = "aliyun.sms")
@Data
public class SmsImpl implements SmsService {

	private static final Logger logger = LoggerFactory.getLogger(SmsImpl.class);

    private String product ;
    //产品域名
    private String domain ;

    private String defaultConnectTimeout;
    
    private String defaultReadTimeout;
    private String sign;
    
    private String region;
    private String accessKeyId ;
    private String accessKeySecret ;
    
    private String template_yanzhengma ;
 
    //可指定短信模板发送短信
    public boolean send(String mobile, String template,String jsonstr) throws Exception {
    	SendSmsResponse sendSmsResponse = sendSms( mobile,  template,jsonstr);
    	if(sendSmsResponse.getCode() != null && sendSmsResponse.getCode().equals("OK")) {
    		return true;
     	}else {
			return false;
    	}
    }

    //发短信验证码
    public boolean sendCode(String mobile,String code) throws Exception {
    	
    	return send( mobile,  template_yanzhengma, "{\"code\":\""+code + "\"}");
     }

    //查询短信最终发送成功与否，outid在sendSms中生成 规则 “手机号@时间戳”
    public boolean querySendStatus(String outid) throws ClientException {
    	String[] md = outid.split("@");
        if (md.length > 1) {
        	String[] dt = md[1].split(" ");
        	QuerySendDetailsResponse qsr = querySendDetails(md[0],dt[0],null);
            for(QuerySendDetailsResponse.SmsSendDetailDTO smsSendDetailDTO : qsr.getSmsSendDetailDTOs())
            {
            	if (outid.equals(smsSendDetailDTO.getOutId())) {
            		return true;
            	}
            }
        }
        return false;
    }
    
    private SendSmsResponse sendSms(String mobile, String template,String jsonstr) throws ClientException {
 
//		String sign = "TakeFree\u793E\u533A";
//
//		String defaultConnectTimeout = "10000";
//		String defaultReadTimeout = "10000";
//		String product = "Dysmsapi";
//		String domain = "dysmsapi.aliyuncs.com";
//		String accessKeyId = "";
//		String accessKeySecret = "";
//		String region = "cn-hangzhou";
    	
    	//设置超时时间-可自行调整
    	System.setProperty("sun.net.client.defaultConnectTimeout", defaultConnectTimeout);
    	System.setProperty("sun.net.client.defaultReadTimeout", defaultReadTimeout);
  
    	//初始化ascClient,暂时不支持多region（请勿修改）
    	IClientProfile profile = DefaultProfile.getProfile(region, accessKeyId,accessKeySecret);
    	DefaultProfile.addEndpoint(region, region, product, domain);
    	IAcsClient acsClient = new DefaultAcsClient(profile);
    	 //组装请求对象
    	 SendSmsRequest request = new SendSmsRequest();
    	 //使用post提交
    	 request.setMethod(MethodType.POST);
    	 //必填:待发送手机号。支持以逗号分隔的形式进行批量调用，批量上限为1000个手机号码,批量调用相对于单条调用及时性稍有延迟,验证码类型的短信推荐使用单条调用的方式
    	 request.setPhoneNumbers(mobile);
    	 //必填:短信签名-可在短信控制台中找到
    	 request.setSignName(sign);
 
    	 //必填:短信模板-可在短信控制台中找到
    	 request.setTemplateCode(template);
    	 //可选:模板中的变量替换JSON串,如模板内容为"亲爱的${name},您的验证码为${code}"时,此处的值为
    	 //友情提示:如果JSON中需要带换行符,请参照标准的JSON协议对换行符的要求,比如短信内容中包含\r\n的情况在JSON中需要表示成\\r\\n,否则会导致JSON在服务端解析失败
    	 request.setTemplateParam( jsonstr );
    	 //可选-上行短信扩展码(扩展码字段控制在7位或以下，无特殊需求用户请忽略此字段)
    	 //request.setSmsUpExtendCode("90997");
    	 //可选:outId为提供给业务方扩展字段,最终在短信回执消息中将此值带回给调用者
    	 //outid 作为查询短信最终发送成功与否的查询条件
         SimpleDateFormat ft = new SimpleDateFormat("yyyyMMdd hh:mm:ss.SSS");
         String outid = mobile + "@" + ft.format(new Date());
         request.setOutId(outid);
    	//请求失败这里会抛ClientException异常
    	SendSmsResponse sendSmsResponse = acsClient.getAcsResponse(request);
    	if(sendSmsResponse.getCode() != null && sendSmsResponse.getCode().equals("OK")) {
    		sendSmsResponse.getBizId();
    		sendSmsResponse.getMessage();
    		logger.info("短信发送请求成功outid:" + outid);
     	}else {
			logger.error("短信发送请求失败，手机号:{},code:{},message:{}" , mobile,sendSmsResponse.getCode(),sendSmsResponse.getMessage());
    	}
    	return sendSmsResponse;
    }
 
    //mobile 必填
    //sendate 必填 "yyyyMMdd" 支持30天内记录查询
    //bizId 选填 在发送短信时阿里端同步返回的交易流水号
    private  QuerySendDetailsResponse querySendDetails(String mobile,String sendate,String bizId) throws ClientException {

//		String product="Dysmsapi";
//		String domain="dysmsapi.aliyuncs.com";
//		String accessKeyId = "";
//		String accessKeySecret = "";
    	
        //可自助调整超时时间
    	System.setProperty("sun.net.client.defaultConnectTimeout", defaultConnectTimeout);
    	System.setProperty("sun.net.client.defaultReadTimeout", defaultReadTimeout);

        //初始化acsClient,暂不支持region化
        IClientProfile profile = DefaultProfile.getProfile("cn-hangzhou", accessKeyId, accessKeySecret);
        DefaultProfile.addEndpoint("cn-hangzhou", "cn-hangzhou", product, domain);
        IAcsClient acsClient = new DefaultAcsClient(profile);

        //组装请求对象
        QuerySendDetailsRequest request = new QuerySendDetailsRequest();
        //必填-号码
        request.setPhoneNumber(mobile);
        //可选-流水号
        if (bizId != null) {
        	request.setBizId(bizId);
		}
        //必填-发送日期 支持30天内记录查询，格式yyyyMMdd
        request.setSendDate(sendate);
        //必填-页大小
        request.setPageSize(10L);
        //必填-当前页码从1开始计数
        request.setCurrentPage(1L);

        //hint 此处可能会抛出ClientException异常
        QuerySendDetailsResponse querySendDetailsResponse = acsClient.getAcsResponse(request);

        return querySendDetailsResponse;
    }
    
//    public static void main(String[] args) throws ClientException, InterruptedException {
//
////        //发短信
//    	SmsImpl smsImpl= new SmsImpl();
////        SendSmsResponse response = smsImpl.sendSms("18910789656","SMS_125021256","{\"code\":\""+8384 + "\"}");
////        System.out.println("短信接口返回的数据----------------");
////        System.out.println("Code=" + response.getCode());
////        System.out.println("Message=" + response.getMessage());
////        System.out.println("RequestId=" + response.getRequestId());
////        System.out.println("BizId=" + response.getBizId());
////
////        Thread.sleep(3000L);
//
//        //查明细
////        if(response.getCode() != null && response.getCode().equals("OK")) {
////            QuerySendDetailsResponse querySendDetailsResponse = smsImpl.querySendDetails(response.getBizId());
//        	QuerySendDetailsResponse querySendDetailsResponse = smsImpl.querySendDetails("18910789656","20180226",null);
//            System.out.println("短信明细查询接口返回数据----------------");
//            System.out.println("Code=" + querySendDetailsResponse.getCode());
//            System.out.println("Message=" + querySendDetailsResponse.getMessage());
//            int i = 0;
//            for(QuerySendDetailsResponse.SmsSendDetailDTO smsSendDetailDTO : querySendDetailsResponse.getSmsSendDetailDTOs())
//            {
//                System.out.println("SmsSendDetailDTO["+i+"]:");
//                System.out.println("Content=" + smsSendDetailDTO.getContent());
//                System.out.println("ErrCode=" + smsSendDetailDTO.getErrCode());
//                System.out.println("OutId=" + smsSendDetailDTO.getOutId());
//                System.out.println("PhoneNum=" + smsSendDetailDTO.getPhoneNum());
//                System.out.println("ReceiveDate=" + smsSendDetailDTO.getReceiveDate());
//                System.out.println("SendDate=" + smsSendDetailDTO.getSendDate());
//                System.out.println("SendStatus=" + smsSendDetailDTO.getSendStatus());
//                System.out.println("Template=" + smsSendDetailDTO.getTemplateCode());
//            }
//            System.out.println("TotalCount=" + querySendDetailsResponse.getTotalCount());
//            System.out.println("RequestId=" + querySendDetailsResponse.getRequestId());
////        }
//            System.out.println(smsImpl.querySendStatus("18910789656@20180226 06:23:34.012"));
//    }
 
}
