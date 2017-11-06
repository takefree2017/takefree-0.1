package com.takefree.service.impl;

import com.takefree.common.PageResult;
import com.takefree.model.OrderShowDO;
import com.takefree.query.OrderShowQuery;
import com.takefree.dao.ext.OrderShowExtMapper;
import com.takefree.service.OrderShowManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 * Manager for OrderShow.
 */

@Component

public class OrderShowManagerImpl implements OrderShowManager{

    
    @Autowired
    protected OrderShowExtMapper orderShowExtMapper;
    /**
     * query count by query condition.
     */
    @Override
    public int countByQuery(OrderShowQuery query){
        return orderShowExtMapper.countByQuery(query);
    }

    /**
     * delete by query condition.
     */
    @Override
    public int deleteByQuery(OrderShowQuery query){
        return orderShowExtMapper.deleteByQuery(query);
    }

    /**
     * delete by primary key.
     */
    @Override
    public int deleteByPrimaryKey(OrderShowDO record){
        return orderShowExtMapper.deleteByPrimaryKey(record);
    }

    /**
     * insert selective.
     */
    @Override
    public long insertSelective(OrderShowDO record){
        return orderShowExtMapper.insertSelective(record);
    }

    /**
     * select by query condition.
     */
    @Override
    public List<OrderShowDO> selectByQuery(OrderShowQuery query){
        return orderShowExtMapper.selectByQuery(query);
    }

    /**
     * select by query condition with page.
    */
    @Override
    public PageResult<OrderShowDO> selectByQueryWithPage(OrderShowQuery query) {
        PageResult<OrderShowDO> result = new PageResult<OrderShowDO>();
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
    public OrderShowDO selectByPrimaryKey(Long id){
        return orderShowExtMapper.selectByPrimaryKey(id);
    }

    /**
     * update by query condition selective.
     */
    @Override
    public int updateByQuerySelective( OrderShowDO record,  OrderShowQuery query){
        return orderShowExtMapper.updateByQuerySelective(record,  query);
    }

    /**
     * update by query condition.
     */
    @Override
    public int updateByQuery( OrderShowDO record,  OrderShowQuery query){

        return orderShowExtMapper.updateByQuery(record, query);
    }

    /**
     * update by primary key selective.
     */
    @Override
    public int updateByPrimaryKeySelective(OrderShowDO record){
        return orderShowExtMapper.updateByPrimaryKeySelective(record);
    }
}
