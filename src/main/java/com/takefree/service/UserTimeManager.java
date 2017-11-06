package com.takefree.service;

import com.takefree.common.PageResult;
import com.takefree.model.UserTimeDO;
import com.takefree.query.UserTimeQuery;

import java.util.List;


/**
 * Manager for UserTime.
 */

public interface UserTimeManager {
    /**
     * query count by query condition.
     */
    int countByQuery(UserTimeQuery query);

    /**
     * delete by query condition.
     */
    int deleteByQuery(UserTimeQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(UserTimeDO record);

    /**
     * insert selective.
     */
    long insertSelective(UserTimeDO record);

    /**
     * select by query condition.
     */
    List<UserTimeDO> selectByQuery(UserTimeQuery query);


    /**
     * select by query condition with page.
     */
    PageResult<UserTimeDO> selectByQueryWithPage(UserTimeQuery query);

    /**
     * select by primary key.
     */
    UserTimeDO selectByPrimaryKey(Long id);

    /**
     * update by query condition selective.
     */
    int updateByQuerySelective(UserTimeDO record, UserTimeQuery query);

    /**
     * update by query condition.
     */
    int updateByQuery(UserTimeDO record, UserTimeQuery query);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(UserTimeDO record);
}
