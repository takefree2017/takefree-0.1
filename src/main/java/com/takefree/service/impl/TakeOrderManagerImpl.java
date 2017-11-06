package com.takefree.service.impl;

import com.takefree.common.PageResult;
import com.takefree.model.TakeOrderDO;
import com.takefree.query.TakeOrderQuery;
import com.takefree.dao.ext.TakeOrderExtMapper;
import com.takefree.service.TakeOrderManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 * Manager for TakeOrder.
 */

@Component

public class TakeOrderManagerImpl implements TakeOrderManager{

    
    @Autowired
    protected TakeOrderExtMapper takeOrderExtMapper;
    /**
     * query count by query condition.
     */
    @Override
    public int countByQuery(TakeOrderQuery query){
        return takeOrderExtMapper.countByQuery(query);
    }

    /**
     * delete by query condition.
     */
    @Override
    public int deleteByQuery(TakeOrderQuery query){
        return takeOrderExtMapper.deleteByQuery(query);
    }

    /**
     * delete by primary key.
     */
    @Override
    public int deleteByPrimaryKey(TakeOrderDO record){
        return takeOrderExtMapper.deleteByPrimaryKey(record);
    }

    /**
     * insert selective.
     */
    @Override
    public long insertSelective(TakeOrderDO record){
        return takeOrderExtMapper.insertSelective(record);
    }

    /**
     * select by query condition.
     */
    @Override
    public List<TakeOrderDO> selectByQuery(TakeOrderQuery query){
        return takeOrderExtMapper.selectByQuery(query);
    }

    /**
     * select by query condition with page.
    */
    @Override
    public PageResult<TakeOrderDO> selectByQueryWithPage(TakeOrderQuery query) {
        PageResult<TakeOrderDO> result = new PageResult<TakeOrderDO>();
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
    public TakeOrderDO selectByPrimaryKey(Long id){
        return takeOrderExtMapper.selectByPrimaryKey(id);
    }

    /**
     * update by query condition selective.
     */
    @Override
    public int updateByQuerySelective( TakeOrderDO record,  TakeOrderQuery query){
        return takeOrderExtMapper.updateByQuerySelective(record,  query);
    }

    /**
     * update by query condition.
     */
    @Override
    public int updateByQuery( TakeOrderDO record,  TakeOrderQuery query){

        return takeOrderExtMapper.updateByQuery(record, query);
    }

    /**
     * update by primary key selective.
     */
    @Override
    public int updateByPrimaryKeySelective(TakeOrderDO record){
        return takeOrderExtMapper.updateByPrimaryKeySelective(record);
    }
}
