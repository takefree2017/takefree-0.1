package com.takefree.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.takefree.dataobject.RegionInfoObject;
import com.takefree.dataobject.TestObject;

public interface RegionInfoMapper {

	//取全国layer(含)级以上所有地区编码,10省 20市地 30区县
    @Select("select id,layer, region_name as regionName from region_info where layer <= #{layer}")
    public List<RegionInfoObject> getAll(@Param("layer")int layer);
    
}
