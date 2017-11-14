package com.takefree.mapper.ext;

import com.takefree.mapper.ShowCounterMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * MyBatis Ext Mapper for ShowCounter.
 */

@Mapper
@Repository

public interface ShowCounterExtMapper extends ShowCounterMapper {

}
