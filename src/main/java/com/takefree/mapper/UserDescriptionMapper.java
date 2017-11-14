package com.takefree.mapper;

import com.takefree.model.UserDescriptionDO;
import com.takefree.query.UserDescriptionQuery;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
/**
 * MyBatis Mapper for UserDescription.
 */
 @Mapper
 @Repository

public interface UserDescriptionMapper {
    /**
     * query count by query condition.
     */
    int countByQuery(UserDescriptionQuery query);

    /**
     * delete by query condition.
     */
    int deleteByQuery(UserDescriptionQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(UserDescriptionDO record);

    /**
     * insert selective.
     */
    int insertSelective(UserDescriptionDO record);

    /**
     * select by query condition.
     */
    List<UserDescriptionDO> selectByQuery(UserDescriptionQuery query);

    /**
     * select by primary key.
     */
    UserDescriptionDO selectByPrimaryKey(Long userId);

    /**
     * update by query condition selective.
     */
    int updateByQuerySelective(@Param("record") UserDescriptionDO record, @Param("query") UserDescriptionQuery query);

    /**
     * update by query condition.
     */
    int updateByQuery(@Param("record") UserDescriptionDO record, @Param("query") UserDescriptionQuery query);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(UserDescriptionDO record);
}
