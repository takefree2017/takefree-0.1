package com.takefree.service.impl;

import com.takefree.pojo.mapper.UserLikeMapper;
import com.takefree.pojo.model.UserLike;
import com.takefree.pojo.query.UserLikeQuery;
import com.takefree.service.UserLikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by gaoxiang on 2017/11/23.
 */
@Service
public class UserLikeServiceImpl implements UserLikeService {
    @Autowired
    private UserLikeMapper userLikeMapper;

    @Override
    public int create(UserLike userLike) {
        return userLikeMapper.insertSelective(userLike);
    }

    @Override
    public int update(UserLike userLike) {
        userLike.setGmtCreate(null);
        userLike.setGmtModified(new Date());
        return userLikeMapper.updateByPrimaryKeySelective(userLike);
    }

    @Override
    public UserLike getById(Long id) {
        return userLikeMapper.selectByPrimaryKey(id);
    }

    @Override
    public UserLike getByFollowerAndFollowee(Long followerId, Long followeeId) {
        UserLikeQuery userLikeQuery=new UserLikeQuery();
        UserLikeQuery.Criteria criteria=userLikeQuery.createCriteria();
        criteria.andUserFollowerIdEqualTo(followerId);
        criteria.andUserFolloweeIdEqualTo(followeeId);
        List<UserLike> userLikes=userLikeMapper.selectByExample(userLikeQuery);
        if(userLikes.size()==0){
            return null;
        }else{
            return userLikes.get(0);
        }
    }
}
