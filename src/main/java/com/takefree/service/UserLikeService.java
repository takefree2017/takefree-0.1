package com.takefree.service;

import com.takefree.common.entry.Token;
import com.takefree.dto.model.UserDTO;
import com.takefree.pojo.model.UserInfo;
import com.takefree.pojo.model.UserLike;

import java.util.List;

/**
 * Created by gaoxiang on 2017/11/7.
 */
public interface UserLikeService {
    int create(UserLike userLike);

    int update(UserLike userLike);

    UserLike getById(Long id);

    UserLike getByFollowerAndFollowee(Long followerId,Long FolloweeId);

}
