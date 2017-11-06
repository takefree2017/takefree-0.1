package com.takefree.dao;

import com.takefree.model.UserAddressDO;
import com.takefree.query.UserAddressQuery;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * MyBatis Mapper for UserAddress.
 */
@Mapper
@Repository

public interface UserAddressMapper {

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
    int insertSelective(UserAddressDO record);

    /**
     * select by query condition.
     */
    List<UserAddressDO> selectByQuery(UserAddressQuery query);

    /**
     * select by primary key.
     */
    UserAddressDO selectByPrimaryKey(Long id);

    /**
     * update by query condition selective.
     */
    int updateByQuerySelective(@Param("record") UserAddressDO record, @Param("query") UserAddressQuery query);

    /**
     * update by query condition.
     */
    int updateByQuery(@Param("record") UserAddressDO record, @Param("query") UserAddressQuery query);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(UserAddressDO record);
}
