package com.takefree.service;

import com.takefree.dto.model.ShareDTO;

import java.util.List;

/**
 * Created by gaoxiang on 2017/11/7.
 */
public interface ShareService {
    ShareDTO create(ShareDTO shareDTO);

    ShareDTO getShareInfoById(Long id);

    ShareDTO getShareDetailById(Long id);

    ShareDTO updateById(ShareDTO shareDTO);

    boolean deleteById(Long id);

    List<ShareDTO> getShareInfoList(Integer page,Integer size,Long maxId,Long ownerId,Integer status);

    /**
     * 用户喜欢列表
     * @param page
     * @param size
     * @param userId
     * @param ownerId
     * @param status
     * @return
     */
    List<ShareDTO> getLikeShareInfoList(Integer page,Integer size,Long userId,Long ownerId,Integer status);

    /**
     * 用户申请列表
     * @param page
     * @param size
     * @param userId
     * @param ownerId
     * @param status
     * @return
     */
    List<ShareDTO> getApplyShareInfoList(Integer page,Integer size,Long userId,Long ownerId,Integer status);

    /**
     * 用户收货列表
     * @param page
     * @param size
     * @param userId
     * @param ownerId
     * @return
     */
    List<ShareDTO> getReceivedShareInfoList(Integer page,Integer size,Long userId,Long ownerId);

    /**
     * 更新查看信息，非owner查看数加1，owner本人则更新查看申请和评论时间
     * @param shareDTO
     * @param userId
     * @return
     */
    boolean updateViewInfo(ShareDTO shareDTO,Long userId);

}
