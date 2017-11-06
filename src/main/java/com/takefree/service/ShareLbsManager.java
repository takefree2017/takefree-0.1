package com.takefree.service;

import com.takefree.common.PageResult;
import com.takefree.model.ShareLbsDO;
import com.takefree.query.ShareLbsQuery;

import java.util.List;


/**
 * Manager for ShareLbs.
 */

public interface ShareLbsManager {
    /**
     * query count by query condition.
     */
    int countByQuery(ShareLbsQuery query);

    /**
     * delete by query condition.
     */
    int deleteByQuery(ShareLbsQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(ShareLbsDO record);

    /**
     * insert selective.
     */
    long insertSelective(ShareLbsDO record);

    /**
     * select by query condition.
     */
    List<ShareLbsDO> selectByQuery(ShareLbsQuery query);


    /**
     * select by query condition with page.
     */
    PageResult<ShareLbsDO> selectByQueryWithPage(ShareLbsQuery query);

    /**
     * select by primary key.
     */
    ShareLbsDO selectByPrimaryKey(Long id);

    /**
     * update by query condition selective.
     */
    int updateByQuerySelective(ShareLbsDO record, ShareLbsQuery query);

    /**
     * update by query condition.
     */
    int updateByQuery(ShareLbsDO record, ShareLbsQuery query);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(ShareLbsDO record);
}
