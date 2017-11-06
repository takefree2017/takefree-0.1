package com.takefree.service;

import com.takefree.common.PageResult;
import com.takefree.model.ShowCounterDO;
import com.takefree.query.ShowCounterQuery;

import java.util.List;


/**
 * Manager for ShowCounter.
 */

public interface ShowCounterManager {
    /**
     * query count by query condition.
     */
    int countByQuery(ShowCounterQuery query);

    /**
     * delete by query condition.
     */
    int deleteByQuery(ShowCounterQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(ShowCounterDO record);

    /**
     * insert selective.
     */
    long insertSelective(ShowCounterDO record);

    /**
     * select by query condition.
     */
    List<ShowCounterDO> selectByQuery(ShowCounterQuery query);


    /**
     * select by query condition with page.
     */
    PageResult<ShowCounterDO> selectByQueryWithPage(ShowCounterQuery query);

    /**
     * select by primary key.
     */
    ShowCounterDO selectByPrimaryKey(Long id);

    /**
     * update by query condition selective.
     */
    int updateByQuerySelective(ShowCounterDO record, ShowCounterQuery query);

    /**
     * update by query condition.
     */
    int updateByQuery(ShowCounterDO record, ShowCounterQuery query);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(ShowCounterDO record);
}
