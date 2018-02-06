package com.takefree.im.easemobimpl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.qianbao.redis.service.RedisClient;
import com.takefree.common.entry.JsonObjectBase;
import com.takefree.common.service.SmsService;
import com.takefree.configuration.SmsConfig;

import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Service;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.jackson.JacksonConverterFactory;
import retrofit2.http.*;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.validation.constraints.NotNull;

/**
 * Created by zhangzhongyuan on 2017/7/10.
 */
@Service
@ConfigurationProperties(prefix = "huanxin.sms")
@Data
public class SmsImpl implements SmsService, InitializingBean {

	private static final Logger logger = LoggerFactory.getLogger(SmsImpl.class);

    private String sign;
    
    private String orderId;
    
    private String params;
    
    private String template_yanzhengma;
    
    @Autowired
    private SmsConfig smsConfig;
    
    @NotNull
    private String baseUrl;

    private static SmsClientService smsClientService;
    
    @NotNull
    private static String admin_username;

	public static String grant_type ;

	public static String password ;
	
    @Reference(version = "1.0.0")
    private RedisClient redisClient;

    @NotNull
    private String redisNamespace;

    @NotNull
    private Integer redis_ttl;

    @NotNull
    private Integer inteval;
 
    public void afterPropertiesSet() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(JacksonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
        smsClientService = retrofit.create(SmsClientService.class);
    }
  
    
    public boolean send(String mobile, String template,String kvs) throws Exception {
    	
        if (TokenUtil.getSMS_TOKEN() == null) {
        	//取sms token 
    		getSmsToken();
        }
    	//发送失败也可能返回code 200 需要进步判断
    	Response<Object> rep = smsClientService.send(TokenUtil.getSMS_TOKEN(),new EasemobSms(smsConfig,mobile, template, kvs)).execute();
    
//    	JSONObject jsonObj = JSON.parseObject(JSON.toJSONString(rep.body()));
    	//{"data":{"sessionID":"489a46e99adaf88b46530c2c69da9407"},"errorCode":0}
//    	JSONObject data = jsonObj.getJSONObject("data");
    	
    	if (rep.code() == 401) {
			//sms token 出错 重取
    		getSmsToken();
    		rep = smsClientService.send(TokenUtil.getSMS_TOKEN(),new EasemobSms(smsConfig,mobile, template, kvs)).execute();
 		}
        if (!(rep.code() == 200)) {
            logger.error("send sms error!{}", rep.body());
            return false;
        } else {
        	logger.info("短信发送成功sessionID:", rep.body());
            return true;
        }
    }

    //短信验证码
    public boolean sendCode(String mobile,String code) throws Exception {
    	
    	return send( mobile,  template_yanzhengma, "verificationCode="+code);
     }

 
    private static String getSmsToken() throws IOException {
//    	String adminToken = TokenUtil.getADMIN_TOKEN();
    	if (TokenUtil.getADMIN_TOKEN() == null) {
    		getNewAdminToken();
    	}
    	Response<Object> rep = smsClientService.getSmsToken(admin_username,TokenUtil.getADMIN_TOKEN()).execute();
    	
    	if (rep.code() == 401) {
			//admin token 出错 重取
    		getNewAdminToken();
    		rep = smsClientService.getSmsToken(admin_username,TokenUtil.getADMIN_TOKEN()).execute();
		}
    	if (rep.code() != 200) {
            logger.error("get Sms Token error!{}", rep.errorBody());
            return null;
        } else {
        	JSONObject jsonObj = JSON.parseObject(JSON.toJSONString(rep.body()));
        	JSONObject data = jsonObj.getJSONObject("data");
        	String token = data.getString("token");
        	TokenUtil.setSMS_TOKEN(token);
            return token;
        }
    }
    
    private static String getNewAdminToken() throws IOException {
//    	String jString = "{\"grant_type\":\"password\",\"username\":\"datalj@163.com\",\"password\":\"xiexiehuanxin@takefree\"}";
    	AdminInfo adminInfo = new AdminInfo(grant_type,admin_username,password);
    	Response<Object>  rep = smsClientService.getAdminToken(adminInfo).execute();
 
        if (rep.code() != 200) {
            logger.error("get Admin Token error!{}", rep.errorBody());
            return null;
        } else {
        	JSONObject jsonObj = JSON.parseObject(JSON.toJSONString(rep.body()));
        	String token = jsonObj.getString("access_token");
//        	Long expire_admintoken = jsonObj.getLong("expires_in");
        	TokenUtil.setADMIN_TOKEN(token);
            return token;
        }
    }

    
	  static {
	  InputStream inputStream = OrgInfo.class.getClassLoader().getResourceAsStream("application.properties");
	  Properties prop = new Properties();
	  try {
	      prop.load(inputStream);
	  } catch (IOException e) {
	      logger.error(e.getMessage());
	  }
	  admin_username = prop.getProperty("huanxin.sms.admin_username");
	  grant_type = prop.getProperty("huanxin.sms.grant_type");
	  password = prop.getProperty("huanxin.sms.password");
	  }
}

class AdminInfo{
	public  String grant_type ;
	public  String username ;
	public  String password ;
	AdminInfo(String gt,String un,String ps) {
		grant_type = gt;
		username = un;
		password = ps;
	}
}

interface SmsClientService {

	@Headers({"Content-Type: application/json;charset=UTF-8", "Accept: application/json"})
	@POST("https://sms.easemob.com/1195170921115695/takefree/sms_send/")
    public Call<Object> send(@Header("token") String token, @Body EasemobSms easemobSms);
 
    @Headers({"Content-Type: application/json;charset=UTF-8", "Accept: application/json"})
    @POST("https://sms.easemob.com/1195170921115695/takefree/token")
    public Call<Object>  getSmsToken(@Header("username") String username,@Header("token") String token) ;
    
    @Headers({"Content-Type: application/json", "Accept: */*"})
    @POST("https://a1.easemob.com/management/token")
    public Call<Object>  getAdminToken(@Body AdminInfo adminInfo) ;
}

