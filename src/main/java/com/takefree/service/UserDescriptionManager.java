package com.takefree.service;

import com.takefree.common.PageResult;
import com.takefree.model.UserDescriptionDO;
import com.takefree.query.UserDescriptionQuery;

import java.util.List;


/**
 * Manager for UserDescription.
 */

public interface UserDescriptionManager {
    /**
     * query count by query condition.
     */
    int countByQuery(UserDescriptionQuery query);

    /**
     * delete by query condition.
     */
    int deleteByQuery(UserDescriptionQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(UserDescriptionDO record);

    /**
     * insert selective.
     */
    long insertSelective(UserDescriptionDO record);

    /**
     * select by query condition.
     */
    List<UserDescriptionDO> selectByQuery(UserDescriptionQuery query);


    /**
     * select by query condition with page.
     */
    PageResult<UserDescriptionDO> selectByQueryWithPage(UserDescriptionQuery query);

    /**
     * select by primary key.
     */
    UserDescriptionDO selectByPrimaryKey(Long id);

    /**
     * update by query condition selective.
     */
    int updateByQuerySelective(UserDescriptionDO record, UserDescriptionQuery query);

    /**
     * update by query condition.
     */
    int updateByQuery(UserDescriptionDO record, UserDescriptionQuery query);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(UserDescriptionDO record);
}
