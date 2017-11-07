package com.takefree.service.impl;

import com.takefree.common.PageResult;
import com.takefree.model.ShareCommentDO;
import com.takefree.query.ShareCommentQuery;
import com.takefree.dao.ext.ShareCommentExtMapper;
import com.takefree.service.ShareCommentManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 * Manager for ShareComment.
 */

@Component

public class ShareCommentManagerImpl implements ShareCommentManager{

    
    @Autowired
    protected ShareCommentExtMapper shareCommentExtMapper;
    /**
     * query count by query condition.
     */
    @Override
    public int countByQuery(ShareCommentQuery query){
        return shareCommentExtMapper.countByQuery(query);
    }

    /**
     * delete by query condition.
     */
    @Override
    public int deleteByQuery(ShareCommentQuery query){
        return shareCommentExtMapper.deleteByQuery(query);
    }

    /**
     * delete by primary key.
     */
    @Override
    public int deleteByPrimaryKey(ShareCommentDO record){
        return shareCommentExtMapper.deleteByPrimaryKey(record);
    }

    /**
     * insert selective.
     */
    @Override
    public long insertSelective(ShareCommentDO record){
        return shareCommentExtMapper.insertSelective(record);
    }

    /**
     * select by query condition.
     */
    @Override
    public List<ShareCommentDO> selectByQuery(ShareCommentQuery query){
        return shareCommentExtMapper.selectByQuery(query);
    }

    /**
     * select by query condition with page.
    */
    @Override
    public PageResult<ShareCommentDO> selectByQueryWithPage(ShareCommentQuery query) {
        PageResult<ShareCommentDO> result = new PageResult<ShareCommentDO>();
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
    public ShareCommentDO selectByPrimaryKey(Long id){
        return shareCommentExtMapper.selectByPrimaryKey(id);
    }

    /**
     * update by query condition selective.
     */
    @Override
    public int updateByQuerySelective( ShareCommentDO record,  ShareCommentQuery query){
        return shareCommentExtMapper.updateByQuerySelective(record,  query);
    }

    /**
     * update by query condition.
     */
    @Override
    public int updateByQuery( ShareCommentDO record,  ShareCommentQuery query){

        return shareCommentExtMapper.updateByQuery(record, query);
    }

    /**
     * update by primary key selective.
     */
    @Override
    public int updateByPrimaryKeySelective(ShareCommentDO record){
        return shareCommentExtMapper.updateByPrimaryKeySelective(record);
    }
}
