package com.takefree.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.takefree.dataobject.CategoryInfoObject;
import com.takefree.dataobject.RegionInfoObject;

public interface CategoryInfoMapper {

	//取layer(含)级以上所有物品分类,10一级分类 20一二级分类 30一二三级分类
    @Select("select id,layer, category_name as categoryName from category_info where layer <= #{layer}")
    public List<CategoryInfoObject> getAll(@Param("layer")int layer);
}
