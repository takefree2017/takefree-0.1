package com.takefree.service;

import com.takefree.common.entry.Token;
import com.takefree.dto.model.UserDTO;
import com.takefree.pojo.model.UserAddress;
import com.takefree.pojo.model.UserInfo;

import java.util.List;

/**
 * Created by gaoxiang on 2017/11/7.
 */
public interface UserAddressService {

    UserAddress getUserAddressById(Long id);

    List<UserAddress> getUserAddressByCondition(Long userId,Integer isDefault);

    int create(UserAddress userAddress);

    int updateById(UserAddress userAddress);

    int deleteById(Long id);

}
