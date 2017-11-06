package com.takefree.service.impl;

import com.takefree.common.PageResult;
import com.takefree.model.ShowCommentDO;
import com.takefree.query.ShowCommentQuery;
import com.takefree.dao.ext.ShowCommentExtMapper;
import com.takefree.service.ShowCommentManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 * Manager for ShowComment.
 */

@Component

public class ShowCommentManagerImpl implements ShowCommentManager{

    
    @Autowired
    protected ShowCommentExtMapper showCommentExtMapper;
    /**
     * query count by query condition.
     */
    @Override
    public int countByQuery(ShowCommentQuery query){
        return showCommentExtMapper.countByQuery(query);
    }

    /**
     * delete by query condition.
     */
    @Override
    public int deleteByQuery(ShowCommentQuery query){
        return showCommentExtMapper.deleteByQuery(query);
    }

    /**
     * delete by primary key.
     */
    @Override
    public int deleteByPrimaryKey(ShowCommentDO record){
        return showCommentExtMapper.deleteByPrimaryKey(record);
    }

    /**
     * insert selective.
     */
    @Override
    public long insertSelective(ShowCommentDO record){
        return showCommentExtMapper.insertSelective(record);
    }

    /**
     * select by query condition.
     */
    @Override
    public List<ShowCommentDO> selectByQuery(ShowCommentQuery query){
        return showCommentExtMapper.selectByQuery(query);
    }

    /**
     * select by query condition with page.
    */
    @Override
    public PageResult<ShowCommentDO> selectByQueryWithPage(ShowCommentQuery query) {
        PageResult<ShowCommentDO> result = new PageResult<ShowCommentDO>();
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
    public ShowCommentDO selectByPrimaryKey(Long id){
        return showCommentExtMapper.selectByPrimaryKey(id);
    }

    /**
     * update by query condition selective.
     */
    @Override
    public int updateByQuerySelective( ShowCommentDO record,  ShowCommentQuery query){
        return showCommentExtMapper.updateByQuerySelective(record,  query);
    }

    /**
     * update by query condition.
     */
    @Override
    public int updateByQuery( ShowCommentDO record,  ShowCommentQuery query){

        return showCommentExtMapper.updateByQuery(record, query);
    }

    /**
     * update by primary key selective.
     */
    @Override
    public int updateByPrimaryKeySelective(ShowCommentDO record){
        return showCommentExtMapper.updateByPrimaryKeySelective(record);
    }
}
