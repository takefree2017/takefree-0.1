package com.takefree.mapper;

import com.takefree.model.ShareLbsDO;
import com.takefree.query.ShareLbsQuery;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
/**
 * MyBatis Mapper for ShareLbs.
 */
 @Mapper
 @Repository

public interface ShareLbsMapper {
    /**
     * query count by query condition.
     */
    int countByQuery(ShareLbsQuery query);

    /**
     * delete by query condition.
     */
    int deleteByQuery(ShareLbsQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(ShareLbsDO record);

    /**
     * insert selective.
     */
    int insertSelective(ShareLbsDO record);

    /**
     * select by query condition.
     */
    List<ShareLbsDO> selectByQuery(ShareLbsQuery query);

    /**
     * select by primary key.
     */
    ShareLbsDO selectByPrimaryKey(Long id);

    /**
     * update by query condition selective.
     */
    int updateByQuerySelective(@Param("record") ShareLbsDO record, @Param("query") ShareLbsQuery query);

    /**
     * update by query condition.
     */
    int updateByQuery(@Param("record") ShareLbsDO record, @Param("query") ShareLbsQuery query);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(ShareLbsDO record);
}
