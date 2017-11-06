package com.takefree.service;

import com.takefree.common.PageResult;
import com.takefree.model.ShareCommentDO;
import com.takefree.query.ShareCommentQuery;

import java.util.List;


/**
 * Manager for ShareComment.
 */

public interface ShareCommentManager {
    /**
     * query count by query condition.
     */
    int countByQuery(ShareCommentQuery query);

    /**
     * delete by query condition.
     */
    int deleteByQuery(ShareCommentQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(ShareCommentDO record);

    /**
     * insert selective.
     */
    long insertSelective(ShareCommentDO record);

    /**
     * select by query condition.
     */
    List<ShareCommentDO> selectByQuery(ShareCommentQuery query);


    /**
     * select by query condition with page.
     */
    PageResult<ShareCommentDO> selectByQueryWithPage(ShareCommentQuery query);

    /**
     * select by primary key.
     */
    ShareCommentDO selectByPrimaryKey(Long id);

    /**
     * update by query condition selective.
     */
    int updateByQuerySelective(ShareCommentDO record, ShareCommentQuery query);

    /**
     * update by query condition.
     */
    int updateByQuery(ShareCommentDO record, ShareCommentQuery query);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(ShareCommentDO record);
}
