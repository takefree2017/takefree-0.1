package com.takefree.service.impl;

import com.takefree.dto.mapper.ShowLikeDTOMapper;
import com.takefree.dto.model.ShowLikeDTO;
import com.takefree.pojo.mapper.ShowCounterMapper;
import com.takefree.pojo.mapper.ShowLikeMapper;
import com.takefree.pojo.model.ShowLike;
import com.takefree.pojo.query.ShowLikeQuery;
import com.takefree.service.ShowLikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by gaoxiang on 2017/12/12.
 */
@Service
public class ShowLikeServiceImpl implements ShowLikeService {
    @Autowired
    private ShowLikeMapper showLikeMapper;

    @Autowired
    private ShowCounterMapper showCounterMapper;

    @Autowired
    private ShowLikeDTOMapper showLikeDTOMapper;

    @Override
    public ShowLike create(ShowLike showLike) {
        int i=showLikeMapper.insert(showLike);
        showCounterMapper.changeLikeCount(showLike.getShowId(),i);
        return showLike;
    }

    @Override
    public int delete(Long showId, Long userId) {
        ShowLikeQuery showLikeQuery=new ShowLikeQuery();
        showLikeQuery.createCriteria().andShowIdEqualTo(showId).andUserIdEqualTo(userId);
        int i=showLikeMapper.deleteByExample(showLikeQuery);
        showCounterMapper.changeLikeCount(showId,-i);
        return i;
    }

    @Override
    public List<ShowLikeDTO> getShowLikeDTOs(Integer page, Integer size, Long maxId, Long showId, Long userId) {
        ShowLikeQuery showLikeQuery=new ShowLikeQuery();
        if (page != null && size != null) {
            showLikeQuery.page(page, size);
        }
        if (page == null && size != null) {
            showLikeQuery.limit(size);
        }
        ShowLikeQuery.Criteria criteria= showLikeQuery.createCriteria();
        if(showId!=null){
            criteria.andShowIdEqualTo(showId);
        }
        if(userId!=null){
            criteria.andUserIdEqualTo(userId);
        }
        showLikeQuery.setOrderByClause("show_like.id desc");

        return showLikeDTOMapper.selectByExample(showLikeQuery);
    }

    @Override
    public long getCount(Long showId, Long userId) {
        ShowLikeQuery showLikeQuery=new ShowLikeQuery();
        ShowLikeQuery.Criteria criteria= showLikeQuery.createCriteria();
        if(showId!=null){
            criteria.andShowIdEqualTo(showId);
        }
        if(userId!=null){
            criteria.andUserIdEqualTo(userId);
        }
        return showLikeMapper.countByExample(showLikeQuery);
    }
}
