package com.takefree.mapper.ext;

import com.takefree.mapper.ComplaintMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * MyBatis Ext Mapper for Complaint.
 */

@Mapper
@Repository

public interface ComplaintExtMapper extends ComplaintMapper {

}
