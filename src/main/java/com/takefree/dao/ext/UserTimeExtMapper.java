package com.takefree.dao.ext;

import com.takefree.dao.UserTimeMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * MyBatis Ext Mapper for UserTime.
 */

@Mapper
@Repository

public interface UserTimeExtMapper extends UserTimeMapper {

}
