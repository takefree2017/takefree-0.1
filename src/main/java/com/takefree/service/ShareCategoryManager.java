package com.takefree.service;

import com.takefree.common.PageResult;
import com.takefree.model.ShareCategoryDO;
import com.takefree.query.ShareCategoryQuery;

import java.util.List;


/**
 * Manager for ShareCategory.
 */

public interface ShareCategoryManager {
    /**
     * query count by query condition.
     */
    int countByQuery(ShareCategoryQuery query);

    /**
     * delete by query condition.
     */
    int deleteByQuery(ShareCategoryQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(ShareCategoryDO record);

    /**
     * insert selective.
     */
    long insertSelective(ShareCategoryDO record);

    /**
     * select by query condition.
     */
    List<ShareCategoryDO> selectByQuery(ShareCategoryQuery query);


    /**
     * select by query condition with page.
     */
    PageResult<ShareCategoryDO> selectByQueryWithPage(ShareCategoryQuery query);

    /**
     * select by primary key.
     */
    ShareCategoryDO selectByPrimaryKey(Long id);

    /**
     * update by query condition selective.
     */
    int updateByQuerySelective(ShareCategoryDO record, ShareCategoryQuery query);

    /**
     * update by query condition.
     */
    int updateByQuery(ShareCategoryDO record, ShareCategoryQuery query);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(ShareCategoryDO record);
}
