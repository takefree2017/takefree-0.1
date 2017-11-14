package com.takefree.mapper.ext;

import com.takefree.mapper.ShareMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * MyBatis Ext Mapper for ShareDTO.
 */

@Mapper
@Repository

public interface ShareExtMapper extends ShareMapper {

}
