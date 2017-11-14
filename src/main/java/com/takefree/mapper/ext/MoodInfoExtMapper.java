package com.takefree.mapper.ext;

import com.takefree.mapper.MoodInfoMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * MyBatis Ext Mapper for MoodInfo.
 */

@Mapper
@Repository

public interface MoodInfoExtMapper extends MoodInfoMapper {

}
