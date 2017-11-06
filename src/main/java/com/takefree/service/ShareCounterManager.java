package com.takefree.service;

import com.takefree.common.PageResult;
import com.takefree.model.ShareCounterDO;
import com.takefree.query.ShareCounterQuery;

import java.util.List;


/**
 * Manager for ShareCounter.
 */

public interface ShareCounterManager {
    /**
     * query count by query condition.
     */
    int countByQuery(ShareCounterQuery query);

    /**
     * delete by query condition.
     */
    int deleteByQuery(ShareCounterQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(ShareCounterDO record);

    /**
     * insert selective.
     */
    long insertSelective(ShareCounterDO record);

    /**
     * select by query condition.
     */
    List<ShareCounterDO> selectByQuery(ShareCounterQuery query);


    /**
     * select by query condition with page.
     */
    PageResult<ShareCounterDO> selectByQueryWithPage(ShareCounterQuery query);

    /**
     * select by primary key.
     */
    ShareCounterDO selectByPrimaryKey(Long id);

    /**
     * update by query condition selective.
     */
    int updateByQuerySelective(ShareCounterDO record, ShareCounterQuery query);

    /**
     * update by query condition.
     */
    int updateByQuery(ShareCounterDO record, ShareCounterQuery query);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(ShareCounterDO record);
}
