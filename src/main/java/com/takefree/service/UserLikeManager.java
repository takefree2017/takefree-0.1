package com.takefree.service;

import com.takefree.common.PageResult;
import com.takefree.model.UserLikeDO;
import com.takefree.query.UserLikeQuery;

import java.util.List;


/**
 * Manager for UserLike.
 */

public interface UserLikeManager {
    /**
     * query count by query condition.
     */
    int countByQuery(UserLikeQuery query);

    /**
     * delete by query condition.
     */
    int deleteByQuery(UserLikeQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(UserLikeDO record);

    /**
     * insert selective.
     */
    long insertSelective(UserLikeDO record);

    /**
     * select by query condition.
     */
    List<UserLikeDO> selectByQuery(UserLikeQuery query);


    /**
     * select by query condition with page.
     */
    PageResult<UserLikeDO> selectByQueryWithPage(UserLikeQuery query);

    /**
     * select by primary key.
     */
    UserLikeDO selectByPrimaryKey(Long id);

    /**
     * update by query condition selective.
     */
    int updateByQuerySelective(UserLikeDO record, UserLikeQuery query);

    /**
     * update by query condition.
     */
    int updateByQuery(UserLikeDO record, UserLikeQuery query);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(UserLikeDO record);
}
