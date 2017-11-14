package com.takefree.mapper.ext;

import com.takefree.mapper.RegionInfoMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * MyBatis Ext Mapper for RegionInfo.
 */

@Mapper
@Repository

public interface RegionInfoExtMapper extends RegionInfoMapper {

}
