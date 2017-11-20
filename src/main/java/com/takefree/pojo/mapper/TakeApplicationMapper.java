package com.takefree.pojo.mapper;

import com.takefree.pojo.model.TakeApplication;
import com.takefree.pojo.query.TakeApplicationQuery;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TakeApplicationMapper {
    /**
     * This method corresponds to the database table take_application
     * @mbg.generated
     */
    long countByExample(TakeApplicationQuery example);

    /**
     * This method corresponds to the database table take_application
     * @mbg.generated
     */
    int deleteByExample(TakeApplicationQuery example);

    /**
     * This method corresponds to the database table take_application
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method corresponds to the database table take_application
     * @mbg.generated
     */
    int insert(TakeApplication record);

    /**
     * This method corresponds to the database table take_application
     * @mbg.generated
     */
    int insertSelective(TakeApplication record);

    /**
     * This method corresponds to the database table take_application
     * @mbg.generated
     */
    List<TakeApplication> selectByExample(TakeApplicationQuery example);

    /**
     * This method corresponds to the database table take_application
     * @mbg.generated
     */
    TakeApplication selectByPrimaryKey(Long id);

    /**
     * This method corresponds to the database table take_application
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TakeApplication record,
                                 @Param("example") TakeApplicationQuery example);

    /**
     * This method corresponds to the database table take_application
     * @mbg.generated
     */
    int updateByExample(@Param("record") TakeApplication record, @Param("example") TakeApplicationQuery example);

    /**
     * This method corresponds to the database table take_application
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TakeApplication record);

    /**
     * This method corresponds to the database table take_application
     * @mbg.generated
     */
    int updateByPrimaryKey(TakeApplication record);
}
