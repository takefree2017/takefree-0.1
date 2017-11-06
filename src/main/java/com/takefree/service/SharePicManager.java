package com.takefree.service;

import com.takefree.common.PageResult;
import com.takefree.model.SharePicDO;
import com.takefree.query.SharePicQuery;

import java.util.List;


/**
 * Manager for SharePic.
 */

public interface SharePicManager {
    /**
     * query count by query condition.
     */
    int countByQuery(SharePicQuery query);

    /**
     * delete by query condition.
     */
    int deleteByQuery(SharePicQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(SharePicDO record);

    /**
     * insert selective.
     */
    long insertSelective(SharePicDO record);

    /**
     * select by query condition.
     */
    List<SharePicDO> selectByQuery(SharePicQuery query);


    /**
     * select by query condition with page.
     */
    PageResult<SharePicDO> selectByQueryWithPage(SharePicQuery query);

    /**
     * select by primary key.
     */
    SharePicDO selectByPrimaryKey(Long id);

    /**
     * update by query condition selective.
     */
    int updateByQuerySelective(SharePicDO record, SharePicQuery query);

    /**
     * update by query condition.
     */
    int updateByQuery(SharePicDO record, SharePicQuery query);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(SharePicDO record);
}
