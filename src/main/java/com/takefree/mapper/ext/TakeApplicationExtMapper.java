package com.takefree.mapper.ext;

import com.takefree.mapper.TakeApplicationMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * MyBatis Ext Mapper for TakeApplication.
 */

@Mapper
@Repository

public interface TakeApplicationExtMapper extends TakeApplicationMapper {

}
