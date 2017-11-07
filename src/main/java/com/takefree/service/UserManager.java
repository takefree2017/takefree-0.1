package com.takefree.service;

import com.takefree.common.PageResult;
import com.takefree.model.UserInfoDO;
import com.takefree.query.UserInfoQuery;

import java.util.List;


/**
 * Manager for UserInfo.
 */

public interface UserManager {
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
    long insertSelective(UserInfoDO record);

    /**
     * select by query condition.
     */
    List<UserInfoDO> selectByQuery(UserInfoQuery query);


    /**
     * select by query condition with page.
     */
    PageResult<UserInfoDO> selectByQueryWithPage(UserInfoQuery query);

    /**
     * select by primary key.
     */
    UserInfoDO selectByPrimaryKey(Long id);

    /**
     * update by query condition selective.
     */
    int updateByQuerySelective(UserInfoDO record, UserInfoQuery query);

    /**
     * update by query condition.
     */
    int updateByQuery(UserInfoDO record, UserInfoQuery query);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(UserInfoDO record);

    /**
     * select by mobile.
     */
    List<UserInfoDO> selectByMobile(String mobile);

}
