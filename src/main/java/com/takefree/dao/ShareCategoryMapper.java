package com.takefree.dao;

import com.takefree.model.ShareCategoryDO;
import com.takefree.query.ShareCategoryQuery;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
/**
 * MyBatis Mapper for ShareCategory.
 */
 @Mapper
 @Repository

public interface ShareCategoryMapper {
    /**
     * query count by query condition.
     */
    int countByQuery(ShareCategoryQuery query);

    /**
     * delete by query condition.
     */
    int deleteByQuery(ShareCategoryQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(ShareCategoryDO record);

    /**
     * insert selective.
     */
    int insertSelective(ShareCategoryDO record);

    /**
     * select by query condition.
     */
    List<ShareCategoryDO> selectByQuery(ShareCategoryQuery query);

    /**
     * select by primary key.
     */
    ShareCategoryDO selectByPrimaryKey(Long id);

    /**
     * update by query condition selective.
     */
    int updateByQuerySelective(@Param("record") ShareCategoryDO record, @Param("query") ShareCategoryQuery query);

    /**
     * update by query condition.
     */
    int updateByQuery(@Param("record") ShareCategoryDO record, @Param("query") ShareCategoryQuery query);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(ShareCategoryDO record);
}
