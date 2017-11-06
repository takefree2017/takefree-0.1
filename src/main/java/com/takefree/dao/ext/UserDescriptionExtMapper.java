package com.takefree.dao.ext;

import com.takefree.dao.UserDescriptionMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * MyBatis Ext Mapper for UserDescription.
 */

@Mapper
@Repository

public interface UserDescriptionExtMapper extends UserDescriptionMapper {

}
