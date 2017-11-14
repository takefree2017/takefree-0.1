package com.takefree.mapper;

import com.takefree.model.TakeOrder;
import com.takefree.query.TakeOrderQuery;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

;

@Mapper
@Repository
public interface TakeOrderMapper {
    /**
     * This method corresponds to the database table take_order
     * @mbg.generated
     */
    long countByExample(TakeOrderQuery example);

    /**
     * This method corresponds to the database table take_order
     * @mbg.generated
     */
    int deleteByExample(TakeOrderQuery example);

    /**
     * This method corresponds to the database table take_order
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method corresponds to the database table take_order
     * @mbg.generated
     */
    int insert(TakeOrder record);

    /**
     * This method corresponds to the database table take_order
     * @mbg.generated
     */
    int insertSelective(TakeOrder record);

    /**
     * This method corresponds to the database table take_order
     * @mbg.generated
     */
    List<TakeOrder> selectByExample(TakeOrderQuery example);

    /**
     * This method corresponds to the database table take_order
     * @mbg.generated
     */
    TakeOrder selectByPrimaryKey(Long id);

    /**
     * This method corresponds to the database table take_order
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TakeOrder record, @Param("example") TakeOrderQuery example);

    /**
     * This method corresponds to the database table take_order
     * @mbg.generated
     */
    int updateByExample(@Param("record") TakeOrder record, @Param("example") TakeOrderQuery example);

    /**
     * This method corresponds to the database table take_order
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TakeOrder record);

    /**
     * This method corresponds to the database table take_order
     * @mbg.generated
     */
    int updateByPrimaryKey(TakeOrder record);
}
