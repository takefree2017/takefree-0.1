package com.takefree.pojo.mapper;

import com.takefree.pojo.model.ShareLbs;
import com.takefree.pojo.query.ShareLbsQuery;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

;

@Mapper
@Repository
public interface ShareLbsMapper {
    /**
     * This method corresponds to the database table share_lbs
     * @mbg.generated
     */
    long countByExample(ShareLbsQuery example);

    /**
     * This method corresponds to the database table share_lbs
     * @mbg.generated
     */
    int deleteByExample(ShareLbsQuery example);

    /**
     * This method corresponds to the database table share_lbs
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long shareId);

    /**
     * This method corresponds to the database table share_lbs
     * @mbg.generated
     */
    int insert(ShareLbs record);

    /**
     * This method corresponds to the database table share_lbs
     * @mbg.generated
     */
    int insertSelective(ShareLbs record);

    /**
     * This method corresponds to the database table share_lbs
     * @mbg.generated
     */
    List<ShareLbs> selectByExample(ShareLbsQuery example);

    /**
     * This method corresponds to the database table share_lbs
     * @mbg.generated
     */
    ShareLbs selectByPrimaryKey(Long shareId);

    /**
     * This method corresponds to the database table share_lbs
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") ShareLbs record, @Param("example") ShareLbsQuery example);

    /**
     * This method corresponds to the database table share_lbs
     * @mbg.generated
     */
    int updateByExample(@Param("record") ShareLbs record, @Param("example") ShareLbsQuery example);

    /**
     * This method corresponds to the database table share_lbs
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(ShareLbs record);

    /**
     * This method corresponds to the database table share_lbs
     * @mbg.generated
     */
    int updateByPrimaryKey(ShareLbs record);
}
