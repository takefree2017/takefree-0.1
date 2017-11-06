package com.takefree.service;

import com.takefree.common.PageResult;
import com.takefree.model.TakeApplicationDO;
import com.takefree.query.TakeApplicationQuery;

import java.util.List;


/**
 * Manager for TakeApplication.
 */

public interface TakeApplicationManager {
    /**
     * query count by query condition.
     */
    int countByQuery(TakeApplicationQuery query);

    /**
     * delete by query condition.
     */
    int deleteByQuery(TakeApplicationQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(TakeApplicationDO record);

    /**
     * insert selective.
     */
    long insertSelective(TakeApplicationDO record);

    /**
     * select by query condition.
     */
    List<TakeApplicationDO> selectByQuery(TakeApplicationQuery query);


    /**
     * select by query condition with page.
     */
    PageResult<TakeApplicationDO> selectByQueryWithPage(TakeApplicationQuery query);

    /**
     * select by primary key.
     */
    TakeApplicationDO selectByPrimaryKey(Long id);

    /**
     * update by query condition selective.
     */
    int updateByQuerySelective(TakeApplicationDO record, TakeApplicationQuery query);

    /**
     * update by query condition.
     */
    int updateByQuery(TakeApplicationDO record, TakeApplicationQuery query);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(TakeApplicationDO record);
}
