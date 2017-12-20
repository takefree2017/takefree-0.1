package com.takefree.service;

import com.takefree.pojo.model.UserInfo;

import java.util.List;

/**
 * Created by gaoxiang on 2017/11/7.
 */
public interface ImService {

    boolean createUser(UserInfo userInfo);

    boolean modifyUserPassword(UserInfo userInfo);
    //List<UserInfo> createUsers(List<UserInfo>  userInfos);

    boolean sendMessage(UserInfo fromUsers,List<UserInfo> toUsers,String content);

    //List<ImMessage> getMessages(UserInfo user);
}
