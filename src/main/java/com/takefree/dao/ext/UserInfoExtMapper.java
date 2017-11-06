package com.takefree.dao.ext;

import com.takefree.dao.UserInfoMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * MyBatis Ext Mapper for UserInfo.
 */

@Mapper
@Repository

public interface UserInfoExtMapper extends UserInfoMapper {

}
