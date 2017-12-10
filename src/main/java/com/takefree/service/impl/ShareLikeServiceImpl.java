package com.takefree.service.impl;

import com.takefree.dto.mapper.ShareDTOMapper;
import com.takefree.dto.model.ShareDTO;
import com.takefree.dto.query.ShareDTOQuery;
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
    private ShareCounterMapper shareCounterMapper;

    @Autowired
    private ShareDTOMapper shareDTOMapper;

    @Override
    @Transactional
    public ShareLike create(ShareLike shareLike) {
        int i=shareLikeMapper.insertSelective(shareLike);
        shareCounterMapper.changeLikeCount(shareLike.getShareId(),i);
        return shareLike;
    }

    @Override
    public boolean delete(Long shareId, Long userId) {
        ShareLikeQuery shareLikeQuery=new ShareLikeQuery();
        shareLikeQuery.createCriteria().andShareIdEqualTo(shareId).andUserIdEqualTo(userId);
        int i=shareLikeMapper.deleteByExample(shareLikeQuery);
        //TODO 修改恢复数量有bug，无论是否新申请都将新申请数量减1
        shareCounterMapper.changeLikeCount(shareId,-i);
        return true;
    }

    @Override
    public List<ShareLike> getShareLikes(Integer page, Integer size, Long maxId, Long shareId, Long userId) {
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


    @Override
    public List<ShareDTO> getUserLikeShareInfos(Integer page, Integer size, Long userId, Long ownerId, Integer shareStatus){
        ShareDTOQuery shareDTOQuery = new ShareDTOQuery();
        if (page != null && size != null) {
            shareDTOQuery.page(page, size);
        }
        if (page == null && size != null) {
            shareDTOQuery.limit(size);
        }


        ShareDTOQuery.Criteria criteria = shareDTOQuery.createCriteria();
        criteria.andLikeUserEqualTo(userId);
        if (shareStatus != null) {
            criteria.andStatusEqualTo(shareStatus);
        }
        if (ownerId != null) {
            criteria.andOwnerIdEqualTo(ownerId);
        }

        shareDTOQuery.setOrderByClause("share_like.id desc");

        return shareDTOMapper.selectLikeShareInfoListByExample(shareDTOQuery);
    }
}
