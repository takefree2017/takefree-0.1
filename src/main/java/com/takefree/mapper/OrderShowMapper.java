package com.takefree.mapper;

import com.takefree.model.OrderShow;
import com.takefree.query.OrderShowQuery;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

;

@Mapper
@Repository
public interface OrderShowMapper {
    /**
     * This method corresponds to the database table order_show
     * @mbg.generated
     */
    long countByExample(OrderShowQuery example);

    /**
     * This method corresponds to the database table order_show
     * @mbg.generated
     */
    int deleteByExample(OrderShowQuery example);

    /**
     * This method corresponds to the database table order_show
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method corresponds to the database table order_show
     * @mbg.generated
     */
    int insert(OrderShow record);

    /**
     * This method corresponds to the database table order_show
     * @mbg.generated
     */
    int insertSelective(OrderShow record);

    /**
     * This method corresponds to the database table order_show
     * @mbg.generated
     */
    List<OrderShow> selectByExample(OrderShowQuery example);

    /**
     * This method corresponds to the database table order_show
     * @mbg.generated
     */
    OrderShow selectByPrimaryKey(Long id);

    /**
     * This method corresponds to the database table order_show
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") OrderShow record, @Param("example") OrderShowQuery example);

    /**
     * This method corresponds to the database table order_show
     * @mbg.generated
     */
    int updateByExample(@Param("record") OrderShow record, @Param("example") OrderShowQuery example);

    /**
     * This method corresponds to the database table order_show
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(OrderShow record);

    /**
     * This method corresponds to the database table order_show
     * @mbg.generated
     */
    int updateByPrimaryKey(OrderShow record);
}
