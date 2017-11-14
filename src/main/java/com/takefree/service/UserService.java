package com.takefree.service;

import com.takefree.common.entry.Token;
import com.takefree.model.UserDTO;
import com.takefree.model.UserInfoDO;

import java.util.List;

/**
 * Created by gaoxiang on 2017/11/7.
 */
public interface UserService {

    UserInfoDO getUserInfoById(Long id);

    UserDTO getUserDetailById(Long id);

    boolean create(UserDTO userDTO);

    void updateById(UserDTO userDTO);

    List<UserInfoDO> getUserInfoByMobile(String mobile);

    Token login(UserDTO userDTO) throws Exception;
}
