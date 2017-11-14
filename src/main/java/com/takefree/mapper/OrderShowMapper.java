package com.takefree.mapper;

import com.takefree.model.OrderShowDO;
import com.takefree.query.OrderShowQuery;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
/**
 * MyBatis Mapper for OrderShow.
 */
 @Mapper
 @Repository

public interface OrderShowMapper {
    /**
     * query count by query condition.
     */
    int countByQuery(OrderShowQuery query);

    /**
     * delete by query condition.
     */
    int deleteByQuery(OrderShowQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(OrderShowDO record);

    /**
     * insert selective.
     */
    int insertSelective(OrderShowDO record);

    /**
     * select by query condition.
     */
    List<OrderShowDO> selectByQuery(OrderShowQuery query);

    /**
     * select by primary key.
     */
    OrderShowDO selectByPrimaryKey(Long id);

    /**
     * update by query condition selective.
     */
    int updateByQuerySelective(@Param("record") OrderShowDO record, @Param("query") OrderShowQuery query);

    /**
     * update by query condition.
     */
    int updateByQuery(@Param("record") OrderShowDO record, @Param("query") OrderShowQuery query);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(OrderShowDO record);
}
