package com.takefree.mapper.ext;

import com.takefree.mapper.UserAddressMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * MyBatis Ext Mapper for UserAddress.
 */

@Mapper
@Repository

public interface UserAddressExtMapper extends UserAddressMapper {

}
