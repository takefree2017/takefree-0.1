package com.takefree.mapper;

import com.takefree.model.UserLike;
import com.takefree.query.UserLikeQuery;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

;

@Mapper
@Repository
public interface UserLikeMapper {
    /**
     * This method corresponds to the database table user_like
     * @mbg.generated
     */
    long countByExample(UserLikeQuery example);

    /**
     * This method corresponds to the database table user_like
     * @mbg.generated
     */
    int deleteByExample(UserLikeQuery example);

    /**
     * This method corresponds to the database table user_like
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method corresponds to the database table user_like
     * @mbg.generated
     */
    int insert(UserLike record);

    /**
     * This method corresponds to the database table user_like
     * @mbg.generated
     */
    int insertSelective(UserLike record);

    /**
     * This method corresponds to the database table user_like
     * @mbg.generated
     */
    List<UserLike> selectByExample(UserLikeQuery example);

    /**
     * This method corresponds to the database table user_like
     * @mbg.generated
     */
    UserLike selectByPrimaryKey(Long id);

    /**
     * This method corresponds to the database table user_like
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") UserLike record, @Param("example") UserLikeQuery example);

    /**
     * This method corresponds to the database table user_like
     * @mbg.generated
     */
    int updateByExample(@Param("record") UserLike record, @Param("example") UserLikeQuery example);

    /**
     * This method corresponds to the database table user_like
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(UserLike record);

    /**
     * This method corresponds to the database table user_like
     * @mbg.generated
     */
    int updateByPrimaryKey(UserLike record);
}
