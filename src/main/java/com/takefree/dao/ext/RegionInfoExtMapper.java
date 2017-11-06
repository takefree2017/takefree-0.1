package com.takefree.dao.ext;

import com.takefree.dao.RegionInfoMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * MyBatis Ext Mapper for RegionInfo.
 */

@Mapper
@Repository

public interface RegionInfoExtMapper extends RegionInfoMapper {

}
