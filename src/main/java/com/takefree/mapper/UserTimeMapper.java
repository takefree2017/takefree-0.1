package com.takefree.mapper;

import com.takefree.model.UserTime;
import com.takefree.query.UserTimeQuery;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

;

@Mapper
@Repository
public interface UserTimeMapper {
    /**
     * This method corresponds to the database table user_time
     * @mbg.generated
     */
    long countByExample(UserTimeQuery example);

    /**
     * This method corresponds to the database table user_time
     * @mbg.generated
     */
    int deleteByExample(UserTimeQuery example);

    /**
     * This method corresponds to the database table user_time
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long userId);

    /**
     * This method corresponds to the database table user_time
     * @mbg.generated
     */
    int insert(UserTime record);

    /**
     * This method corresponds to the database table user_time
     * @mbg.generated
     */
    int insertSelective(UserTime record);

    /**
     * This method corresponds to the database table user_time
     * @mbg.generated
     */
    List<UserTime> selectByExample(UserTimeQuery example);

    /**
     * This method corresponds to the database table user_time
     * @mbg.generated
     */
    UserTime selectByPrimaryKey(Long userId);

    /**
     * This method corresponds to the database table user_time
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") UserTime record, @Param("example") UserTimeQuery example);

    /**
     * This method corresponds to the database table user_time
     * @mbg.generated
     */
    int updateByExample(@Param("record") UserTime record, @Param("example") UserTimeQuery example);

    /**
     * This method corresponds to the database table user_time
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(UserTime record);

    /**
     * This method corresponds to the database table user_time
     * @mbg.generated
     */
    int updateByPrimaryKey(UserTime record);
}
