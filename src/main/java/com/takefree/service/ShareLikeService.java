package com.takefree.service;

import com.takefree.dto.model.ShareLikeDTO;
import com.takefree.pojo.model.ShareLike;

import java.util.List;

/**
 * Created by gaoxiang on 2017/11/7.
 */
public interface ShareLikeService {
    ShareLike create(ShareLike shareLike);

    boolean delete(Long shareId,Long userId);

    /**
     *
     * @param page 可选
     * @param size 可为NULL
     * @param maxId 可为NULL
     * @param shareId 可为NULL
     * @param userId 可为NULL
     * @return
     */
    List<ShareLikeDTO> getShareLikes(Integer page, Integer size, Long maxId, Long shareId, Long userId);

    /**
     *
     * @param shareId 可为NULL
     * @param userId 可为NULL
     * @return
     */
    long getCount(Long shareId,Long userId);




}
