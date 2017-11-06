package com.takefree.service;

import com.takefree.common.PageResult;
import com.takefree.model.OrderShowContentDO;
import com.takefree.query.OrderShowContentQuery;

import java.util.List;


/**
 * Manager for OrderShowContent.
 */

public interface OrderShowContentManager {
    /**
     * query count by query condition.
     */
    int countByQuery(OrderShowContentQuery query);

    /**
     * delete by query condition.
     */
    int deleteByQuery(OrderShowContentQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(OrderShowContentDO record);

    /**
     * insert selective.
     */
    long insertSelective(OrderShowContentDO record);

    /**
     * select by query condition.
     */
    List<OrderShowContentDO> selectByQuery(OrderShowContentQuery query);


    /**
     * select by query condition with page.
     */
    PageResult<OrderShowContentDO> selectByQueryWithPage(OrderShowContentQuery query);

    /**
     * select by primary key.
     */
    OrderShowContentDO selectByPrimaryKey(Long id);

    /**
     * update by query condition selective.
     */
    int updateByQuerySelective(OrderShowContentDO record, OrderShowContentQuery query);

    /**
     * update by query condition.
     */
    int updateByQuery(OrderShowContentDO record, OrderShowContentQuery query);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(OrderShowContentDO record);
}
