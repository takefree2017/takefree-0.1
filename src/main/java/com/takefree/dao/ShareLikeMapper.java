package com.takefree.dao;

import com.takefree.model.ShareLikeDO;
import com.takefree.query.ShareLikeQuery;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
/**
 * MyBatis Mapper for ShareLike.
 */
 @Mapper
 @Repository

public interface ShareLikeMapper {
    /**
     * query count by query condition.
     */
    int countByQuery(ShareLikeQuery query);

    /**
     * delete by query condition.
     */
    int deleteByQuery(ShareLikeQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(ShareLikeDO record);

    /**
     * insert selective.
     */
    int insertSelective(ShareLikeDO record);

    /**
     * select by query condition.
     */
    List<ShareLikeDO> selectByQuery(ShareLikeQuery query);

    /**
     * select by primary key.
     */
    ShareLikeDO selectByPrimaryKey(Long id);

    /**
     * update by query condition selective.
     */
    int updateByQuerySelective(@Param("record") ShareLikeDO record, @Param("query") ShareLikeQuery query);

    /**
     * update by query condition.
     */
    int updateByQuery(@Param("record") ShareLikeDO record, @Param("query") ShareLikeQuery query);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(ShareLikeDO record);
}
