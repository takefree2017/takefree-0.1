package com.takefree.service.impl;

import com.takefree.dto.mapper.ShareDTOMapper;
import com.takefree.dto.mapper.ShareLikeDTOMapper;
import com.takefree.dto.model.ShareLikeDTO;
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
    private ShareLikeMapper shareLikeMapper;

    @Autowired
    private ShareLikeDTOMapper shareLikeDTOMapper;

    @Autowired
    private ShareCounterMapper shareCounterMapper;

    @Override
    @Transactional
    public ShareLike create(ShareLike shareLike) {
        int i=shareLikeMapper.insertSelective(shareLike);
        shareCounterMapper.changeLikeCount(shareLike.getShareId(),i);
        return shareLike;
    }

    @Override
    public int delete(Long shareId, Long userId) {
        ShareLikeQuery shareLikeQuery=new ShareLikeQuery();
        shareLikeQuery.createCriteria().andShareIdEqualTo(shareId).andUserIdEqualTo(userId);
        int row=shareLikeMapper.deleteByExample(shareLikeQuery);
        //TODO 修改恢复数量有bug，无论是否新申请都将新申请数量减1
        shareCounterMapper.changeLikeCount(shareId,-row);
        return row;
    }

    @Override
    public List<ShareLikeDTO> getShareLikes(Integer page, Integer size, Long maxId, Long shareId, Long userId) {
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
        shareLikeQuery.setOrderByClause("share_like.id desc");

        return shareLikeDTOMapper.selectByExample(shareLikeQuery);
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
