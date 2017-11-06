package com.takefree.dao.ext;

import com.takefree.dao.ShowCounterMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * MyBatis Ext Mapper for ShowCounter.
 */

@Mapper
@Repository

public interface ShowCounterExtMapper extends ShowCounterMapper {

}
