package com.takefree.dao;

import com.takefree.model.RegionInfoDO;
import com.takefree.query.RegionInfoQuery;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * MyBatis Mapper for RegionInfo.
 */
@Mapper
@Repository

public interface RegionInfoMapper {

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
    int insertSelective(RegionInfoDO record);

    /**
     * select by query condition.
     */
    List<RegionInfoDO> selectByQuery(RegionInfoQuery query);

    /**
     * select by primary key.
     */
    RegionInfoDO selectByPrimaryKey(Long id);

    /**
     * update by query condition selective.
     */
    int updateByQuerySelective(@Param("record") RegionInfoDO record, @Param("query") RegionInfoQuery query);

    /**
     * update by query condition.
     */
    int updateByQuery(@Param("record") RegionInfoDO record, @Param("query") RegionInfoQuery query);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(RegionInfoDO record);
}
