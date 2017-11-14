package com.takefree.mapper.ext;

import com.takefree.mapper.ShareCounterMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * MyBatis Ext Mapper for ShareCounter.
 */

@Mapper
@Repository

public interface ShareCounterExtMapper extends ShareCounterMapper {

}
