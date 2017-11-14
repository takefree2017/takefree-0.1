package com.takefree.mapper;

import com.takefree.model.ShowCounter;
import com.takefree.query.ShowCounterQuery;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

;

@Mapper
@Repository
public interface ShowCounterMapper {
    /**
     * This method corresponds to the database table show_counter
     * @mbg.generated
     */
    long countByExample(ShowCounterQuery example);

    /**
     * This method corresponds to the database table show_counter
     * @mbg.generated
     */
    int deleteByExample(ShowCounterQuery example);

    /**
     * This method corresponds to the database table show_counter
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long showId);

    /**
     * This method corresponds to the database table show_counter
     * @mbg.generated
     */
    int insert(ShowCounter record);

    /**
     * This method corresponds to the database table show_counter
     * @mbg.generated
     */
    int insertSelective(ShowCounter record);

    /**
     * This method corresponds to the database table show_counter
     * @mbg.generated
     */
    List<ShowCounter> selectByExample(ShowCounterQuery example);

    /**
     * This method corresponds to the database table show_counter
     * @mbg.generated
     */
    ShowCounter selectByPrimaryKey(Long showId);

    /**
     * This method corresponds to the database table show_counter
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") ShowCounter record, @Param("example") ShowCounterQuery example);

    /**
     * This method corresponds to the database table show_counter
     * @mbg.generated
     */
    int updateByExample(@Param("record") ShowCounter record, @Param("example") ShowCounterQuery example);

    /**
     * This method corresponds to the database table show_counter
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(ShowCounter record);

    /**
     * This method corresponds to the database table show_counter
     * @mbg.generated
     */
    int updateByPrimaryKey(ShowCounter record);
}
