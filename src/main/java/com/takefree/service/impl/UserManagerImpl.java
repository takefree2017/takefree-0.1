package com.takefree.service.impl;

import com.takefree.common.PageResult;
import com.takefree.model.UserInfoDO;
import com.takefree.query.UserInfoQuery;
import com.takefree.dao.ext.UserInfoExtMapper;

import com.takefree.service.UserManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 * Manager for UserInfo.
 */

@Component

public class UserManagerImpl implements UserManager {

    
    @Autowired
    protected UserInfoExtMapper userInfoExtMapper;
    /**
     * query count by query condition.
     */
    @Override
    public int countByQuery(UserInfoQuery query){
        return userInfoExtMapper.countByQuery(query);
    }

    /**
     * delete by query condition.
     */
    @Override
    public int deleteByQuery(UserInfoQuery query){
        return userInfoExtMapper.deleteByQuery(query);
    }

    /**
     * delete by primary key.
     */
    @Override
    public int deleteByPrimaryKey(UserInfoDO record){
        return userInfoExtMapper.deleteByPrimaryKey(record);
    }

    /**
     * insert selective.
     */
    @Override
    public long insertSelective(UserInfoDO record){
        return userInfoExtMapper.insertSelective(record);
    }

    /**
     * select by query condition.
     */
    @Override
    public List<UserInfoDO> selectByQuery(UserInfoQuery query){
        return userInfoExtMapper.selectByQuery(query);
    }

    /**
     * select by query condition with page.
    */
    @Override
    public PageResult<UserInfoDO> selectByQueryWithPage(UserInfoQuery query) {
        PageResult<UserInfoDO> result = new PageResult<UserInfoDO>();
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
    public UserInfoDO selectByPrimaryKey(Long id){
        return userInfoExtMapper.selectByPrimaryKey(id);
    }

    /**
     * update by query condition selective.
     */
    @Override
    public int updateByQuerySelective( UserInfoDO record,  UserInfoQuery query){
        return userInfoExtMapper.updateByQuerySelective(record,  query);
    }

    /**
     * update by query condition.
     */
    @Override
    public int updateByQuery( UserInfoDO record,  UserInfoQuery query){

        return userInfoExtMapper.updateByQuery(record, query);
    }

    /**
     * update by primary key selective.
     */
    @Override
    public int updateByPrimaryKeySelective(UserInfoDO record){
        return userInfoExtMapper.updateByPrimaryKeySelective(record);
    }

    /**
     * select by mobile.
     */
    @Override
    public List<UserInfoDO> selectByMobile(String mobile){
        UserInfoQuery userInfoQuery= new UserInfoQuery();
        userInfoQuery.createCriteria().andMobileEqualTo(mobile);
        return this.selectByQuery(userInfoQuery);
    }

}
