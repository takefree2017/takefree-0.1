package com.takefree.mapper.ext;

import com.takefree.mapper.LogisticsMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * MyBatis Ext Mapper for Logistics.
 */

@Mapper
@Repository

public interface LogisticsExtMapper extends LogisticsMapper {

}
