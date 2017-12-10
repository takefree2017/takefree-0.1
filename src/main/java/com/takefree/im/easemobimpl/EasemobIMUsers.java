package com.takefree.im.easemobimpl;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Value;

import com.takefree.im.EasemobAPI;
import com.takefree.im.IMUserAPI;
import io.swagger.client.ApiException;
import io.swagger.client.api.UsersApi;
import io.swagger.client.model.NewPassword;
import io.swagger.client.model.Nickname;
import io.swagger.client.model.RegisterUsers;
import io.swagger.client.model.UserNames;

public class EasemobIMUsers  implements IMUserAPI {

	@Value("${huanxin.sendmsg_url}")
	private String sendmsg_url ;
	private UsersApi api = new UsersApi();
	private ResponseHandler responseHandler = new ResponseHandler();
	@Override
	public Object createNewIMUserSingle(final Object payload) {
		return responseHandler.handle(new EasemobAPI() {
			@Override
			public Object invokeEasemobAPI() throws ApiException {
				System.out.println("\n\n" + TokenUtil.getAccessToken());
				return com.alibaba.fastjson.JSON.parse(api.orgNameAppNameUsersPost(OrgInfo.org_name,OrgInfo.app_name,(RegisterUsers) payload,TokenUtil.getAccessToken()));
			}
		});
	}

	@Override
	public Object createNewIMUserBatch(final Object payload) {
		return responseHandler.handle(new EasemobAPI() {
			@Override
			public Object invokeEasemobAPI() throws ApiException {
				return com.alibaba.fastjson.JSON.parse(api.orgNameAppNameUsersPost(OrgInfo.org_name,OrgInfo.app_name, (RegisterUsers) payload,TokenUtil.getAccessToken()));
			}
		});
	}

	@Override
	public Object getIMUserByUserName(final String userName) {
		return responseHandler.handle(new EasemobAPI() {
			@Override
			public Object invokeEasemobAPI() throws ApiException {
				return com.alibaba.fastjson.JSON.parse(api.orgNameAppNameUsersUsernameGet(OrgInfo.org_name,OrgInfo.app_name,TokenUtil.getAccessToken(),userName));
		}
		});
	}

	@Override
	public Object getIMUsersBatch(final Long limit,final String cursor) {
		return responseHandler.handle(new EasemobAPI() {
			@Override
			public Object invokeEasemobAPI() throws ApiException {
				return com.alibaba.fastjson.JSON.parse(api.orgNameAppNameUsersGet(OrgInfo.org_name,OrgInfo.app_name,TokenUtil.getAccessToken(),limit+"",cursor));
			}
		});
	}

	@Override
	public Object deleteIMUserByUserName(final String userName) {
		return responseHandler.handle(new EasemobAPI() {
			@Override
			public Object invokeEasemobAPI() throws ApiException {
				return com.alibaba.fastjson.JSON.parse(api.orgNameAppNameUsersUsernameDelete(OrgInfo.org_name,OrgInfo.app_name,TokenUtil.getAccessToken(),userName));
			}
		});
	}

	@Override
	public Object deleteIMUserBatch(final Long limit,final String cursor) {
		return responseHandler.handle(new EasemobAPI() {
			@Override
			public Object invokeEasemobAPI() throws ApiException {
				return com.alibaba.fastjson.JSON.parse(api.orgNameAppNameUsersDelete(OrgInfo.org_name,OrgInfo.app_name,TokenUtil.getAccessToken(),limit+"",cursor));
			}
		});
	}

	@Override
	public Object modifyIMUserPasswordWithAdminToken(final String userName, final Object payload) {
		return responseHandler.handle(new EasemobAPI() {
			@Override
			public Object invokeEasemobAPI() throws ApiException {
				return com.alibaba.fastjson.JSON.parse(api.orgNameAppNameUsersUsernamePasswordPut(OrgInfo.org_name,OrgInfo.app_name,userName, (NewPassword) payload,TokenUtil.getAccessToken()));
			}
		});
	}

	@Override
	public Object modifyIMUserNickNameWithAdminToken(final String userName,final Object payload) {
		return responseHandler.handle(new EasemobAPI() {
			@Override
			public Object invokeEasemobAPI() throws ApiException {
				return com.alibaba.fastjson.JSON.parse(api.orgNameAppNameUsersUsernamePut(OrgInfo.org_name,OrgInfo.app_name,userName, (Nickname) payload,TokenUtil.getAccessToken()));
			}
		});
	}

	@Override
	public Object addFriendSingle(final String userName,final String friendName) {
		return responseHandler.handle(new EasemobAPI() {
			@Override
			public Object invokeEasemobAPI() throws ApiException {
				return com.alibaba.fastjson.JSON.parse(api.orgNameAppNameUsersOwnerUsernameContactsUsersFriendUsernamePost(OrgInfo.org_name,OrgInfo.app_name,TokenUtil.getAccessToken(),userName,friendName));
			}
		});
	}

	@Override
	public Object deleteFriendSingle(final String userName,final String friendName) {
		return responseHandler.handle(new EasemobAPI() {
			@Override
			public Object invokeEasemobAPI() throws ApiException {
				return com.alibaba.fastjson.JSON.parse(api.orgNameAppNameUsersOwnerUsernameContactsUsersFriendUsernameDelete(OrgInfo.org_name,OrgInfo.app_name,TokenUtil.getAccessToken(),userName,friendName));
			}
		});
	}

	@Override
	public Object getFriends(final String userName) {
		return responseHandler.handle(new EasemobAPI() {
			@Override
			public Object invokeEasemobAPI() throws ApiException {
				return com.alibaba.fastjson.JSON.parse(api.orgNameAppNameUsersOwnerUsernameContactsUsersGet(OrgInfo.org_name,OrgInfo.app_name,TokenUtil.getAccessToken(),userName));
			}
		});
	}

	@Override
	public Object getBlackList(final String userName) {
		return responseHandler.handle(new EasemobAPI() {
			@Override
			public Object invokeEasemobAPI() throws ApiException {
				return api.orgNameAppNameUsersOwnerUsernameBlocksUsersGet(OrgInfo.org_name,OrgInfo.app_name,TokenUtil.getAccessToken(),userName);
			}
		});
	}

	@Override
	public Object addToBlackList(final String userName,final Object payload) {
		return responseHandler.handle(new EasemobAPI() {
			@Override
			public Object invokeEasemobAPI() throws ApiException {
				return com.alibaba.fastjson.JSON.parse(api.orgNameAppNameUsersOwnerUsernameBlocksUsersPost(OrgInfo.org_name,OrgInfo.app_name,TokenUtil.getAccessToken(),userName, (UserNames) payload));
			}
		});
	}

	@Override
	public Object removeFromBlackList(final String userName,final String blackListName) {
		return responseHandler.handle(new EasemobAPI() {
			@Override
			public Object invokeEasemobAPI() throws ApiException {
				return com.alibaba.fastjson.JSON.parse(api.orgNameAppNameUsersOwnerUsernameBlocksUsersBlockedUsernameDelete(OrgInfo.org_name,OrgInfo.app_name,TokenUtil.getAccessToken(),userName,blackListName));
			}
		});
	}

	@Override
	public Object getIMUserStatus(final String userName) {
		return responseHandler.handle(new EasemobAPI() {
			@Override
			public Object invokeEasemobAPI() throws ApiException {
				return com.alibaba.fastjson.JSON.parse(api.orgNameAppNameUsersUsernameStatusGet(OrgInfo.org_name,OrgInfo.app_name,TokenUtil.getAccessToken(),userName));
			}
		});
	}

	@Override
	public Object getOfflineMsgCount(final String userName) {
		return responseHandler.handle(new EasemobAPI() {
			@Override
			public Object invokeEasemobAPI() throws ApiException {
				return com.alibaba.fastjson.JSON.parse(api.orgNameAppNameUsersOwnerUsernameOfflineMsgCountGet(OrgInfo.org_name,OrgInfo.app_name,TokenUtil.getAccessToken(),userName));
			}
		});
	}

	@Override
	public Object getSpecifiedOfflineMsgStatus(final String userName,final String msgId) {
		return responseHandler.handle(new EasemobAPI() {
			@Override
			public Object invokeEasemobAPI() throws ApiException {
				return com.alibaba.fastjson.JSON.parse(api.orgNameAppNameUsersUsernameOfflineMsgStatusMsgIdGet(OrgInfo.org_name,OrgInfo.app_name,TokenUtil.getAccessToken(),userName,msgId));
			}
		});
	}

	@Override
	public Object deactivateIMUser(final String userName) {
		return responseHandler.handle(new EasemobAPI() {
			@Override
			public Object invokeEasemobAPI() throws ApiException {
				return com.alibaba.fastjson.JSON.parse(api.orgNameAppNameUsersUsernameDeactivatePost(OrgInfo.org_name,OrgInfo.app_name,TokenUtil.getAccessToken(),userName));
			}
		});
	}

	@Override
	public Object activateIMUser(final String userName) {
		return responseHandler.handle(new EasemobAPI() {
			@Override
			public Object invokeEasemobAPI() throws ApiException {
				return com.alibaba.fastjson.JSON.parse(api.orgNameAppNameUsersUsernameActivatePost(OrgInfo.org_name,OrgInfo.app_name,TokenUtil.getAccessToken(),userName));
			}
		});
	}

	@Override
	public Object disconnectIMUser(final String userName) {
		return responseHandler.handle(new EasemobAPI() {
			@Override
			public Object invokeEasemobAPI() throws ApiException {
				return com.alibaba.fastjson.JSON.parse(api.orgNameAppNameUsersUsernameDisconnectGet(OrgInfo.org_name,OrgInfo.app_name,TokenUtil.getAccessToken(),userName));
			}
		});
	}

	@Override
	public Object getIMUserAllChatGroups(final String userName) {
		return responseHandler.handle(new EasemobAPI() {
			@Override
			public Object invokeEasemobAPI() throws ApiException {
				return com.alibaba.fastjson.JSON.parse(api.orgNameAppNameUsersUsernameJoinedChatgroupsGet(OrgInfo.org_name,OrgInfo.app_name,TokenUtil.getAccessToken(),userName));
			}
		});
	}

	@Override
	public Object getIMUserAllChatRooms(final String userName) {
		return responseHandler.handle(new EasemobAPI() {
			@Override
			public Object invokeEasemobAPI() throws ApiException {
				return com.alibaba.fastjson.JSON.parse(api.orgNameAppNameUsersUsernameJoinedChatroomsGet(OrgInfo.org_name,OrgInfo.app_name,TokenUtil.getAccessToken(),userName));
			}
		});
	}

	@Override
	public Object sendMsg(String from, String to, String msg) {
		return responseHandler.handle(new EasemobAPI() {
			@Override
			public Object invokeEasemobAPI() throws ApiException {
				return EasemobPost(from,to,msg);
			}
		});
	}
	
	private Object EasemobPost(String from,String to ,String msg) {
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
			System.out.println(e);
		} finally {
			try {
				httpclient.close();
			} catch (IOException e) {
				System.out.println(e);
			}
		}
		return ret;

	}
}
