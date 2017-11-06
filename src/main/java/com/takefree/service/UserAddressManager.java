package com.takefree.service;

import com.takefree.common.PageResult;
import com.takefree.model.UserAddressDO;
import com.takefree.query.UserAddressQuery;

import java.util.List;


/**
 * Manager for UserAddress.
 */

public interface UserAddressManager {
    /**
     * query count by query condition.
     */
    int countByQuery(UserAddressQuery query);

    /**
     * delete by query condition.
     */
    int deleteByQuery(UserAddressQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(UserAddressDO record);

    /**
     * insert selective.
     */
    long insertSelective(UserAddressDO record);

    /**
     * select by query condition.
     */
    List<UserAddressDO> selectByQuery(UserAddressQuery query);


    /**
     * select by query condition with page.
     */
    PageResult<UserAddressDO> selectByQueryWithPage(UserAddressQuery query);

    /**
     * select by primary key.
     */
    UserAddressDO selectByPrimaryKey(Long id);

    /**
     * update by query condition selective.
     */
    int updateByQuerySelective(UserAddressDO record, UserAddressQuery query);

    /**
     * update by query condition.
     */
    int updateByQuery(UserAddressDO record, UserAddressQuery query);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(UserAddressDO record);
}
