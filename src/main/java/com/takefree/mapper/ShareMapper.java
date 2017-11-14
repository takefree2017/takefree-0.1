package com.takefree.mapper;

import com.takefree.model.ShareDO;
import com.takefree.query.ShareQuery;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
/**
 * MyBatis Mapper for ShareDTO.
 */
 @Mapper
 @Repository

public interface ShareMapper {
    /**
     * query count by query condition.
     */
    int countByQuery(ShareQuery query);

    /**
     * delete by query condition.
     */
    int deleteByQuery(ShareQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(ShareDO record);

    /**
     * insert selective.
     */
    int insertSelective(ShareDO record);

    /**
     * select by query condition.
     */
    List<ShareDO> selectByQuery(ShareQuery query);

    /**
     * select by primary key.
     */
    ShareDO selectByPrimaryKey(Long id);

    /**
     * update by query condition selective.
     */
    int updateByQuerySelective(@Param("record") ShareDO record, @Param("query") ShareQuery query);

    /**
     * update by query condition.
     */
    int updateByQuery(@Param("record") ShareDO record, @Param("query") ShareQuery query);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(ShareDO record);
}
