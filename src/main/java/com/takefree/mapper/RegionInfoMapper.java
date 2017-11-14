package com.takefree.mapper;

import com.takefree.model.RegionInfo;
import com.takefree.query.RegionInfoQuery;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

;

@Mapper
@Repository
public interface RegionInfoMapper {
    /**
     * This method corresponds to the database table region_info
     * @mbg.generated
     */
    long countByExample(RegionInfoQuery example);

    /**
     * This method corresponds to the database table region_info
     * @mbg.generated
     */
    int deleteByExample(RegionInfoQuery example);

    /**
     * This method corresponds to the database table region_info
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method corresponds to the database table region_info
     * @mbg.generated
     */
    int insert(RegionInfo record);

    /**
     * This method corresponds to the database table region_info
     * @mbg.generated
     */
    int insertSelective(RegionInfo record);

    /**
     * This method corresponds to the database table region_info
     * @mbg.generated
     */
    List<RegionInfo> selectByExample(RegionInfoQuery example);

    /**
     * This method corresponds to the database table region_info
     * @mbg.generated
     */
    RegionInfo selectByPrimaryKey(Long id);

    /**
     * This method corresponds to the database table region_info
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") RegionInfo record, @Param("example") RegionInfoQuery example);

    /**
     * This method corresponds to the database table region_info
     * @mbg.generated
     */
    int updateByExample(@Param("record") RegionInfo record, @Param("example") RegionInfoQuery example);

    /**
     * This method corresponds to the database table region_info
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(RegionInfo record);

    /**
     * This method corresponds to the database table region_info
     * @mbg.generated
     */
    int updateByPrimaryKey(RegionInfo record);
}
