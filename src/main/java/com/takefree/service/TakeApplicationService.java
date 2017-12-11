package com.takefree.service;


import com.takefree.dto.model.ShareDTO;
import com.takefree.dto.model.UserDTO;
import com.takefree.pojo.model.TakeApplication;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by gaoxiang on 2017/11/7.
 */
public interface TakeApplication {
    com.takefree.pojo.model.TakeApplication create(com.takefree.pojo.model.TakeApplication takeApplication);

    long deleteById(Long id);

    com.takefree.pojo.model.TakeApplication getById(Long id);

    long getCount(Long shareId, Long applyUserId);

    long updateAllReject(Long shareId);

    List<UserDTO> getShareApplyUsers(Integer page, Integer size, Long shareId, Integer applyStatus);
}
