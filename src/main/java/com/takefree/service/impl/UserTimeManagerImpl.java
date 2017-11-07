package com.takefree.service.impl;

import com.takefree.common.PageResult;
import com.takefree.model.UserTimeDO;
import com.takefree.query.UserTimeQuery;
import com.takefree.dao.ext.UserTimeExtMapper;
import com.takefree.service.UserTimeManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 * Manager for UserTime.
 */

@Component

public class UserTimeManagerImpl implements UserTimeManager{

    
    @Autowired
    protected UserTimeExtMapper userTimeExtMapper;
    /**
     * query count by query condition.
     */
    @Override
    public int countByQuery(UserTimeQuery query){
        return userTimeExtMapper.countByQuery(query);
    }

    /**
     * delete by query condition.
     */
    @Override
    public int deleteByQuery(UserTimeQuery query){
        return userTimeExtMapper.deleteByQuery(query);
    }

    /**
     * delete by primary key.
     */
    @Override
    public int deleteByPrimaryKey(UserTimeDO record){
        return userTimeExtMapper.deleteByPrimaryKey(record);
    }

    /**
     * insert selective.
     */
    @Override
    public long insertSelective(UserTimeDO record){
        return userTimeExtMapper.insertSelective(record);
    }

    /**
     * select by query condition.
     */
    @Override
    public List<UserTimeDO> selectByQuery(UserTimeQuery query){
        return userTimeExtMapper.selectByQuery(query);
    }

    /**
     * select by query condition with page.
    */
    @Override
    public PageResult<UserTimeDO> selectByQueryWithPage(UserTimeQuery query) {
        PageResult<UserTimeDO> result = new PageResult<UserTimeDO>();
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
    public UserTimeDO selectByPrimaryKey(Long id){
        return userTimeExtMapper.selectByPrimaryKey(id);
    }

    /**
     * update by query condition selective.
     */
    @Override
    public int updateByQuerySelective( UserTimeDO record,  UserTimeQuery query){
        return userTimeExtMapper.updateByQuerySelective(record,  query);
    }

    /**
     * update by query condition.
     */
    @Override
    public int updateByQuery( UserTimeDO record,  UserTimeQuery query){

        return userTimeExtMapper.updateByQuery(record, query);
    }

    /**
     * update by primary key selective.
     */
    @Override
    public int updateByPrimaryKeySelective(UserTimeDO record){
        return userTimeExtMapper.updateByPrimaryKeySelective(record);
    }
}
