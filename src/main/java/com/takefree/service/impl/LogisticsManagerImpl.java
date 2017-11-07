package com.takefree.service.impl;

import com.takefree.common.PageResult;
import com.takefree.model.LogisticsDO;
import com.takefree.query.LogisticsQuery;
import com.takefree.dao.ext.LogisticsExtMapper;
import com.takefree.service.LogisticsManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 * Manager for Logistics.
 */

@Component

public class LogisticsManagerImpl implements LogisticsManager{

    
    @Autowired
    protected LogisticsExtMapper logisticsExtMapper;
    /**
     * query count by query condition.
     */
    @Override
    public int countByQuery(LogisticsQuery query){
        return logisticsExtMapper.countByQuery(query);
    }

    /**
     * delete by query condition.
     */
    @Override
    public int deleteByQuery(LogisticsQuery query){
        return logisticsExtMapper.deleteByQuery(query);
    }

    /**
     * delete by primary key.
     */
    @Override
    public int deleteByPrimaryKey(LogisticsDO record){
        return logisticsExtMapper.deleteByPrimaryKey(record);
    }

    /**
     * insert selective.
     */
    @Override
    public long insertSelective(LogisticsDO record){
        return logisticsExtMapper.insertSelective(record);
    }

    /**
     * select by query condition.
     */
    @Override
    public List<LogisticsDO> selectByQuery(LogisticsQuery query){
        return logisticsExtMapper.selectByQuery(query);
    }

    /**
     * select by query condition with page.
    */
    @Override
    public PageResult<LogisticsDO> selectByQueryWithPage(LogisticsQuery query) {
        PageResult<LogisticsDO> result = new PageResult<LogisticsDO>();
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
    public LogisticsDO selectByPrimaryKey(Long id){
        return logisticsExtMapper.selectByPrimaryKey(id);
    }

    /**
     * update by query condition selective.
     */
    @Override
    public int updateByQuerySelective( LogisticsDO record,  LogisticsQuery query){
        return logisticsExtMapper.updateByQuerySelective(record,  query);
    }

    /**
     * update by query condition.
     */
    @Override
    public int updateByQuery( LogisticsDO record,  LogisticsQuery query){

        return logisticsExtMapper.updateByQuery(record, query);
    }

    /**
     * update by primary key selective.
     */
    @Override
    public int updateByPrimaryKeySelective(LogisticsDO record){
        return logisticsExtMapper.updateByPrimaryKeySelective(record);
    }
}
