package com.takefree.service;

import com.takefree.dto.model.ShowLikeDTO;
import com.takefree.pojo.model.ShowLike;

import java.util.List;

/**
 * Created by gaoxiang on 2017/11/7.
 */
public interface ShowLikeService {
    ShowLike create(ShowLike showLike);

    int delete(Long showId, Long userId);

    /**
     *
     * @param page 可选
     * @param size 可为NULL
     * @param maxId 可为NULL
     * @param showId 可为NULL
     * @param userId 可为NULL
     * @return
     */
    List<ShowLikeDTO> getShowLikeDTOs(Integer page, Integer size, Long maxId, Long showId, Long userId);

    /**
     *
     * @param showId 可为NULL
     * @param userId 可为NULL
     * @return
     */
    long getCount(Long showId, Long userId);
}
