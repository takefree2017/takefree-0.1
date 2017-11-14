package com.takefree.mapper;

import com.takefree.model.Logistics;
import com.takefree.query.LogisticsQuery;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

;

@Mapper
@Repository
public interface LogisticsMapper {
    /**
     * This method corresponds to the database table logistics
     * @mbg.generated
     */
    long countByExample(LogisticsQuery example);

    /**
     * This method corresponds to the database table logistics
     * @mbg.generated
     */
    int deleteByExample(LogisticsQuery example);

    /**
     * This method corresponds to the database table logistics
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method corresponds to the database table logistics
     * @mbg.generated
     */
    int insert(Logistics record);

    /**
     * This method corresponds to the database table logistics
     * @mbg.generated
     */
    int insertSelective(Logistics record);

    /**
     * This method corresponds to the database table logistics
     * @mbg.generated
     */
    List<Logistics> selectByExample(LogisticsQuery example);

    /**
     * This method corresponds to the database table logistics
     * @mbg.generated
     */
    Logistics selectByPrimaryKey(Long id);

    /**
     * This method corresponds to the database table logistics
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Logistics record, @Param("example") LogisticsQuery example);

    /**
     * This method corresponds to the database table logistics
     * @mbg.generated
     */
    int updateByExample(@Param("record") Logistics record, @Param("example") LogisticsQuery example);

    /**
     * This method corresponds to the database table logistics
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Logistics record);

    /**
     * This method corresponds to the database table logistics
     * @mbg.generated
     */
    int updateByPrimaryKey(Logistics record);
}
