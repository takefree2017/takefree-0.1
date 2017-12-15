package com.takefree.dto.mapper;

import com.takefree.dto.model.ShareCommentDTO;
import com.takefree.pojo.query.ShareCommentQuery;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by gaoxiang on 2017/11/7.
 */
@Repository
@Mapper
public interface ShareCommentDTOMapper {
    List<ShareCommentDTO> selectByExample(ShareCommentQuery ShareCommentQuery);

    //ShareLikeDTO selectByPrimaryKey(Long id);
}
