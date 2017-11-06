package com.takefree.service;

import com.takefree.common.PageResult;
import com.takefree.model.RegionInfoDO;
import com.takefree.query.RegionInfoQuery;

import java.util.List;


/**
 * Manager for RegionInfo.
 */

public interface RegionInfoManager {
    /**
     * query count by query condition.
     */
    int countByQuery(RegionInfoQuery query);

    /**
     * delete by query condition.
     */
    int deleteByQuery(RegionInfoQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(RegionInfoDO record);

    /**
     * insert selective.
     */
    long insertSelective(RegionInfoDO record);

    /**
     * select by query condition.
     */
    List<RegionInfoDO> selectByQuery(RegionInfoQuery query);


    /**
     * select by query condition with page.
     */
    PageResult<RegionInfoDO> selectByQueryWithPage(RegionInfoQuery query);

    /**
     * select by primary key.
     */
    RegionInfoDO selectByPrimaryKey(Long id);

    /**
     * update by query condition selective.
     */
    int updateByQuerySelective(RegionInfoDO record, RegionInfoQuery query);

    /**
     * update by query condition.
     */
    int updateByQuery(RegionInfoDO record, RegionInfoQuery query);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(RegionInfoDO record);
}
