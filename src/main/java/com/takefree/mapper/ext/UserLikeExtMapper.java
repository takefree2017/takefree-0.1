package com.takefree.mapper.ext;

import com.takefree.mapper.UserLikeMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * MyBatis Ext Mapper for UserLike.
 */

@Mapper
@Repository

public interface UserLikeExtMapper extends UserLikeMapper {

}
