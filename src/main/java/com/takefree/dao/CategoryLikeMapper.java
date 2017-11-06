package com.takefree.dao;

import com.takefree.model.CategoryLikeDO;
import com.takefree.query.CategoryLikeQuery;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * MyBatis Mapper for CategoryLike.
 */
@Mapper
@Repository

public interface CategoryLikeMapper {

    /**
     * query count by query condition.
     */
    int countByQuery(CategoryLikeQuery query);

    /**
     * delete by query condition.
     */
    int deleteByQuery(CategoryLikeQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(CategoryLikeDO record);

    /**
     * insert selective.
     */
    int insertSelective(CategoryLikeDO record);

    /**
     * select by query condition.
     */
    List<CategoryLikeDO> selectByQuery(CategoryLikeQuery query);

    /**
     * select by primary key.
     */
    CategoryLikeDO selectByPrimaryKey(Long id);

    /**
     * update by query condition selective.
     */
    int updateByQuerySelective(@Param("record") CategoryLikeDO record, @Param("query") CategoryLikeQuery query);

    /**
     * update by query condition.
     */
    int updateByQuery(@Param("record") CategoryLikeDO record, @Param("query") CategoryLikeQuery query);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(CategoryLikeDO record);
}
