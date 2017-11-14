package com.takefree.mapper;

import com.takefree.model.UserTimeDO;
import com.takefree.query.UserTimeQuery;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
/**
 * MyBatis Mapper for UserTime.
 */
 @Mapper
 @Repository

public interface UserTimeMapper {
    /**
     * query count by query condition.
     */
    int countByQuery(UserTimeQuery query);

    /**
     * delete by query condition.
     */
    int deleteByQuery(UserTimeQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(UserTimeDO record);

    /**
     * insert selective.
     */
    int insertSelective(UserTimeDO record);

    /**
     * select by query condition.
     */
    List<UserTimeDO> selectByQuery(UserTimeQuery query);

    /**
     * select by primary key.
     */
    UserTimeDO selectByPrimaryKey(Long userId);

    /**
     * update by query condition selective.
     */
    int updateByQuerySelective(@Param("record") UserTimeDO record, @Param("query") UserTimeQuery query);

    /**
     * update by query condition.
     */
    int updateByQuery(@Param("record") UserTimeDO record, @Param("query") UserTimeQuery query);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(UserTimeDO record);
}
