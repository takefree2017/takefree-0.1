package com.takefree.dao;

import com.takefree.model.TakeOrderDO;
import com.takefree.query.TakeOrderQuery;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
/**
 * MyBatis Mapper for TakeOrder.
 */
 @Mapper
 @Repository

public interface TakeOrderMapper {
    /**
     * query count by query condition.
     */
    int countByQuery(TakeOrderQuery query);

    /**
     * delete by query condition.
     */
    int deleteByQuery(TakeOrderQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(TakeOrderDO record);

    /**
     * insert selective.
     */
    int insertSelective(TakeOrderDO record);

    /**
     * select by query condition.
     */
    List<TakeOrderDO> selectByQuery(TakeOrderQuery query);

    /**
     * select by primary key.
     */
    TakeOrderDO selectByPrimaryKey(Long id);

    /**
     * update by query condition selective.
     */
    int updateByQuerySelective(@Param("record") TakeOrderDO record, @Param("query") TakeOrderQuery query);

    /**
     * update by query condition.
     */
    int updateByQuery(@Param("record") TakeOrderDO record, @Param("query") TakeOrderQuery query);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(TakeOrderDO record);
}
