package com.takefree.pojo.mapper;

import com.takefree.dto.model.CategoryDTO;
import com.takefree.pojo.model.CategoryInfo;
import com.takefree.pojo.query.CategoryInfoQuery;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;


@Mapper
@Repository
public interface CategoryInfoMapper {
   
//	@Select("SELECT id,category_name as categoryName from category_info" )
	List<CategoryInfo> getAll();
	
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
