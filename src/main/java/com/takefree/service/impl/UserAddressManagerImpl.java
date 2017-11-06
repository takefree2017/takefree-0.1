package com.takefree.service.impl;

import com.takefree.common.PageResult;
import com.takefree.model.UserAddressDO;
import com.takefree.query.UserAddressQuery;
import com.takefree.dao.ext.UserAddressExtMapper;
import com.takefree.service.UserAddressManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 * Manager for UserAddress.
 */

@Component

public class UserAddressManagerImpl implements UserAddressManager{

    
    @Autowired
    protected UserAddressExtMapper userAddressExtMapper;
    /**
     * query count by query condition.
     */
    @Override
    public int countByQuery(UserAddressQuery query){
        return userAddressExtMapper.countByQuery(query);
    }

    /**
     * delete by query condition.
     */
    @Override
    public int deleteByQuery(UserAddressQuery query){
        return userAddressExtMapper.deleteByQuery(query);
    }

    /**
     * delete by primary key.
     */
    @Override
    public int deleteByPrimaryKey(UserAddressDO record){
        return userAddressExtMapper.deleteByPrimaryKey(record);
    }

    /**
     * insert selective.
     */
    @Override
    public long insertSelective(UserAddressDO record){
        return userAddressExtMapper.insertSelective(record);
    }

    /**
     * select by query condition.
     */
    @Override
    public List<UserAddressDO> selectByQuery(UserAddressQuery query){
        return userAddressExtMapper.selectByQuery(query);
    }

    /**
     * select by query condition with page.
    */
    @Override
    public PageResult<UserAddressDO> selectByQueryWithPage(UserAddressQuery query) {
        PageResult<UserAddressDO> result = new PageResult<UserAddressDO>();
        result.setPageSize(query.getPageSize());
        result.setPageNo(query.getPageNo());
        result.setTotalCount(this.countByQuery(query));
        result.setResult(this.selectByQuery(query));
        return result;
    }

    /**
     * select by primary key.
     */
    @Override
    public UserAddressDO selectByPrimaryKey(Long id){
        return userAddressExtMapper.selectByPrimaryKey(id);
    }

    /**
     * update by query condition selective.
     */
    @Override
    public int updateByQuerySelective( UserAddressDO record,  UserAddressQuery query){
        return userAddressExtMapper.updateByQuerySelective(record,  query);
    }

    /**
     * update by query condition.
     */
    @Override
    public int updateByQuery( UserAddressDO record,  UserAddressQuery query){

        return userAddressExtMapper.updateByQuery(record, query);
    }

    /**
     * update by primary key selective.
     */
    @Override
    public int updateByPrimaryKeySelective(UserAddressDO record){
        return userAddressExtMapper.updateByPrimaryKeySelective(record);
    }
}
