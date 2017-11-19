package com.takefree.pojo.mapper;

import com.takefree.pojo.model.ShareCategory;
import com.takefree.pojo.query.ShareCategoryQuery;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

;

@Mapper
@Repository
public interface ShareCategoryMapper {
    /**
     * This method corresponds to the database table share_category
     * @mbg.generated
     */
    long countByExample(ShareCategoryQuery example);

    /**
     * This method corresponds to the database table share_category
     * @mbg.generated
     */
    int deleteByExample(ShareCategoryQuery example);

    /**
     * This method corresponds to the database table share_category
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method corresponds to the database table share_category
     * @mbg.generated
     */
    int insert(ShareCategory record);

    /**
     * This method corresponds to the database table share_category
     * @mbg.generated
     */
    int insertSelective(ShareCategory record);

    /**
     * This method corresponds to the database table share_category
     * @mbg.generated
     */
    List<ShareCategory> selectByExample(ShareCategoryQuery example);

    /**
     * This method corresponds to the database table share_category
     * @mbg.generated
     */
    ShareCategory selectByPrimaryKey(Long id);

    /**
     * This method corresponds to the database table share_category
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") ShareCategory record, @Param("example") ShareCategoryQuery example);

    /**
     * This method corresponds to the database table share_category
     * @mbg.generated
     */
    int updateByExample(@Param("record") ShareCategory record, @Param("example") ShareCategoryQuery example);

    /**
     * This method corresponds to the database table share_category
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(ShareCategory record);

    /**
     * This method corresponds to the database table share_category
     * @mbg.generated
     */
    int updateByPrimaryKey(ShareCategory record);
}
