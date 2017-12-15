package com.takefree.service.impl;

import com.takefree.dto.mapper.ShareCommentDTOMapper;
import com.takefree.dto.model.ShareCommentDTO;
import com.takefree.pojo.mapper.ShareCommentMapper;
import com.takefree.pojo.model.ShareComment;
import com.takefree.pojo.query.ShareCommentQuery;
import com.takefree.service.ShareCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by gaoxiang on 2017/12/13.
 */
@Service
public class ShareCommentServiceImpl implements ShareCommentService {
    @Autowired
    private ShareCommentMapper shareCommentMapper;

    @Autowired
    private ShareCommentDTOMapper shareCommentDTOMapper;

    @Override
    public ShareComment create(ShareComment shareComment) {
        shareCommentMapper.insertSelective(shareComment);
        return shareComment;
    }

    @Override
    public int delete(Long id) {
        int row=shareCommentMapper.deleteByPrimaryKey(id);
        return row;
    }

    @Override
    public ShareCommentDTO get(Long id){
        return shareCommentDTOMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<ShareCommentDTO> getShareComments(Integer page, Integer size, Long shareId, Long userId) {
        ShareCommentQuery shareCommentQuery=new ShareCommentQuery();
        if (page != null && size != null) {
            shareCommentQuery.page(page, size);
        }
        if (page == null && size != null) {
            shareCommentQuery.limit(size);
        }
        ShareCommentQuery.Criteria criteria= shareCommentQuery.createCriteria();
        if(shareId!=null){
            criteria.andShareIdEqualTo(shareId);
        }

        if(userId!=null){
            criteria.andUserIdEqualTo(userId);
        }
        shareCommentQuery.setOrderByClause("share_comment.id desc");
        return shareCommentDTOMapper.selectByExample(shareCommentQuery);
    }
}
