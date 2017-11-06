package com.takefree.service;

import com.takefree.common.PageResult;
import com.takefree.model.ShareDO;
import com.takefree.query.ShareQuery;

import java.util.List;


/**
 * Manager for Share.
 */

public interface ShareManager {
    /**
     * query count by query condition.
     */
    int countByQuery(ShareQuery query);

    /**
     * delete by query condition.
     */
    int deleteByQuery(ShareQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(ShareDO record);

    /**
     * insert selective.
     */
    long insertSelective(ShareDO record);

    /**
     * select by query condition.
     */
    List<ShareDO> selectByQuery(ShareQuery query);


    /**
     * select by query condition with page.
     */
    PageResult<ShareDO> selectByQueryWithPage(ShareQuery query);

    /**
     * select by primary key.
     */
    ShareDO selectByPrimaryKey(Long id);

    /**
     * update by query condition selective.
     */
    int updateByQuerySelective(ShareDO record, ShareQuery query);

    /**
     * update by query condition.
     */
    int updateByQuery(ShareDO record, ShareQuery query);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(ShareDO record);
}
