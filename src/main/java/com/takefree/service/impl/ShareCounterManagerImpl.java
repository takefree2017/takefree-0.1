package com.takefree.service.impl;

import com.takefree.common.PageResult;
import com.takefree.model.ShareCounterDO;
import com.takefree.query.ShareCounterQuery;
import com.takefree.dao.ext.ShareCounterExtMapper;
import com.takefree.service.ShareCounterManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 * Manager for ShareCounter.
 */

@Component

public class ShareCounterManagerImpl implements ShareCounterManager{

    
    @Autowired
    protected ShareCounterExtMapper shareCounterExtMapper;
    /**
     * query count by query condition.
     */
    @Override
    public int countByQuery(ShareCounterQuery query){
        return shareCounterExtMapper.countByQuery(query);
    }

    /**
     * delete by query condition.
     */
    @Override
    public int deleteByQuery(ShareCounterQuery query){
        return shareCounterExtMapper.deleteByQuery(query);
    }

    /**
     * delete by primary key.
     */
    @Override
    public int deleteByPrimaryKey(ShareCounterDO record){
        return shareCounterExtMapper.deleteByPrimaryKey(record);
    }

    /**
     * insert selective.
     */
    @Override
    public long insertSelective(ShareCounterDO record){
        return shareCounterExtMapper.insertSelective(record);
    }

    /**
     * select by query condition.
     */
    @Override
    public List<ShareCounterDO> selectByQuery(ShareCounterQuery query){
        return shareCounterExtMapper.selectByQuery(query);
    }

    /**
     * select by query condition with page.
    */
    @Override
    public PageResult<ShareCounterDO> selectByQueryWithPage(ShareCounterQuery query) {
        PageResult<ShareCounterDO> result = new PageResult<ShareCounterDO>();
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
    public ShareCounterDO selectByPrimaryKey(Long id){
        return shareCounterExtMapper.selectByPrimaryKey(id);
    }

    /**
     * update by query condition selective.
     */
    @Override
    public int updateByQuerySelective( ShareCounterDO record,  ShareCounterQuery query){
        return shareCounterExtMapper.updateByQuerySelective(record,  query);
    }

    /**
     * update by query condition.
     */
    @Override
    public int updateByQuery( ShareCounterDO record,  ShareCounterQuery query){

        return shareCounterExtMapper.updateByQuery(record, query);
    }

    /**
     * update by primary key selective.
     */
    @Override
    public int updateByPrimaryKeySelective(ShareCounterDO record){
        return shareCounterExtMapper.updateByPrimaryKeySelective(record);
    }
}
