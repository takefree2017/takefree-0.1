package com.takefree.pojo.mapper;

import com.takefree.pojo.model.OrderRate;
import com.takefree.pojo.query.OrderRateQuery;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface OrderRateMapper {
    /**
     * This method corresponds to the database table order_rate
     * @mbg.generated
     */
    long countByExample(OrderRateQuery example);

    /**
     * This method corresponds to the database table order_rate
     * @mbg.generated
     */
    int deleteByExample(OrderRateQuery example);

    /**
     * This method corresponds to the database table order_rate
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method corresponds to the database table order_rate
     * @mbg.generated
     */
    int insert(OrderRate record);

    /**
     * This method corresponds to the database table order_rate
     * @mbg.generated
     */
    int insertSelective(OrderRate record);

    /**
     * This method corresponds to the database table order_rate
     * @mbg.generated
     */
    List<OrderRate> selectByExample(OrderRateQuery example);

    /**
     * This method corresponds to the database table order_rate
     * @mbg.generated
     */
    OrderRate selectByPrimaryKey(Long id);

    /**
     * This method corresponds to the database table order_rate
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") OrderRate record, @Param("example") OrderRateQuery example);

    /**
     * This method corresponds to the database table order_rate
     * @mbg.generated
     */
    int updateByExample(@Param("record") OrderRate record, @Param("example") OrderRateQuery example);

    /**
     * This method corresponds to the database table order_rate
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(OrderRate record);

    /**
     * This method corresponds to the database table order_rate
     * @mbg.generated
     */
    int updateByPrimaryKey(OrderRate record);
}
