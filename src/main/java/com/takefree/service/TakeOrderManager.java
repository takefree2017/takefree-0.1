package com.takefree.service;

import com.takefree.common.PageResult;
import com.takefree.model.TakeOrderDO;
import com.takefree.query.TakeOrderQuery;

import java.util.List;


/**
 * Manager for TakeOrder.
 */

public interface TakeOrderManager {
    /**
     * query count by query condition.
     */
    int countByQuery(TakeOrderQuery query);

    /**
     * delete by query condition.
     */
    int deleteByQuery(TakeOrderQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(TakeOrderDO record);

    /**
     * insert selective.
     */
    long insertSelective(TakeOrderDO record);

    /**
     * select by query condition.
     */
    List<TakeOrderDO> selectByQuery(TakeOrderQuery query);


    /**
     * select by query condition with page.
     */
    PageResult<TakeOrderDO> selectByQueryWithPage(TakeOrderQuery query);

    /**
     * select by primary key.
     */
    TakeOrderDO selectByPrimaryKey(Long id);

    /**
     * update by query condition selective.
     */
    int updateByQuerySelective(TakeOrderDO record, TakeOrderQuery query);

    /**
     * update by query condition.
     */
    int updateByQuery(TakeOrderDO record, TakeOrderQuery query);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(TakeOrderDO record);
}
