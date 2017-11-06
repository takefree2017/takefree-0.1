package com.takefree.dao;

import com.takefree.model.MoodInfoDO;
import com.takefree.query.MoodInfoQuery;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * MyBatis Mapper for MoodInfo.
 */
@Mapper
@Repository

public interface MoodInfoMapper {

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
    int insertSelective(MoodInfoDO record);

    /**
     * select by query condition.
     */
    List<MoodInfoDO> selectByQuery(MoodInfoQuery query);

    /**
     * select by primary key.
     */
    MoodInfoDO selectByPrimaryKey(Long id);

    /**
     * update by query condition selective.
     */
    int updateByQuerySelective(@Param("record") MoodInfoDO record, @Param("query") MoodInfoQuery query);

    /**
     * update by query condition.
     */
    int updateByQuery(@Param("record") MoodInfoDO record, @Param("query") MoodInfoQuery query);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(MoodInfoDO record);
}
