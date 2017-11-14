package com.takefree.mapper.ext;

import com.takefree.mapper.TakeOrderMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * MyBatis Ext Mapper for TakeOrder.
 */

@Mapper
@Repository

public interface TakeOrderExtMapper extends TakeOrderMapper {

}
