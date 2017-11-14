package com.takefree.mapper;

import com.takefree.model.CategoryInfo;
import com.takefree.query.CategoryInfoQuery;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

;

@Mapper
@Repository
public interface CategoryInfoMapper {
    /**
     * This method corresponds to the database table category_info
     * @mbg.generated
     */
    long countByExample(CategoryInfoQuery example);

    /**
     * This method corresponds to the database table category_info
     * @mbg.generated
     */
    int deleteByExample(CategoryInfoQuery example);

    /**
     * This method corresponds to the database table category_info
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method corresponds to the database table category_info
     * @mbg.generated
     */
    int insert(CategoryInfo record);

    /**
     * This method corresponds to the database table category_info
     * @mbg.generated
     */
    int insertSelective(CategoryInfo record);

    /**
     * This method corresponds to the database table category_info
     * @mbg.generated
     */
    List<CategoryInfo> selectByExample(CategoryInfoQuery example);

    /**
     * This method corresponds to the database table category_info
     * @mbg.generated
     */
    CategoryInfo selectByPrimaryKey(Long id);

    /**
     * This method corresponds to the database table category_info
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") CategoryInfo record, @Param("example") CategoryInfoQuery example);

    /**
     * This method corresponds to the database table category_info
     * @mbg.generated
     */
    int updateByExample(@Param("record") CategoryInfo record, @Param("example") CategoryInfoQuery example);

    /**
     * This method corresponds to the database table category_info
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(CategoryInfo record);

    /**
     * This method corresponds to the database table category_info
     * @mbg.generated
     */
    int updateByPrimaryKey(CategoryInfo record);
}
