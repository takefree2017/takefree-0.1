package com.takefree.dao.ext;

import com.takefree.dao.ShareCounterMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * MyBatis Ext Mapper for ShareCounter.
 */

@Mapper
@Repository

public interface ShareCounterExtMapper extends ShareCounterMapper {

}
