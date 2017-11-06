package com.takefree.service;

import com.takefree.common.PageResult;
import com.takefree.model.ShareDescDO;
import com.takefree.query.ShareDescQuery;

import java.util.List;


/**
 * Manager for ShareDesc.
 */

public interface ShareDescManager {
    /**
     * query count by query condition.
     */
    int countByQuery(ShareDescQuery query);

    /**
     * delete by query condition.
     */
    int deleteByQuery(ShareDescQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(ShareDescDO record);

    /**
     * insert selective.
     */
    long insertSelective(ShareDescDO record);

    /**
     * select by query condition.
     */
    List<ShareDescDO> selectByQuery(ShareDescQuery query);


    /**
     * select by query condition with page.
     */
    PageResult<ShareDescDO> selectByQueryWithPage(ShareDescQuery query);

    /**
     * select by primary key.
     */
    ShareDescDO selectByPrimaryKey(Long id);

    /**
     * update by query condition selective.
     */
    int updateByQuerySelective(ShareDescDO record, ShareDescQuery query);

    /**
     * update by query condition.
     */
    int updateByQuery(ShareDescDO record, ShareDescQuery query);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(ShareDescDO record);
}
