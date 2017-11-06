package com.takefree.service.impl;

import com.takefree.common.PageResult;
import com.takefree.model.OrderRateDO;
import com.takefree.query.OrderRateQuery;
import com.takefree.dao.ext.OrderRateExtMapper;
import com.takefree.service.OrderRateManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 * Manager for OrderRate.
 */

@Component

public class OrderRateManagerImpl implements OrderRateManager{

    
    @Autowired
    protected OrderRateExtMapper orderRateExtMapper;
    /**
     * query count by query condition.
     */
    @Override
    public int countByQuery(OrderRateQuery query){
        return orderRateExtMapper.countByQuery(query);
    }

    /**
     * delete by query condition.
     */
    @Override
    public int deleteByQuery(OrderRateQuery query){
        return orderRateExtMapper.deleteByQuery(query);
    }

    /**
     * delete by primary key.
     */
    @Override
    public int deleteByPrimaryKey(OrderRateDO record){
        return orderRateExtMapper.deleteByPrimaryKey(record);
    }

    /**
     * insert selective.
     */
    @Override
    public long insertSelective(OrderRateDO record){
        return orderRateExtMapper.insertSelective(record);
    }

    /**
     * select by query condition.
     */
    @Override
    public List<OrderRateDO> selectByQuery(OrderRateQuery query){
        return orderRateExtMapper.selectByQuery(query);
    }

    /**
     * select by query condition with page.
    */
    @Override
    public PageResult<OrderRateDO> selectByQueryWithPage(OrderRateQuery query) {
        PageResult<OrderRateDO> result = new PageResult<OrderRateDO>();
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
    public OrderRateDO selectByPrimaryKey(Long id){
        return orderRateExtMapper.selectByPrimaryKey(id);
    }

    /**
     * update by query condition selective.
     */
    @Override
    public int updateByQuerySelective( OrderRateDO record,  OrderRateQuery query){
        return orderRateExtMapper.updateByQuerySelective(record,  query);
    }

    /**
     * update by query condition.
     */
    @Override
    public int updateByQuery( OrderRateDO record,  OrderRateQuery query){

        return orderRateExtMapper.updateByQuery(record, query);
    }

    /**
     * update by primary key selective.
     */
    @Override
    public int updateByPrimaryKeySelective(OrderRateDO record){
        return orderRateExtMapper.updateByPrimaryKeySelective(record);
    }
}
