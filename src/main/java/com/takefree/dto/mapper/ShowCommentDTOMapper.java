package com.takefree.dto.mapper;

import com.takefree.dto.model.ShowCommentDTO;
import com.takefree.pojo.query.ShowCommentQuery;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by gaoxiang on 2017/11/7.
 */
@Repository
@Mapper
public interface ShowCommentDTOMapper {
    List<ShowCommentDTO> selectByExample(ShowCommentQuery ShareCommentQuery);

    ShowCommentDTO selectByPrimaryKey(Long id);
}
