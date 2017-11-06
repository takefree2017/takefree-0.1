package com.takefree.dao.ext;

import com.takefree.dao.ShareCommentMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * MyBatis Ext Mapper for ShareComment.
 */

@Mapper
@Repository

public interface ShareCommentExtMapper extends ShareCommentMapper {

}
