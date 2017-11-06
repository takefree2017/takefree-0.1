package com.takefree.dao.ext;

import com.takefree.dao.MoodInfoMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * MyBatis Ext Mapper for MoodInfo.
 */

@Mapper
@Repository

public interface MoodInfoExtMapper extends MoodInfoMapper {

}
