package com.takefree.service;

import com.takefree.common.PageResult;
import com.takefree.model.OrderShowDO;
import com.takefree.query.OrderShowQuery;

import java.util.List;


/**
 * Manager for OrderShow.
 */

public interface OrderShowManager {
    /**
     * query count by query condition.
     */
    int countByQuery(OrderShowQuery query);

    /**
     * delete by query condition.
     */
    int deleteByQuery(OrderShowQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(OrderShowDO record);

    /**
     * insert selective.
     */
    long insertSelective(OrderShowDO record);

    /**
     * select by query condition.
     */
    List<OrderShowDO> selectByQuery(OrderShowQuery query);


    /**
     * select by query condition with page.
     */
    PageResult<OrderShowDO> selectByQueryWithPage(OrderShowQuery query);

    /**
     * select by primary key.
     */
    OrderShowDO selectByPrimaryKey(Long id);

    /**
     * update by query condition selective.
     */
    int updateByQuerySelective(OrderShowDO record, OrderShowQuery query);

    /**
     * update by query condition.
     */
    int updateByQuery(OrderShowDO record, OrderShowQuery query);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(OrderShowDO record);
}
