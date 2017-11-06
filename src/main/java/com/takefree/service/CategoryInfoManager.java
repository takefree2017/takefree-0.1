package com.takefree.service;

import com.takefree.common.PageResult;
import com.takefree.model.CategoryInfoDO;
import com.takefree.query.CategoryInfoQuery;

import java.util.List;


/**
 * Manager for CategoryInfo.
 */

public interface CategoryInfoManager {
    /**
     * query count by query condition.
     */
    int countByQuery(CategoryInfoQuery query);

    /**
     * delete by query condition.
     */
    int deleteByQuery(CategoryInfoQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(CategoryInfoDO record);

    /**
     * insert selective.
     */
    long insertSelective(CategoryInfoDO record);

    /**
     * select by query condition.
     */
    List<CategoryInfoDO> selectByQuery(CategoryInfoQuery query);


    /**
     * select by query condition with page.
     */
    PageResult<CategoryInfoDO> selectByQueryWithPage(CategoryInfoQuery query);

    /**
     * select by primary key.
     */
    CategoryInfoDO selectByPrimaryKey(Long id);

    /**
     * update by query condition selective.
     */
    int updateByQuerySelective(CategoryInfoDO record, CategoryInfoQuery query);

    /**
     * update by query condition.
     */
    int updateByQuery(CategoryInfoDO record, CategoryInfoQuery query);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(CategoryInfoDO record);
}
