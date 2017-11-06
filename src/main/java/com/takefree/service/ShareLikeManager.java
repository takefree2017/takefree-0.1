package com.takefree.service;

import com.takefree.common.PageResult;
import com.takefree.model.ShareLikeDO;
import com.takefree.query.ShareLikeQuery;

import java.util.List;


/**
 * Manager for ShareLike.
 */

public interface ShareLikeManager {
    /**
     * query count by query condition.
     */
    int countByQuery(ShareLikeQuery query);

    /**
     * delete by query condition.
     */
    int deleteByQuery(ShareLikeQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(ShareLikeDO record);

    /**
     * insert selective.
     */
    long insertSelective(ShareLikeDO record);

    /**
     * select by query condition.
     */
    List<ShareLikeDO> selectByQuery(ShareLikeQuery query);


    /**
     * select by query condition with page.
     */
    PageResult<ShareLikeDO> selectByQueryWithPage(ShareLikeQuery query);

    /**
     * select by primary key.
     */
    ShareLikeDO selectByPrimaryKey(Long id);

    /**
     * update by query condition selective.
     */
    int updateByQuerySelective(ShareLikeDO record, ShareLikeQuery query);

    /**
     * update by query condition.
     */
    int updateByQuery(ShareLikeDO record, ShareLikeQuery query);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(ShareLikeDO record);
}
