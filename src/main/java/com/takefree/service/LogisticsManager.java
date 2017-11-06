package com.takefree.service;

import com.takefree.common.PageResult;
import com.takefree.model.LogisticsDO;
import com.takefree.query.LogisticsQuery;

import java.util.List;


/**
 * Manager for Logistics.
 */

public interface LogisticsManager {
    /**
     * query count by query condition.
     */
    int countByQuery(LogisticsQuery query);

    /**
     * delete by query condition.
     */
    int deleteByQuery(LogisticsQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(LogisticsDO record);

    /**
     * insert selective.
     */
    long insertSelective(LogisticsDO record);

    /**
     * select by query condition.
     */
    List<LogisticsDO> selectByQuery(LogisticsQuery query);


    /**
     * select by query condition with page.
     */
    PageResult<LogisticsDO> selectByQueryWithPage(LogisticsQuery query);

    /**
     * select by primary key.
     */
    LogisticsDO selectByPrimaryKey(Long id);

    /**
     * update by query condition selective.
     */
    int updateByQuerySelective(LogisticsDO record, LogisticsQuery query);

    /**
     * update by query condition.
     */
    int updateByQuery(LogisticsDO record, LogisticsQuery query);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(LogisticsDO record);
}
