package com.takefree.service.impl;

import com.takefree.common.PageResult;
import com.takefree.model.ShowCounterDO;
import com.takefree.query.ShowCounterQuery;
import com.takefree.dao.ext.ShowCounterExtMapper;
import com.takefree.service.ShowCounterManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 * Manager for ShowCounter.
 */

@Component

public class ShowCounterManagerImpl implements ShowCounterManager{

    
    @Autowired
    protected ShowCounterExtMapper showCounterExtMapper;
    /**
     * query count by query condition.
     */
    @Override
    public int countByQuery(ShowCounterQuery query){
        return showCounterExtMapper.countByQuery(query);
    }

    /**
     * delete by query condition.
     */
    @Override
    public int deleteByQuery(ShowCounterQuery query){
        return showCounterExtMapper.deleteByQuery(query);
    }

    /**
     * delete by primary key.
     */
    @Override
    public int deleteByPrimaryKey(ShowCounterDO record){
        return showCounterExtMapper.deleteByPrimaryKey(record);
    }

    /**
     * insert selective.
     */
    @Override
    public long insertSelective(ShowCounterDO record){
        return showCounterExtMapper.insertSelective(record);
    }

    /**
     * select by query condition.
     */
    @Override
    public List<ShowCounterDO> selectByQuery(ShowCounterQuery query){
        return showCounterExtMapper.selectByQuery(query);
    }

    /**
     * select by query condition with page.
    */
    @Override
    public PageResult<ShowCounterDO> selectByQueryWithPage(ShowCounterQuery query) {
        PageResult<ShowCounterDO> result = new PageResult<ShowCounterDO>();
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
    public ShowCounterDO selectByPrimaryKey(Long id){
        return showCounterExtMapper.selectByPrimaryKey(id);
    }

    /**
     * update by query condition selective.
     */
    @Override
    public int updateByQuerySelective( ShowCounterDO record,  ShowCounterQuery query){
        return showCounterExtMapper.updateByQuerySelective(record,  query);
    }

    /**
     * update by query condition.
     */
    @Override
    public int updateByQuery( ShowCounterDO record,  ShowCounterQuery query){

        return showCounterExtMapper.updateByQuery(record, query);
    }

    /**
     * update by primary key selective.
     */
    @Override
    public int updateByPrimaryKeySelective(ShowCounterDO record){
        return showCounterExtMapper.updateByPrimaryKeySelective(record);
    }
}
