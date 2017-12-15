package com.takefree.im.easemobimpl;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;


public class HttpWorker {

	private static final Logger logger = LoggerFactory.getLogger(HttpWorker.class);
	
	@Value("${huanxin.sendmsg_url}")
	private String sendmsg_url ;

	@Value("${huanxin.sms.send_url}")
	private String sendsms_url ;
	
	@Value("${huanxin.sms.token_url}")
	private String token_url ;
	
	@Value("${huanxin.sms.admin_token_url}")
	private String admin_token_url ;
	
	public Object EasemobPost(String from,String to ,String msg) {
		CloseableHttpClient httpclient = HttpClients.createDefault();
		String ret = null;
		try {
			HttpPost httppost = new HttpPost(sendmsg_url);

			String jsonstr = "{\"target_type\" : \"users\",\"target\" : [\"" + to + "\"],\"msg\" : {\"type\" : \"txt\",\"msg\" : \"" + msg + "\"},\"from\" : \"" + from +"\"}";

			StringEntity se = new StringEntity(jsonstr);

			se.setContentType("text/json");

			httppost.setEntity(se);
			httppost.setHeader("Content-Type", "application/json");
			httppost.setHeader("Authorization", TokenUtil.getAccessToken());
			CloseableHttpResponse response = httpclient.execute(httppost);
			
			HttpEntity resEntity = response.getEntity();
			if (resEntity != null) {
				ret = EntityUtils.toString(resEntity, "UTF-8");
			}
			response.close();
 		} catch (Exception e) {
 			logger.error("", e);
		} finally {
			try {
				httpclient.close();
			} catch (IOException e) {
				logger.error("", e);
			}
		}
		return ret;

	}

//	@Headers({"Content-Type: application/json;charset=UTF-8", "Accept: application/json"})
//	@POST("https://sms.easemob.com/1195170921115695/takefree/sms_send/")
//    public Object send(String token, EasemobSms easemobSms) {
//		CloseableHttpClient httpclient = HttpClients.createDefault();
//		String ret = null;
//		try {
//			HttpPost httppost = new HttpPost(sendsms_url);
//
//			String jsonstr = "{\"target_type\" : \"users\",\"target\" : [\"" + to + "\"],\"msg\" : {\"type\" : \"txt\",\"msg\" : \"" + msg + "\"},\"from\" : \"" + from +"\"}";
//
//			StringEntity se = new StringEntity(jsonstr);
//
//			se.setContentType("text/json");
//
//			httppost.setEntity(se);
//			httppost.setHeader("Content-Type", "application/json");
//			httppost.setHeader("token", token);
//			CloseableHttpResponse response = httpclient.execute(httppost);
//			
//			HttpEntity resEntity = response.getEntity();
//			if (resEntity != null) {
//				ret = EntityUtils.toString(resEntity, "UTF-8");
//			}
//			response.close();
// 		} catch (Exception e) {
//			System.out.println(e);
//		} finally {
//			try {
//				httpclient.close();
//			} catch (IOException e) {
//				System.out.println(e);
//			}
//		}
//		return ret;		
//	}
// 
//    @Headers({"Content-Type: application/json;charset=UTF-8", "Accept: application/json"})
//    @POST("https://sms.easemob.com/1195170921115695/takefree/token")
//    public Object  getSmsToken(String token) {
//    	
//    	return null;
//    }
//    
//    @Headers({"Content-Type: application/json", "Accept: */*"})
//    @POST("https://a1.easemob.com/management/token")
//    public Object  getAdminToken(@Body AdminInfo adminInfo) {
//    	
//    	return null;
//    }	

}
