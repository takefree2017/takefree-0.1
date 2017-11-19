package com.takefree.pojo.mapper;

import com.takefree.pojo.model.CategoryLike;
import com.takefree.pojo.query.CategoryLikeQuery;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

;

@Mapper
@Repository
public interface CategoryLikeMapper {
    /**
     * This method corresponds to the database table category_like
     * @mbg.generated
     */
    long countByExample(CategoryLikeQuery example);

    /**
     * This method corresponds to the database table category_like
     * @mbg.generated
     */
    int deleteByExample(CategoryLikeQuery example);

    /**
     * This method corresponds to the database table category_like
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method corresponds to the database table category_like
     * @mbg.generated
     */
    int insert(CategoryLike record);

    /**
     * This method corresponds to the database table category_like
     * @mbg.generated
     */
    int insertSelective(CategoryLike record);

    /**
     * This method corresponds to the database table category_like
     * @mbg.generated
     */
    List<CategoryLike> selectByExample(CategoryLikeQuery example);

    /**
     * This method corresponds to the database table category_like
     * @mbg.generated
     */
    CategoryLike selectByPrimaryKey(Long id);

    /**
     * This method corresponds to the database table category_like
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") CategoryLike record, @Param("example") CategoryLikeQuery example);

    /**
     * This method corresponds to the database table category_like
     * @mbg.generated
     */
    int updateByExample(@Param("record") CategoryLike record, @Param("example") CategoryLikeQuery example);

    /**
     * This method corresponds to the database table category_like
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(CategoryLike record);

    /**
     * This method corresponds to the database table category_like
     * @mbg.generated
     */
    int updateByPrimaryKey(CategoryLike record);
}
