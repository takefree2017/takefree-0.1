package com.takefree.service;

import com.takefree.common.PageResult;
import com.takefree.model.ShowLikeDO;
import com.takefree.query.ShowLikeQuery;

import java.util.List;


/**
 * Manager for ShowLike.
 */

public interface ShowLikeManager {
    /**
     * query count by query condition.
     */
    int countByQuery(ShowLikeQuery query);

    /**
     * delete by query condition.
     */
    int deleteByQuery(ShowLikeQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(ShowLikeDO record);

    /**
     * insert selective.
     */
    long insertSelective(ShowLikeDO record);

    /**
     * select by query condition.
     */
    List<ShowLikeDO> selectByQuery(ShowLikeQuery query);


    /**
     * select by query condition with page.
     */
    PageResult<ShowLikeDO> selectByQueryWithPage(ShowLikeQuery query);

    /**
     * select by primary key.
     */
    ShowLikeDO selectByPrimaryKey(Long id);

    /**
     * update by query condition selective.
     */
    int updateByQuerySelective(ShowLikeDO record, ShowLikeQuery query);

    /**
     * update by query condition.
     */
    int updateByQuery(ShowLikeDO record, ShowLikeQuery query);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(ShowLikeDO record);
}
