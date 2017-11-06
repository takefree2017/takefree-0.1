package com.takefree.dao.ext;

import com.takefree.dao.UserLikeMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * MyBatis Ext Mapper for UserLike.
 */

@Mapper
@Repository

public interface UserLikeExtMapper extends UserLikeMapper {

}
