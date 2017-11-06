package com.takefree.service.impl;

import com.takefree.common.PageResult;
import com.takefree.model.ShareLikeDO;
import com.takefree.query.ShareLikeQuery;
import com.takefree.dao.ext.ShareLikeExtMapper;
import com.takefree.service.ShareLikeManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 * Manager for ShareLike.
 */

@Component

public class ShareLikeManagerImpl implements ShareLikeManager{

    
    @Autowired
    protected ShareLikeExtMapper shareLikeExtMapper;
    /**
     * query count by query condition.
     */
    @Override
    public int countByQuery(ShareLikeQuery query){
        return shareLikeExtMapper.countByQuery(query);
    }

    /**
     * delete by query condition.
     */
    @Override
    public int deleteByQuery(ShareLikeQuery query){
        return shareLikeExtMapper.deleteByQuery(query);
    }

    /**
     * delete by primary key.
     */
    @Override
    public int deleteByPrimaryKey(ShareLikeDO record){
        return shareLikeExtMapper.deleteByPrimaryKey(record);
    }

    /**
     * insert selective.
     */
    @Override
    public long insertSelective(ShareLikeDO record){
        return shareLikeExtMapper.insertSelective(record);
    }

    /**
     * select by query condition.
     */
    @Override
    public List<ShareLikeDO> selectByQuery(ShareLikeQuery query){
        return shareLikeExtMapper.selectByQuery(query);
    }

    /**
     * select by query condition with page.
    */
    @Override
    public PageResult<ShareLikeDO> selectByQueryWithPage(ShareLikeQuery query) {
        PageResult<ShareLikeDO> result = new PageResult<ShareLikeDO>();
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
    public ShareLikeDO selectByPrimaryKey(Long id){
        return shareLikeExtMapper.selectByPrimaryKey(id);
    }

    /**
     * update by query condition selective.
     */
    @Override
    public int updateByQuerySelective( ShareLikeDO record,  ShareLikeQuery query){
        return shareLikeExtMapper.updateByQuerySelective(record,  query);
    }

    /**
     * update by query condition.
     */
    @Override
    public int updateByQuery( ShareLikeDO record,  ShareLikeQuery query){

        return shareLikeExtMapper.updateByQuery(record, query);
    }

    /**
     * update by primary key selective.
     */
    @Override
    public int updateByPrimaryKeySelective(ShareLikeDO record){
        return shareLikeExtMapper.updateByPrimaryKeySelective(record);
    }
}
