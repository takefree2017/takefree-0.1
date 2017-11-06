package com.takefree.dao.ext;

import com.takefree.dao.TakeApplicationMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * MyBatis Ext Mapper for TakeApplication.
 */

@Mapper
@Repository

public interface TakeApplicationExtMapper extends TakeApplicationMapper {

}
