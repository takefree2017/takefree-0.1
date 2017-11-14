package com.takefree.mapper.ext;

import com.takefree.mapper.UserTimeMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * MyBatis Ext Mapper for UserTime.
 */

@Mapper
@Repository

public interface UserTimeExtMapper extends UserTimeMapper {

}
