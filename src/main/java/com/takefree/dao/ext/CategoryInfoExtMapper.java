package com.takefree.dao.ext;

import com.takefree.dao.CategoryInfoMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * MyBatis Ext Mapper for CategoryInfo.
 */

@Mapper
@Repository

public interface CategoryInfoExtMapper extends CategoryInfoMapper {

}
