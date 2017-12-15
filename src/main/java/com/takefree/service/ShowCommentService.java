package com.takefree.service;

import com.takefree.dto.model.ShowCommentDTO;
import com.takefree.pojo.model.ShowComment;

import java.util.List;

/**
 * Created by gaoxiang on 2017/11/7.
 */
public interface ShowCommentService {
    ShowComment create(ShowComment showComment);

    ShowCommentDTO get(Long id);

    int delete(Long id);

    List<ShowCommentDTO> getShowComments(Integer page, Integer size, Long showId, Long userId);

}
