package com.takefree.service.impl;

import com.takefree.pojo.mapper.ShareCounterMapper;
import com.takefree.pojo.mapper.ShareLikeMapper;
import com.takefree.pojo.model.ShareLike;
import com.takefree.pojo.query.ShareLikeQuery;
import com.takefree.service.ShareLikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by gaoxiang on 2017/11/15.
 */
@Service
public class ShareLikeServiceImpl implements ShareLikeService {
    @Autowired
    ShareLikeMapper shareLikeMapper;

    @Autowired
    ShareCounterMapper shareCounterMapper;

    @Override
    @Transactional
    public ShareLike create(ShareLike shareLike) {
        int i=shareLikeMapper.insertSelective(shareLike);
        shareCounterMapper.addLikeCount(shareLike.getShareId(),i);
        return shareLike;
    }

    @Override
    public boolean delete(Long shareId, Long userId) {
        ShareLikeQuery shareLikeQuery=new ShareLikeQuery();
        shareLikeQuery.createCriteria().andShareIdEqualTo(shareId).andUserIdEqualTo(userId);
        int i=shareLikeMapper.deleteByExample(shareLikeQuery);
        shareCounterMapper.addLikeCount(shareId,-i);
        return true;
    }

    @Override
    public List<ShareLike> getList(Integer page, Integer size, Long maxId, Long shareId, Long userId) {
        ShareLikeQuery shareLikeQuery=new ShareLikeQuery();
        if (page != null && size != null) {
            shareLikeQuery.page(page, size);
        }
        if (page == null && size != null) {
            shareLikeQuery.limit(size);
        }
        ShareLikeQuery.Criteria criteria= shareLikeQuery.createCriteria();
        if(shareId!=null){
            criteria.andShareIdEqualTo(shareId);
        }

        if(userId!=null){
            criteria.andUserIdEqualTo(userId);
        }
        shareLikeQuery.setOrderByClause("id desc");

        return null;
    }

    @Override
    public long getCount(Long shareId, Long userId) {
        ShareLikeQuery shareLikeQuery=new ShareLikeQuery();
        ShareLikeQuery.Criteria criteria= shareLikeQuery.createCriteria();
        if(shareId!=null){
            criteria.andShareIdEqualTo(shareId);
        }
        if(userId!=null){
            criteria.andUserIdEqualTo(userId);
        }
        return shareLikeMapper.countByExample(shareLikeQuery);
    }
}
