package com.takefree.im.aliyunimpl;

import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsRequest;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.profile.DefaultProfile;
import com.aliyuncs.profile.IClientProfile;
import com.takefree.common.service.SmsService;
import lombok.Data;
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
 
    public boolean send(String mobile, String template,String jsonstr) throws Exception {
    	
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
    	 request.setOutId("yourOutId");
    	//请求失败这里会抛ClientException异常
    	SendSmsResponse sendSmsResponse = acsClient.getAcsResponse(request);
    	if(sendSmsResponse.getCode() != null && sendSmsResponse.getCode().equals("OK")) {
    		logger.info("短信发送成功,接收方手机号:" + mobile);
    		return true;
     	}else {
    		logger.error(sendSmsResponse.getCode() + "短信发送失败，接收方手机号:" + mobile);
        	return false;	
    	}
    	
    }

    //短信验证码
    public boolean sendCode(String mobile,String code) throws Exception {
    	
    	return send( mobile,  template_yanzhengma, "{\"code\":\""+code + "\"}");
     }

//	public static void main(String[] args) {
//		SmsImpl smsImpl= new SmsImpl();
//		try {
//			smsImpl.sendCode("18910789656","888888");
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}

}
