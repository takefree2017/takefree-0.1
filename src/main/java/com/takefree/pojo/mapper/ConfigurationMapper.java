package com.takefree.pojo.mapper;

import com.takefree.pojo.model.Configuration;
import com.takefree.pojo.query.ConfigurationQuery;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

;

@Mapper
@Repository
public interface ConfigurationMapper {
    /**
     * This method corresponds to the database table configuration
     * @mbg.generated
     */
    long countByExample(ConfigurationQuery example);

    /**
     * This method corresponds to the database table configuration
     * @mbg.generated
     */
    int deleteByExample(ConfigurationQuery example);

    /**
     * This method corresponds to the database table configuration
     * @mbg.generated
     */
    int deleteByPrimaryKey(String configItem);

    /**
     * This method corresponds to the database table configuration
     * @mbg.generated
     */
    int insert(Configuration record);

    /**
     * This method corresponds to the database table configuration
     * @mbg.generated
     */
    int insertSelective(Configuration record);

    /**
     * This method corresponds to the database table configuration
     * @mbg.generated
     */
    List<Configuration> selectByExample(ConfigurationQuery example);

    /**
     * This method corresponds to the database table configuration
     * @mbg.generated
     */
    Configuration selectByPrimaryKey(String configItem);

    /**
     * This method corresponds to the database table configuration
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Configuration record, @Param("example") ConfigurationQuery example);

    /**
     * This method corresponds to the database table configuration
     * @mbg.generated
     */
    int updateByExample(@Param("record") Configuration record, @Param("example") ConfigurationQuery example);

    /**
     * This method corresponds to the database table configuration
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Configuration record);

    /**
     * This method corresponds to the database table configuration
     * @mbg.generated
     */
    int updateByPrimaryKey(Configuration record);
}
