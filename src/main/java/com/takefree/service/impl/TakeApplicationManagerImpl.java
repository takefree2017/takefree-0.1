package com.takefree.service.impl;

import com.takefree.common.PageResult;
import com.takefree.model.TakeApplicationDO;
import com.takefree.query.TakeApplicationQuery;
import com.takefree.dao.ext.TakeApplicationExtMapper;
import com.takefree.service.TakeApplicationManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 * Manager for TakeApplication.
 */

@Component

public class TakeApplicationManagerImpl implements TakeApplicationManager{

    
    @Autowired
    protected TakeApplicationExtMapper takeApplicationExtMapper;
    /**
     * query count by query condition.
     */
    @Override
    public int countByQuery(TakeApplicationQuery query){
        return takeApplicationExtMapper.countByQuery(query);
    }

    /**
     * delete by query condition.
     */
    @Override
    public int deleteByQuery(TakeApplicationQuery query){
        return takeApplicationExtMapper.deleteByQuery(query);
    }

    /**
     * delete by primary key.
     */
    @Override
    public int deleteByPrimaryKey(TakeApplicationDO record){
        return takeApplicationExtMapper.deleteByPrimaryKey(record);
    }

    /**
     * insert selective.
     */
    @Override
    public long insertSelective(TakeApplicationDO record){
        return takeApplicationExtMapper.insertSelective(record);
    }

    /**
     * select by query condition.
     */
    @Override
    public List<TakeApplicationDO> selectByQuery(TakeApplicationQuery query){
        return takeApplicationExtMapper.selectByQuery(query);
    }

    /**
     * select by query condition with page.
    */
    @Override
    public PageResult<TakeApplicationDO> selectByQueryWithPage(TakeApplicationQuery query) {
        PageResult<TakeApplicationDO> result = new PageResult<TakeApplicationDO>();
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
    public TakeApplicationDO selectByPrimaryKey(Long id){
        return takeApplicationExtMapper.selectByPrimaryKey(id);
    }

    /**
     * update by query condition selective.
     */
    @Override
    public int updateByQuerySelective( TakeApplicationDO record,  TakeApplicationQuery query){
        return takeApplicationExtMapper.updateByQuerySelective(record,  query);
    }

    /**
     * update by query condition.
     */
    @Override
    public int updateByQuery( TakeApplicationDO record,  TakeApplicationQuery query){

        return takeApplicationExtMapper.updateByQuery(record, query);
    }

    /**
     * update by primary key selective.
     */
    @Override
    public int updateByPrimaryKeySelective(TakeApplicationDO record){
        return takeApplicationExtMapper.updateByPrimaryKeySelective(record);
    }
}
