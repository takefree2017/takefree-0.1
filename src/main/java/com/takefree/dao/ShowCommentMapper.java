package com.takefree.dao;

import com.takefree.model.ShowCommentDO;
import com.takefree.query.ShowCommentQuery;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
/**
 * MyBatis Mapper for ShowComment.
 */
 @Mapper
 @Repository

public interface ShowCommentMapper {
    /**
     * query count by query condition.
     */
    int countByQuery(ShowCommentQuery query);

    /**
     * delete by query condition.
     */
    int deleteByQuery(ShowCommentQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(ShowCommentDO record);

    /**
     * insert selective.
     */
    int insertSelective(ShowCommentDO record);

    /**
     * select by query condition.
     */
    List<ShowCommentDO> selectByQuery(ShowCommentQuery query);

    /**
     * select by primary key.
     */
    ShowCommentDO selectByPrimaryKey(Long id);

    /**
     * update by query condition selective.
     */
    int updateByQuerySelective(@Param("record") ShowCommentDO record, @Param("query") ShowCommentQuery query);

    /**
     * update by query condition.
     */
    int updateByQuery(@Param("record") ShowCommentDO record, @Param("query") ShowCommentQuery query);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(ShowCommentDO record);
}
