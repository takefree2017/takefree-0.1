package com.takefree.service.impl;

import com.takefree.enums.UserAddressDefaultEnum;
import com.takefree.pojo.mapper.UserAddressMapper;
import com.takefree.pojo.model.UserAddress;
import com.takefree.pojo.query.UserAddressQuery;
import com.takefree.service.UserAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by gaoxiang on 2017/11/22.
 */
@Service
public class UserAddressServiceImpl implements UserAddressService {
    @Autowired
    private UserAddressMapper userAddressMapper;

    @Override
    public UserAddress getUserAddressById(Long id) {
        return userAddressMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<UserAddress> getUserAddresss(Long userId,Integer isDefault) {
        UserAddressQuery userAddressQuery = new UserAddressQuery();
        UserAddressQuery.Criteria criteria = userAddressQuery.createCriteria();
        criteria.andUserIdEqualTo(userId);
        if(isDefault!=null){
            criteria.andIsDefaultEqualTo(isDefault);
        }
        return userAddressMapper.selectByExample(userAddressQuery);
    }

    @Override
    @Transactional
    public int create(UserAddress userAddress) {
        //如果更新默认地址则首先将其他地址设为非默认
        if (userAddress.getIsDefault()!=null&& userAddress.getIsDefault()== UserAddressDefaultEnum.DEFAULT.getCode()) {
            clearDefaultAddress(userAddress.getUserId());
        }
        return userAddressMapper.insertSelective(userAddress);
    }

    @Override
    @Transactional
    public int updateById(UserAddress userAddress) {
        //如果更新默认地址则首先将其他地址设为非默认
        if (userAddress.getIsDefault()!=null&& userAddress.getIsDefault()== UserAddressDefaultEnum.DEFAULT.getCode()) {
            clearDefaultAddress(userAddress.getUserId());
        }
        return userAddressMapper.updateByPrimaryKeySelective(userAddress);
    }

    @Override
    public int deleteById(Long id) {
        return userAddressMapper.deleteByPrimaryKey(id);
    }

    //清除默认地址
    @Transactional
    private int clearDefaultAddress(Long userId) {
        UserAddress userAddressExapmle = new UserAddress();
        userAddressExapmle.setIsDefault(UserAddressDefaultEnum.NOT_DEFAULT.getCode());
        UserAddressQuery userAddressQuery = new UserAddressQuery();
        UserAddressQuery.Criteria criteria = userAddressQuery.createCriteria();
        criteria.andUserIdEqualTo(userId);
        criteria.andIsDefaultEqualTo(UserAddressDefaultEnum.DEFAULT.getCode());
        return userAddressMapper.updateByExampleSelective(userAddressExapmle, userAddressQuery);
    }

}
