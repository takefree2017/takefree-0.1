package com.takefree.dao.ext;

import com.takefree.dao.TakeOrderMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * MyBatis Ext Mapper for TakeOrder.
 */

@Mapper
@Repository

public interface TakeOrderExtMapper extends TakeOrderMapper {

}
