package com.takefree.service;

import com.takefree.common.PageResult;
import com.takefree.model.CategoryLikeDO;
import com.takefree.query.CategoryLikeQuery;

import java.util.List;


/**
 * Manager for CategoryLike.
 */

public interface CategoryLikeManager {
    /**
     * query count by query condition.
     */
    int countByQuery(CategoryLikeQuery query);

    /**
     * delete by query condition.
     */
    int deleteByQuery(CategoryLikeQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(CategoryLikeDO record);

    /**
     * insert selective.
     */
    long insertSelective(CategoryLikeDO record);

    /**
     * select by query condition.
     */
    List<CategoryLikeDO> selectByQuery(CategoryLikeQuery query);


    /**
     * select by query condition with page.
     */
    PageResult<CategoryLikeDO> selectByQueryWithPage(CategoryLikeQuery query);

    /**
     * select by primary key.
     */
    CategoryLikeDO selectByPrimaryKey(Long id);

    /**
     * update by query condition selective.
     */
    int updateByQuerySelective(CategoryLikeDO record, CategoryLikeQuery query);

    /**
     * update by query condition.
     */
    int updateByQuery(CategoryLikeDO record, CategoryLikeQuery query);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(CategoryLikeDO record);
}
