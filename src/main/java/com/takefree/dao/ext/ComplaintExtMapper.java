package com.takefree.dao.ext;

import com.takefree.dao.ComplaintMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * MyBatis Ext Mapper for Complaint.
 */

@Mapper
@Repository

public interface ComplaintExtMapper extends ComplaintMapper {

}
