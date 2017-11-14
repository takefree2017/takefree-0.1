package com.takefree.mapper;

import com.takefree.model.LogisticsDO;
import com.takefree.query.LogisticsQuery;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
/**
 * MyBatis Mapper for Logistics.
 */
 @Mapper
 @Repository

public interface LogisticsMapper {
    /**
     * query count by query condition.
     */
    int countByQuery(LogisticsQuery query);

    /**
     * delete by query condition.
     */
    int deleteByQuery(LogisticsQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(LogisticsDO record);

    /**
     * insert selective.
     */
    int insertSelective(LogisticsDO record);

    /**
     * select by query condition.
     */
    List<LogisticsDO> selectByQuery(LogisticsQuery query);

    /**
     * select by primary key.
     */
    LogisticsDO selectByPrimaryKey(Long id);

    /**
     * update by query condition selective.
     */
    int updateByQuerySelective(@Param("record") LogisticsDO record, @Param("query") LogisticsQuery query);

    /**
     * update by query condition.
     */
    int updateByQuery(@Param("record") LogisticsDO record, @Param("query") LogisticsQuery query);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(LogisticsDO record);
}
