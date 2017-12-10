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

    ShareDTO updateByIdSelective(ShareDTO shareDTO);

    boolean deleteById(Long id);

    List<ShareDTO> getShareInfos(Integer page,Integer size,Long maxId,Long ownerId,Integer status);


    /**
     * 用户收货列表
     * @param page
     * @param size
     * @param reveiverId
     * @param ownerId
     * @return
     */
    List<ShareDTO> getReceivedShareInfos(Integer page,Integer size,Long reveiverId,Long ownerId);

    /**
     * 更新查看信息，非owner查看数加1，owner本人则更新查看申请和评论时间
     * @param shareDTO
     * @param userId
     * @return
     */
    boolean updateViewInfo(ShareDTO shareDTO,Long userId);

}
