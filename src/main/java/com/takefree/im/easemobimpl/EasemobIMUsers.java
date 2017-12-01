package com.takefree.im.easemobimpl;

import com.takefree.im.EasemobAPI;
import com.takefree.im.IMUserAPI;
import io.swagger.client.ApiException;
import io.swagger.client.api.UsersApi;
import io.swagger.client.model.NewPassword;
import io.swagger.client.model.Nickname;
import io.swagger.client.model.RegisterUsers;
import io.swagger.client.model.UserNames;

public class EasemobIMUsers  implements IMUserAPI {

	private UsersApi api = new UsersApi();
	private ResponseHandler responseHandler = new ResponseHandler();
	@Override
	public Object createNewIMUserSingle(final Object payload) {
		return responseHandler.handle(new EasemobAPI() {
			@Override
			public Object invokeEasemobAPI() throws ApiException {
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
}
