package com.takefree.pojo.mapper;

import com.takefree.pojo.model.UserInfo;
import com.takefree.pojo.query.UserInfoQuery;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

;

@Mapper
@Repository
public interface UserInfoMapper {
    /**
     * This method corresponds to the database table user_info
     * @mbg.generated
     */
    long countByExample(UserInfoQuery example);

    /**
     * This method corresponds to the database table user_info
     * @mbg.generated
     */
    int deleteByExample(UserInfoQuery example);

    /**
     * This method corresponds to the database table user_info
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method corresponds to the database table user_info
     * @mbg.generated
     */
    int insert(UserInfo record);

    /**
     * This method corresponds to the database table user_info
     * @mbg.generated
     */
    int insertSelective(UserInfo record);

    /**
     * This method corresponds to the database table user_info
     * @mbg.generated
     */
    List<UserInfo> selectByExample(UserInfoQuery example);

    /**
     * This method corresponds to the database table user_info
     * @mbg.generated
     */
    UserInfo selectByPrimaryKey(Long id);

    /**
     * This method corresponds to the database table user_info
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") UserInfo record, @Param("example") UserInfoQuery example);

    /**
     * This method corresponds to the database table user_info
     * @mbg.generated
     */
    int updateByExample(@Param("record") UserInfo record, @Param("example") UserInfoQuery example);

    /**
     * This method corresponds to the database table user_info
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(UserInfo record);

    /**
     * This method corresponds to the database table user_info
     * @mbg.generated
     */
    int updateByPrimaryKey(UserInfo record);
}
