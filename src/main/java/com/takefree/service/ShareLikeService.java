package com.takefree.service;


import com.takefree.dto.model.ShareDTO;
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
    List<ShareLike> getShareLikes(Integer page,Integer size,Long maxId,Long shareId,Long userId);

    /**
     *
     * @param shareId 可为NULL
     * @param userId 可为NULL
     * @return
     */
    long getCount(Long shareId,Long userId);

    /**
     * 用户喜欢列表
     * @param page 可为NULL
     * @param size 可为NULL
     * @param userId
     * @param ownerId 可为NULL
     * @param shareStatus 可为NULL
     * @return
     */
    List<ShareDTO> getUserLikeShareInfos(Integer page, Integer size, Long userId, Long ownerId, Integer shareStatus);


}
