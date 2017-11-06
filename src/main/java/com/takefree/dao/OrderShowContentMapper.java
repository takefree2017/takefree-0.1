package com.takefree.dao;

import com.takefree.model.OrderShowContentDO;
import com.takefree.query.OrderShowContentQuery;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * MyBatis Mapper for OrderShowContent.
 */
@Mapper
@Repository

public interface OrderShowContentMapper {

    /**
     * query count by query condition.
     */
    int countByQuery(OrderShowContentQuery query);

    /**
     * delete by query condition.
     */
    int deleteByQuery(OrderShowContentQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(OrderShowContentDO record);

    /**
     * insert selective.
     */
    int insertSelective(OrderShowContentDO record);

    /**
     * select by query condition.
     */
    List<OrderShowContentDO> selectByQuery(OrderShowContentQuery query);

    /**
     * select by primary key.
     */
    OrderShowContentDO selectByPrimaryKey(Long id);

    /**
     * update by query condition selective.
     */
    int updateByQuerySelective(@Param("record") OrderShowContentDO record, @Param("query") OrderShowContentQuery query);

    /**
     * update by query condition.
     */
    int updateByQuery(@Param("record") OrderShowContentDO record, @Param("query") OrderShowContentQuery query);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(OrderShowContentDO record);
}
