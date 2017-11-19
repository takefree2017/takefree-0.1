package com.takefree.service;


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
     * @param size 可选
     * @param maxId 可选
     * @param shareId 可为NULL
     * @param userId 可为NULL
     * @return
     */
    List<ShareLike> getList(Integer page,Integer size,Long maxId,Long shareId,Long userId);

    /**
     *
     * @param shareId 可为NULL
     * @param userId 可为NULL
     * @return
     */
    long getCount(Long shareId,Long userId);

}
