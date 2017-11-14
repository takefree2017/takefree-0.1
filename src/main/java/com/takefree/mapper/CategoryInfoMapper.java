package com.takefree.mapper;

import com.takefree.model.CategoryInfoDO;
import com.takefree.query.CategoryInfoQuery;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
/**
 * MyBatis Mapper for CategoryInfo.
 */
 @Mapper
 @Repository

public interface CategoryInfoMapper {
    /**
     * query count by query condition.
     */
    int countByQuery(CategoryInfoQuery query);

    /**
     * delete by query condition.
     */
    int deleteByQuery(CategoryInfoQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(CategoryInfoDO record);

    /**
     * insert selective.
     */
    int insertSelective(CategoryInfoDO record);

    /**
     * select by query condition.
     */
    List<CategoryInfoDO> selectByQuery(CategoryInfoQuery query);

    /**
     * select by primary key.
     */
    CategoryInfoDO selectByPrimaryKey(Long id);

    /**
     * update by query condition selective.
     */
    int updateByQuerySelective(@Param("record") CategoryInfoDO record, @Param("query") CategoryInfoQuery query);

    /**
     * update by query condition.
     */
    int updateByQuery(@Param("record") CategoryInfoDO record, @Param("query") CategoryInfoQuery query);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(CategoryInfoDO record);
}
