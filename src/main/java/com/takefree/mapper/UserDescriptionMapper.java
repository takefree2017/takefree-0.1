package com.takefree.mapper;

import com.takefree.model.UserDescription;
import com.takefree.query.UserDescriptionQuery;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

;

@Mapper
@Repository
public interface UserDescriptionMapper {
    /**
     * This method corresponds to the database table user_description
     * @mbg.generated
     */
    long countByExample(UserDescriptionQuery example);

    /**
     * This method corresponds to the database table user_description
     * @mbg.generated
     */
    int deleteByExample(UserDescriptionQuery example);

    /**
     * This method corresponds to the database table user_description
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long userId);

    /**
     * This method corresponds to the database table user_description
     * @mbg.generated
     */
    int insert(UserDescription record);

    /**
     * This method corresponds to the database table user_description
     * @mbg.generated
     */
    int insertSelective(UserDescription record);

    /**
     * This method corresponds to the database table user_description
     * @mbg.generated
     */
    List<UserDescription> selectByExample(UserDescriptionQuery example);

    /**
     * This method corresponds to the database table user_description
     * @mbg.generated
     */
    UserDescription selectByPrimaryKey(Long userId);

    /**
     * This method corresponds to the database table user_description
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") UserDescription record,
                                 @Param("example") UserDescriptionQuery example);

    /**
     * This method corresponds to the database table user_description
     * @mbg.generated
     */
    int updateByExample(@Param("record") UserDescription record, @Param("example") UserDescriptionQuery example);

    /**
     * This method corresponds to the database table user_description
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(UserDescription record);

    /**
     * This method corresponds to the database table user_description
     * @mbg.generated
     */
    int updateByPrimaryKey(UserDescription record);
}
