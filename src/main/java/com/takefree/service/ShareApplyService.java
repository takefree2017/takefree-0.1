package com.takefree.service;


import com.takefree.dto.model.ShareDTO;
import com.takefree.dto.model.UserDTO;
import com.takefree.pojo.model.TakeApplication;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by gaoxiang on 2017/11/7.
 */
public interface ShareApplyService {
    TakeApplication create(TakeApplication takeApplication);

    long deleteById(Long id);

    long getCount(Long shareId, Long applyUserId);

    long updateAllReject(Long shareId);

    List<ShareDTO> getApplyShareInfos(Integer page, Integer size, Long applierId, Long ownerId, Integer applyStatus);

    List<UserDTO> getShareApplyUsers(Integer page, Integer size, Long shareId, Integer applyStatus);
}
