package com.takefree.service;

import com.takefree.common.PageResult;
import com.takefree.model.MoodInfoDO;
import com.takefree.query.MoodInfoQuery;

import java.util.List;


/**
 * Manager for MoodInfo.
 */

public interface MoodInfoManager {
    /**
     * query count by query condition.
     */
    int countByQuery(MoodInfoQuery query);

    /**
     * delete by query condition.
     */
    int deleteByQuery(MoodInfoQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(MoodInfoDO record);

    /**
     * insert selective.
     */
    long insertSelective(MoodInfoDO record);

    /**
     * select by query condition.
     */
    List<MoodInfoDO> selectByQuery(MoodInfoQuery query);


    /**
     * select by query condition with page.
     */
    PageResult<MoodInfoDO> selectByQueryWithPage(MoodInfoQuery query);

    /**
     * select by primary key.
     */
    MoodInfoDO selectByPrimaryKey(Long id);

    /**
     * update by query condition selective.
     */
    int updateByQuerySelective(MoodInfoDO record, MoodInfoQuery query);

    /**
     * update by query condition.
     */
    int updateByQuery(MoodInfoDO record, MoodInfoQuery query);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(MoodInfoDO record);
}
