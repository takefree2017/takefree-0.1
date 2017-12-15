package com.takefree.service.impl;

import com.takefree.dto.mapper.ShowCommentDTOMapper;
import com.takefree.dto.model.ShowCommentDTO;
import com.takefree.pojo.mapper.ShowCommentMapper;
import com.takefree.pojo.model.ShowComment;
import com.takefree.pojo.query.ShowCommentQuery;
import com.takefree.service.ShowCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by gaoxiang on 2017/12/13.
 */
@Service
public class ShowCommentServiceImpl implements ShowCommentService {
    @Autowired
    private ShowCommentMapper showCommentMapper;

    @Autowired
    private ShowCommentDTOMapper showCommentDTOMapper;

    @Override
    public ShowComment create(ShowComment showComment) {
        showCommentMapper.insertSelective(showComment);
        return showComment;
    }

    @Override
    public int delete(Long id) {
        int row=showCommentMapper.deleteByPrimaryKey(id);
        return row;
    }

    @Override
    public ShowCommentDTO get(Long id){
        return showCommentDTOMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<ShowCommentDTO> getShowComments(Integer page, Integer size, Long showId, Long userId) {
        ShowCommentQuery showCommentQuery=new ShowCommentQuery();
        if (page != null && size != null) {
            showCommentQuery.page(page, size);
        }
        if (page == null && size != null) {
            showCommentQuery.limit(size);
        }
        ShowCommentQuery.Criteria criteria= showCommentQuery.createCriteria();
        if(showId!=null){
            criteria.andShowIdEqualTo(showId);
        }

        if(userId!=null){
            criteria.andUserIdEqualTo(userId);
        }
        showCommentQuery.setOrderByClause("show_comment.id desc");
        return showCommentDTOMapper.selectByExample(showCommentQuery);
    }
}
