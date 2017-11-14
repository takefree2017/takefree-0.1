package com.takefree.mapper;

import com.takefree.model.OrderShowContent;
import com.takefree.query.OrderShowContentQuery;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

;

@Mapper
@Repository
public interface OrderShowContentMapper {
    /**
     * This method corresponds to the database table order_show_content
     * @mbg.generated
     */
    long countByExample(OrderShowContentQuery example);

    /**
     * This method corresponds to the database table order_show_content
     * @mbg.generated
     */
    int deleteByExample(OrderShowContentQuery example);

    /**
     * This method corresponds to the database table order_show_content
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long orderShowId);

    /**
     * This method corresponds to the database table order_show_content
     * @mbg.generated
     */
    int insert(OrderShowContent record);

    /**
     * This method corresponds to the database table order_show_content
     * @mbg.generated
     */
    int insertSelective(OrderShowContent record);

    /**
     * This method corresponds to the database table order_show_content
     * @mbg.generated
     */
    List<OrderShowContent> selectByExampleWithBLOBs(OrderShowContentQuery example);

    /**
     * This method corresponds to the database table order_show_content
     * @mbg.generated
     */
    List<OrderShowContent> selectByExample(OrderShowContentQuery example);

    /**
     * This method corresponds to the database table order_show_content
     * @mbg.generated
     */
    OrderShowContent selectByPrimaryKey(Long orderShowId);

    /**
     * This method corresponds to the database table order_show_content
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") OrderShowContent record,
                                 @Param("example") OrderShowContentQuery example);

    /**
     * This method corresponds to the database table order_show_content
     * @mbg.generated
     */
    int updateByExampleWithBLOBs(@Param("record") OrderShowContent record,
                                 @Param("example") OrderShowContentQuery example);

    /**
     * This method corresponds to the database table order_show_content
     * @mbg.generated
     */
    int updateByExample(@Param("record") OrderShowContent record, @Param("example") OrderShowContentQuery example);

    /**
     * This method corresponds to the database table order_show_content
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(OrderShowContent record);

    /**
     * This method corresponds to the database table order_show_content
     * @mbg.generated
     */
    int updateByPrimaryKeyWithBLOBs(OrderShowContent record);
}
