package com.takefree.service;

import com.takefree.dto.model.TakeApplicationDTO;
import com.takefree.dto.model.UserDTO;
import com.takefree.pojo.model.TakeApplication;

import java.util.List;

/**
 * Created by gaoxiang on 2017/11/7.
 */
public interface TakeApplicationService {
    TakeApplication create(TakeApplication takeApplication);

    int deleteById(Long id);

    int updateById(TakeApplication takeApplication);

    TakeApplicationDTO getById(Long id);

    long getCount(Long shareId, Long applyUserId);

    int updateAllReject(Long shareId);

    List<TakeApplicationDTO> getApplys(Integer page, Integer size, Long shareId, Long ownerId, Long applicantId, Integer orderStatus) throws Exception;

    List<UserDTO> getShareApplyUsers(Integer page, Integer size, Long shareId, Integer applyStatus);
}
