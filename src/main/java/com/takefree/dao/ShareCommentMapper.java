package com.takefree.dao;

import com.takefree.model.ShareCommentDO;
import com.takefree.query.ShareCommentQuery;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
/**
 * MyBatis Mapper for ShareComment.
 */
 @Mapper
 @Repository

public interface ShareCommentMapper {
    /**
     * query count by query condition.
     */
    int countByQuery(ShareCommentQuery query);

    /**
     * delete by query condition.
     */
    int deleteByQuery(ShareCommentQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(ShareCommentDO record);

    /**
     * insert selective.
     */
    int insertSelective(ShareCommentDO record);

    /**
     * select by query condition.
     */
    List<ShareCommentDO> selectByQuery(ShareCommentQuery query);

    /**
     * select by primary key.
     */
    ShareCommentDO selectByPrimaryKey(Long id);

    /**
     * update by query condition selective.
     */
    int updateByQuerySelective(@Param("record") ShareCommentDO record, @Param("query") ShareCommentQuery query);

    /**
     * update by query condition.
     */
    int updateByQuery(@Param("record") ShareCommentDO record, @Param("query") ShareCommentQuery query);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(ShareCommentDO record);
}
