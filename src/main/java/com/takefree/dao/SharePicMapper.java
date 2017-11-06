package com.takefree.dao;

import com.takefree.model.SharePicDO;
import com.takefree.query.SharePicQuery;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * MyBatis Mapper for SharePic.
 */
@Mapper
@Repository

public interface SharePicMapper {

    /**
     * query count by query condition.
     */
    int countByQuery(SharePicQuery query);

    /**
     * delete by query condition.
     */
    int deleteByQuery(SharePicQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(SharePicDO record);

    /**
     * insert selective.
     */
    int insertSelective(SharePicDO record);

    /**
     * select by query condition.
     */
    List<SharePicDO> selectByQuery(SharePicQuery query);

    /**
     * select by primary key.
     */
    SharePicDO selectByPrimaryKey(Long id);

    /**
     * update by query condition selective.
     */
    int updateByQuerySelective(@Param("record") SharePicDO record, @Param("query") SharePicQuery query);

    /**
     * update by query condition.
     */
    int updateByQuery(@Param("record") SharePicDO record, @Param("query") SharePicQuery query);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(SharePicDO record);
}
