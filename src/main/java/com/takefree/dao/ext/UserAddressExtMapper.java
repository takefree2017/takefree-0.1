package com.takefree.dao.ext;

import com.takefree.dao.UserAddressMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * MyBatis Ext Mapper for UserAddress.
 */

@Mapper
@Repository

public interface UserAddressExtMapper extends UserAddressMapper {

}
