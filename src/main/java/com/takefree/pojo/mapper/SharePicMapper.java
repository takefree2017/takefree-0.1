package com.takefree.pojo.mapper;

import com.takefree.pojo.model.SharePic;
import com.takefree.pojo.query.SharePicQuery;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface SharePicMapper {
    /**
     * This method corresponds to the database table share_pic
     * @mbg.generated
     */
    long countByExample(SharePicQuery example);

    /**
     * This method corresponds to the database table share_pic
     * @mbg.generated
     */
    int deleteByExample(SharePicQuery example);

    /**
     * This method corresponds to the database table share_pic
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method corresponds to the database table share_pic
     * @mbg.generated
     */
    int insert(SharePic record);

    /**
     * This method corresponds to the database table share_pic
     * @mbg.generated
     */
    int insertSelective(SharePic record);

    /**
     * This method corresponds to the database table share_pic
     * @mbg.generated
     */
    List<SharePic> selectByExample(SharePicQuery example);

    /**
     * This method corresponds to the database table share_pic
     * @mbg.generated
     */
    SharePic selectByPrimaryKey(Long id);

    /**
     * This method corresponds to the database table share_pic
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") SharePic record, @Param("example") SharePicQuery example);

    /**
     * This method corresponds to the database table share_pic
     * @mbg.generated
     */
    int updateByExample(@Param("record") SharePic record, @Param("example") SharePicQuery example);

    /**
     * This method corresponds to the database table share_pic
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(SharePic record);

    /**
     * This method corresponds to the database table share_pic
     * @mbg.generated
     */
    int updateByPrimaryKey(SharePic record);
}
