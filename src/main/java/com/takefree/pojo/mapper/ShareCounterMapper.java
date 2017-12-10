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
     * @param number 整数增加，负数减少
     * @return
     */
    int changeLikeCount(@Param("shareId") Long shareId,@Param("number") Integer number);

    /**
     *
     * TODO 只适用新增加申请，删除需要优化
     * @param shareId
     * @param number 整数增加，负数减少
     * @return
     */
    int changeApplyCount(@Param("shareId") Long shareId,@Param("number") Integer number);

    /**
     *
     * @param shareId
     * @param number 整数增加，负数减少
     * @return
     */
    int changeViewCount(@Param("shareId") Long shareId,@Param("number") Integer number);

    /**
     *
     * TODO 只适用新增回复，删除需要优化
     * @param shareId
     * @param number 整数增加，负数减少
     * @return
     */
    int changeCommentCount(@Param("shareId") Long shareId,@Param("number") Integer number);

    /**
     * @param shareId
     * @param number 整数增加，负数减少
     * @return
     */
    int changeNumber(@Param("shareId") Long shareId,@Param("number") Integer number);

    /**
     *
     * @param shareId
     * @param number 整数增加，负数减少
     * @return
     */
    int changeTakeNumber(@Param("shareId") Long shareId,@Param("number") Integer number);

}
