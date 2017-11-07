package com.takefree.dao;

import com.takefree.model.ShareDescDO;
import com.takefree.query.ShareDescQuery;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
/**
 * MyBatis Mapper for ShareDesc.
 */
 @Mapper
 @Repository

public interface ShareDescMapper {
    /**
     * query count by query condition.
     */
    int countByQuery(ShareDescQuery query);

    /**
     * delete by query condition.
     */
    int deleteByQuery(ShareDescQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(ShareDescDO record);

    /**
     * insert selective.
     */
    int insertSelective(ShareDescDO record);

    /**
     * select by query condition.
     */
    List<ShareDescDO> selectByQuery(ShareDescQuery query);

    /**
     * select by primary key.
     */
    ShareDescDO selectByPrimaryKey(Long id);

    /**
     * update by query condition selective.
     */
    int updateByQuerySelective(@Param("record") ShareDescDO record, @Param("query") ShareDescQuery query);

    /**
     * update by query condition.
     */
    int updateByQuery(@Param("record") ShareDescDO record, @Param("query") ShareDescQuery query);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(ShareDescDO record);
}
