package com.takefree.service.impl;

import com.takefree.common.PageResult;
import com.takefree.model.UserDescriptionDO;
import com.takefree.query.UserDescriptionQuery;
import com.takefree.dao.ext.UserDescriptionExtMapper;
import com.takefree.service.UserDescriptionManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 * Manager for UserDescription.
 */

@Component

public class UserDescriptionManagerImpl implements UserDescriptionManager{

    
    @Autowired
    protected UserDescriptionExtMapper userDescriptionExtMapper;
    /**
     * query count by query condition.
     */
    @Override
    public int countByQuery(UserDescriptionQuery query){
        return userDescriptionExtMapper.countByQuery(query);
    }

    /**
     * delete by query condition.
     */
    @Override
    public int deleteByQuery(UserDescriptionQuery query){
        return userDescriptionExtMapper.deleteByQuery(query);
    }

    /**
     * delete by primary key.
     */
    @Override
    public int deleteByPrimaryKey(UserDescriptionDO record){
        return userDescriptionExtMapper.deleteByPrimaryKey(record);
    }

    /**
     * insert selective.
     */
    @Override
    public long insertSelective(UserDescriptionDO record){
        return userDescriptionExtMapper.insertSelective(record);
    }

    /**
     * select by query condition.
     */
    @Override
    public List<UserDescriptionDO> selectByQuery(UserDescriptionQuery query){
        return userDescriptionExtMapper.selectByQuery(query);
    }

    /**
     * select by query condition with page.
    */
    @Override
    public PageResult<UserDescriptionDO> selectByQueryWithPage(UserDescriptionQuery query) {
        PageResult<UserDescriptionDO> result = new PageResult<UserDescriptionDO>();
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
    public UserDescriptionDO selectByPrimaryKey(Long id){
        return userDescriptionExtMapper.selectByPrimaryKey(id);
    }

    /**
     * update by query condition selective.
     */
    @Override
    public int updateByQuerySelective( UserDescriptionDO record,  UserDescriptionQuery query){
        return userDescriptionExtMapper.updateByQuerySelective(record,  query);
    }

    /**
     * update by query condition.
     */
    @Override
    public int updateByQuery( UserDescriptionDO record,  UserDescriptionQuery query){

        return userDescriptionExtMapper.updateByQuery(record, query);
    }

    /**
     * update by primary key selective.
     */
    @Override
    public int updateByPrimaryKeySelective(UserDescriptionDO record){
        return userDescriptionExtMapper.updateByPrimaryKeySelective(record);
    }
}
