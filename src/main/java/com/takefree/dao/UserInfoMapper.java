package com.takefree.dao;

import com.takefree.model.UserInfoDO;
import com.takefree.query.UserInfoQuery;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * MyBatis Mapper for UserInfo.
 */
@Mapper
@Repository

public interface UserInfoMapper {

    /**
     * query count by query condition.
     */
    int countByQuery(UserInfoQuery query);

    /**
     * delete by query condition.
     */
    int deleteByQuery(UserInfoQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(UserInfoDO record);

    /**
     * insert selective.
     */
    int insertSelective(UserInfoDO record);

    /**
     * select by query condition.
     */
    List<UserInfoDO> selectByQuery(UserInfoQuery query);

    /**
     * select by primary key.
     */
    UserInfoDO selectByPrimaryKey(Long id);

    /**
     * update by query condition selective.
     */
    int updateByQuerySelective(@Param("record") UserInfoDO record, @Param("query") UserInfoQuery query);

    /**
     * update by query condition.
     */
    int updateByQuery(@Param("record") UserInfoDO record, @Param("query") UserInfoQuery query);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(UserInfoDO record);
}
