package com.takefree.service.impl;

import com.takefree.common.PageResult;
import com.takefree.model.UserLikeDO;
import com.takefree.query.UserLikeQuery;
import com.takefree.dao.ext.UserLikeExtMapper;
import com.takefree.service.UserLikeManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 * Manager for UserLike.
 */

@Component

public class UserLikeManagerImpl implements UserLikeManager{

    
    @Autowired
    protected UserLikeExtMapper userLikeExtMapper;
    /**
     * query count by query condition.
     */
    @Override
    public int countByQuery(UserLikeQuery query){
        return userLikeExtMapper.countByQuery(query);
    }

    /**
     * delete by query condition.
     */
    @Override
    public int deleteByQuery(UserLikeQuery query){
        return userLikeExtMapper.deleteByQuery(query);
    }

    /**
     * delete by primary key.
     */
    @Override
    public int deleteByPrimaryKey(UserLikeDO record){
        return userLikeExtMapper.deleteByPrimaryKey(record);
    }

    /**
     * insert selective.
     */
    @Override
    public long insertSelective(UserLikeDO record){
        return userLikeExtMapper.insertSelective(record);
    }

    /**
     * select by query condition.
     */
    @Override
    public List<UserLikeDO> selectByQuery(UserLikeQuery query){
        return userLikeExtMapper.selectByQuery(query);
    }

    /**
     * select by query condition with page.
    */
    @Override
    public PageResult<UserLikeDO> selectByQueryWithPage(UserLikeQuery query) {
        PageResult<UserLikeDO> result = new PageResult<UserLikeDO>();
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
    public UserLikeDO selectByPrimaryKey(Long id){
        return userLikeExtMapper.selectByPrimaryKey(id);
    }

    /**
     * update by query condition selective.
     */
    @Override
    public int updateByQuerySelective( UserLikeDO record,  UserLikeQuery query){
        return userLikeExtMapper.updateByQuerySelective(record,  query);
    }

    /**
     * update by query condition.
     */
    @Override
    public int updateByQuery( UserLikeDO record,  UserLikeQuery query){

        return userLikeExtMapper.updateByQuery(record, query);
    }

    /**
     * update by primary key selective.
     */
    @Override
    public int updateByPrimaryKeySelective(UserLikeDO record){
        return userLikeExtMapper.updateByPrimaryKeySelective(record);
    }
}
