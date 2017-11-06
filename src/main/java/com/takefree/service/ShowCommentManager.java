package com.takefree.service;

import com.takefree.common.PageResult;
import com.takefree.model.ShowCommentDO;
import com.takefree.query.ShowCommentQuery;

import java.util.List;


/**
 * Manager for ShowComment.
 */

public interface ShowCommentManager {
    /**
     * query count by query condition.
     */
    int countByQuery(ShowCommentQuery query);

    /**
     * delete by query condition.
     */
    int deleteByQuery(ShowCommentQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(ShowCommentDO record);

    /**
     * insert selective.
     */
    long insertSelective(ShowCommentDO record);

    /**
     * select by query condition.
     */
    List<ShowCommentDO> selectByQuery(ShowCommentQuery query);


    /**
     * select by query condition with page.
     */
    PageResult<ShowCommentDO> selectByQueryWithPage(ShowCommentQuery query);

    /**
     * select by primary key.
     */
    ShowCommentDO selectByPrimaryKey(Long id);

    /**
     * update by query condition selective.
     */
    int updateByQuerySelective(ShowCommentDO record, ShowCommentQuery query);

    /**
     * update by query condition.
     */
    int updateByQuery(ShowCommentDO record, ShowCommentQuery query);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(ShowCommentDO record);
}
