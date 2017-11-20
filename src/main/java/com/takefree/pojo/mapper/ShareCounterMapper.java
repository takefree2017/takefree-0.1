package com.takefree.pojo.mapper;

import com.takefree.pojo.model.ShareCounter;
import com.takefree.pojo.query.ShareCounterQuery;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ShareCounterMapper {
    /**
     * This method corresponds to the database table share_counter
     * @mbg.generated
     */
    long countByExample(ShareCounterQuery example);

    /**
     * This method corresponds to the database table share_counter
     * @mbg.generated
     */
    int deleteByExample(ShareCounterQuery example);

    /**
     * This method corresponds to the database table share_counter
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long shareId);

    /**
     * This method corresponds to the database table share_counter
     * @mbg.generated
     */
    int insert(ShareCounter record);

    /**
     * This method corresponds to the database table share_counter
     * @mbg.generated
     */
    int insertSelective(ShareCounter record);

    /**
     * This method corresponds to the database table share_counter
     * @mbg.generated
     */
    List<ShareCounter> selectByExample(ShareCounterQuery example);

    /**
     * This method corresponds to the database table share_counter
     * @mbg.generated
     */
    ShareCounter selectByPrimaryKey(Long shareId);

    /**
     * This method corresponds to the database table share_counter
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") ShareCounter record, @Param("example") ShareCounterQuery example);

    /**
     * This method corresponds to the database table share_counter
     * @mbg.generated
     */
    int updateByExample(@Param("record") ShareCounter record, @Param("example") ShareCounterQuery example);

    /**
     * This method corresponds to the database table share_counter
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(ShareCounter record);

    /**
     * This method corresponds to the database table share_counter
     * @mbg.generated
     */
    int updateByPrimaryKey(ShareCounter record);

    /**
     *
     * @param shareId
     * @param number 负数是为删除
     * @return
     */
    int addLikeCount(@Param("shareId") Long shareId,@Param("number") Integer number);

    int addApplyCount(@Param("shareId") Long shareId,@Param("number") Integer number);

    int addViewCount(@Param("shareId") Long shareId,@Param("number") Integer number);

}
