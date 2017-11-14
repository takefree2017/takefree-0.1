package com.takefree.mapper;

import com.takefree.model.ShareCounterDO;
import com.takefree.query.ShareCounterQuery;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
/**
 * MyBatis Mapper for ShareCounter.
 */
 @Mapper
 @Repository

public interface ShareCounterMapper {
    /**
     * query count by query condition.
     */
    int countByQuery(ShareCounterQuery query);

    /**
     * delete by query condition.
     */
    int deleteByQuery(ShareCounterQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(ShareCounterDO record);

    /**
     * insert selective.
     */
    int insertSelective(ShareCounterDO record);

    /**
     * select by query condition.
     */
    List<ShareCounterDO> selectByQuery(ShareCounterQuery query);

    /**
     * select by primary key.
     */
    ShareCounterDO selectByPrimaryKey(Long id);

    /**
     * update by query condition selective.
     */
    int updateByQuerySelective(@Param("record") ShareCounterDO record, @Param("query") ShareCounterQuery query);

    /**
     * update by query condition.
     */
    int updateByQuery(@Param("record") ShareCounterDO record, @Param("query") ShareCounterQuery query);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(ShareCounterDO record);
}
