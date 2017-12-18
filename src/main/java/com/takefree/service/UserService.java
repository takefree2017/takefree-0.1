package com.takefree.service;

import com.takefree.common.entry.Token;
import com.takefree.dto.model.UserDTO;
import com.takefree.pojo.model.UserInfo;

import java.util.List;

/**
 * Created by gaoxiang on 2017/11/7.
 */
public interface UserService {

    UserDTO getUserInfoById(Long id);

    UserDTO getUserDetailById(Long id);

    boolean create(UserDTO userDTO) throws Exception;

    int updateById(UserDTO userDTO);

    List<UserInfo> getUserInfoByMobile(String mobile);

    Token loginByPassword(String mobile,String password) throws Exception;

    boolean sendLoginSms(String mobile) throws Exception;

    Token loginBySms(String mobile,String smsCode) throws Exception;

    Boolean logout(Token token) throws Exception;

    List<UserDTO> getFollowersByFolloweeId(Integer pageNo,Integer pageSize,Long followeeId);

    List<UserDTO> getFolloweesByFollowerId(Integer pageNo,Integer pageSize,Long followerId);
}
