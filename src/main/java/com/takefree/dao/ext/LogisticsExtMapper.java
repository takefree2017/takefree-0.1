package com.takefree.dao.ext;

import com.takefree.dao.LogisticsMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * MyBatis Ext Mapper for Logistics.
 */

@Mapper
@Repository

public interface LogisticsExtMapper extends LogisticsMapper {

}
