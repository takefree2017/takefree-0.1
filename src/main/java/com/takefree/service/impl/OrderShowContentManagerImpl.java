package com.takefree.service.impl;

import com.takefree.common.PageResult;
import com.takefree.model.OrderShowContentDO;
import com.takefree.query.OrderShowContentQuery;
import com.takefree.dao.ext.OrderShowContentExtMapper;
import com.takefree.service.OrderShowContentManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 * Manager for OrderShowContent.
 */

@Component

public class OrderShowContentManagerImpl implements OrderShowContentManager{

    
    @Autowired
    protected OrderShowContentExtMapper orderShowContentExtMapper;
    /**
     * query count by query condition.
     */
    @Override
    public int countByQuery(OrderShowContentQuery query){
        return orderShowContentExtMapper.countByQuery(query);
    }

    /**
     * delete by query condition.
     */
    @Override
    public int deleteByQuery(OrderShowContentQuery query){
        return orderShowContentExtMapper.deleteByQuery(query);
    }

    /**
     * delete by primary key.
     */
    @Override
    public int deleteByPrimaryKey(OrderShowContentDO record){
        return orderShowContentExtMapper.deleteByPrimaryKey(record);
    }

    /**
     * insert selective.
     */
    @Override
    public long insertSelective(OrderShowContentDO record){
        return orderShowContentExtMapper.insertSelective(record);
    }

    /**
     * select by query condition.
     */
    @Override
    public List<OrderShowContentDO> selectByQuery(OrderShowContentQuery query){
        return orderShowContentExtMapper.selectByQuery(query);
    }

    /**
     * select by query condition with page.
    */
    @Override
    public PageResult<OrderShowContentDO> selectByQueryWithPage(OrderShowContentQuery query) {
        PageResult<OrderShowContentDO> result = new PageResult<OrderShowContentDO>();
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
    public OrderShowContentDO selectByPrimaryKey(Long id){
        return orderShowContentExtMapper.selectByPrimaryKey(id);
    }

    /**
     * update by query condition selective.
     */
    @Override
    public int updateByQuerySelective( OrderShowContentDO record,  OrderShowContentQuery query){
        return orderShowContentExtMapper.updateByQuerySelective(record,  query);
    }

    /**
     * update by query condition.
     */
    @Override
    public int updateByQuery( OrderShowContentDO record,  OrderShowContentQuery query){

        return orderShowContentExtMapper.updateByQuery(record, query);
    }

    /**
     * update by primary key selective.
     */
    @Override
    public int updateByPrimaryKeySelective(OrderShowContentDO record){
        return orderShowContentExtMapper.updateByPrimaryKeySelective(record);
    }
}
