package com.takefree.dao;

import com.takefree.model.OrderRateDO;
import com.takefree.query.OrderRateQuery;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
/**
 * MyBatis Mapper for OrderRate.
 */
 @Mapper
 @Repository

public interface OrderRateMapper {
    /**
     * query count by query condition.
     */
    int countByQuery(OrderRateQuery query);

    /**
     * delete by query condition.
     */
    int deleteByQuery(OrderRateQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(OrderRateDO record);

    /**
     * insert selective.
     */
    int insertSelective(OrderRateDO record);

    /**
     * select by query condition.
     */
    List<OrderRateDO> selectByQuery(OrderRateQuery query);

    /**
     * select by primary key.
     */
    OrderRateDO selectByPrimaryKey(Long id);

    /**
     * update by query condition selective.
     */
    int updateByQuerySelective(@Param("record") OrderRateDO record, @Param("query") OrderRateQuery query);

    /**
     * update by query condition.
     */
    int updateByQuery(@Param("record") OrderRateDO record, @Param("query") OrderRateQuery query);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(OrderRateDO record);
}
