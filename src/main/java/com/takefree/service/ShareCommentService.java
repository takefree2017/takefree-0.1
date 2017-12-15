package com.takefree.service;

import com.takefree.dto.model.ShareCommentDTO;
import com.takefree.pojo.model.ShareComment;

import java.util.List;

/**
 * Created by gaoxiang on 2017/11/7.
 */
public interface ShareCommentService {
    ShareComment create(ShareComment shareComment);

    ShareCommentDTO get(Long id);

    int delete(Long id);

    List<ShareCommentDTO> getShareComments(Integer page, Integer size, Long shareId, Long userId);

}
