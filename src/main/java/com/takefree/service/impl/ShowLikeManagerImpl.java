package com.takefree.service.impl;

import com.takefree.common.PageResult;
import com.takefree.model.ShowLikeDO;
import com.takefree.query.ShowLikeQuery;
import com.takefree.dao.ext.ShowLikeExtMapper;
import com.takefree.service.ShowLikeManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 * Manager for ShowLike.
 */

@Component

public class ShowLikeManagerImpl implements ShowLikeManager{

    
    @Autowired
    protected ShowLikeExtMapper showLikeExtMapper;
    /**
     * query count by query condition.
     */
    @Override
    public int countByQuery(ShowLikeQuery query){
        return showLikeExtMapper.countByQuery(query);
    }

    /**
     * delete by query condition.
     */
    @Override
    public int deleteByQuery(ShowLikeQuery query){
        return showLikeExtMapper.deleteByQuery(query);
    }

    /**
     * delete by primary key.
     */
    @Override
    public int deleteByPrimaryKey(ShowLikeDO record){
        return showLikeExtMapper.deleteByPrimaryKey(record);
    }

    /**
     * insert selective.
     */
    @Override
    public long insertSelective(ShowLikeDO record){
        return showLikeExtMapper.insertSelective(record);
    }

    /**
     * select by query condition.
     */
    @Override
    public List<ShowLikeDO> selectByQuery(ShowLikeQuery query){
        return showLikeExtMapper.selectByQuery(query);
    }

    /**
     * select by query condition with page.
    */
    @Override
    public PageResult<ShowLikeDO> selectByQueryWithPage(ShowLikeQuery query) {
        PageResult<ShowLikeDO> result = new PageResult<ShowLikeDO>();
        result.setPageSize(query.getPageSize());
        result.setPageNo(query.getPageNo());
        result.setTotalCount(this.countByQuery(query));
        result.setResult(this.selectByQuery(query));
        return result;
    }

    /**
     * select by primary key.
     */
    @Override
    public ShowLikeDO selectByPrimaryKey(Long id){
        return showLikeExtMapper.selectByPrimaryKey(id);
    }

    /**
     * update by query condition selective.
     */
    @Override
    public int updateByQuerySelective( ShowLikeDO record,  ShowLikeQuery query){
        return showLikeExtMapper.updateByQuerySelective(record,  query);
    }

    /**
     * update by query condition.
     */
    @Override
    public int updateByQuery( ShowLikeDO record,  ShowLikeQuery query){

        return showLikeExtMapper.updateByQuery(record, query);
    }

    /**
     * update by primary key selective.
     */
    @Override
    public int updateByPrimaryKeySelective(ShowLikeDO record){
        return showLikeExtMapper.updateByPrimaryKeySelective(record);
    }
}
