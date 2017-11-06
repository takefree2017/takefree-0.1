package com.takefree.dao.ext;

import com.takefree.dao.OrderRateMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * MyBatis Ext Mapper for OrderRate.
 */

@Mapper
@Repository

public interface OrderRateExtMapper extends OrderRateMapper {

}
