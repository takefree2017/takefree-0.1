package com.takefree.service;

import com.takefree.common.PageResult;
import com.takefree.model.OrderRateDO;
import com.takefree.query.OrderRateQuery;

import java.util.List;


/**
 * Manager for OrderRate.
 */

public interface OrderRateManager {
    /**
     * query count by query condition.
     */
    int countByQuery(OrderRateQuery query);

    /**
     * delete by query condition.
     */
    int deleteByQuery(OrderRateQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(OrderRateDO record);

    /**
     * insert selective.
     */
    long insertSelective(OrderRateDO record);

    /**
     * select by query condition.
     */
    List<OrderRateDO> selectByQuery(OrderRateQuery query);


    /**
     * select by query condition with page.
     */
    PageResult<OrderRateDO> selectByQueryWithPage(OrderRateQuery query);

    /**
     * select by primary key.
     */
    OrderRateDO selectByPrimaryKey(Long id);

    /**
     * update by query condition selective.
     */
    int updateByQuerySelective(OrderRateDO record, OrderRateQuery query);

    /**
     * update by query condition.
     */
    int updateByQuery(OrderRateDO record, OrderRateQuery query);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(OrderRateDO record);
}
