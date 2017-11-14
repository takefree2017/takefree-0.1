package com.takefree.mapper;

import com.takefree.model.UserLikeDO;
import com.takefree.query.UserLikeQuery;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
/**
 * MyBatis Mapper for UserLike.
 */
 @Mapper
 @Repository

public interface UserLikeMapper {
    /**
     * query count by query condition.
     */
    int countByQuery(UserLikeQuery query);

    /**
     * delete by query condition.
     */
    int deleteByQuery(UserLikeQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(UserLikeDO record);

    /**
     * insert selective.
     */
    int insertSelective(UserLikeDO record);

    /**
     * select by query condition.
     */
    List<UserLikeDO> selectByQuery(UserLikeQuery query);

    /**
     * select by primary key.
     */
    UserLikeDO selectByPrimaryKey(Long id);

    /**
     * update by query condition selective.
     */
    int updateByQuerySelective(@Param("record") UserLikeDO record, @Param("query") UserLikeQuery query);

    /**
     * update by query condition.
     */
    int updateByQuery(@Param("record") UserLikeDO record, @Param("query") UserLikeQuery query);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(UserLikeDO record);
}
