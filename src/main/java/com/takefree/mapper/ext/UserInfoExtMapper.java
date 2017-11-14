package com.takefree.mapper.ext;

import com.takefree.mapper.UserInfoMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * MyBatis Ext Mapper for UserInfo.
 */

@Mapper
@Repository

public interface UserInfoExtMapper extends UserInfoMapper {

}
