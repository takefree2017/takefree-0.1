package com.takefree.mapper;

import com.takefree.model.MoodInfo;
import com.takefree.query.MoodInfoQuery;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

;

@Mapper
@Repository
public interface MoodInfoMapper {
    /**
     * This method corresponds to the database table mood_info
     * @mbg.generated
     */
    long countByExample(MoodInfoQuery example);

    /**
     * This method corresponds to the database table mood_info
     * @mbg.generated
     */
    int deleteByExample(MoodInfoQuery example);

    /**
     * This method corresponds to the database table mood_info
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method corresponds to the database table mood_info
     * @mbg.generated
     */
    int insert(MoodInfo record);

    /**
     * This method corresponds to the database table mood_info
     * @mbg.generated
     */
    int insertSelective(MoodInfo record);

    /**
     * This method corresponds to the database table mood_info
     * @mbg.generated
     */
    List<MoodInfo> selectByExample(MoodInfoQuery example);

    /**
     * This method corresponds to the database table mood_info
     * @mbg.generated
     */
    MoodInfo selectByPrimaryKey(Integer id);

    /**
     * This method corresponds to the database table mood_info
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") MoodInfo record, @Param("example") MoodInfoQuery example);

    /**
     * This method corresponds to the database table mood_info
     * @mbg.generated
     */
    int updateByExample(@Param("record") MoodInfo record, @Param("example") MoodInfoQuery example);

    /**
     * This method corresponds to the database table mood_info
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(MoodInfo record);

    /**
     * This method corresponds to the database table mood_info
     * @mbg.generated
     */
    int updateByPrimaryKey(MoodInfo record);
}
