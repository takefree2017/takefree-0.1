package com.takefree.service.impl;

import com.takefree.common.PageResult;
import com.takefree.model.ShareLbsDO;
import com.takefree.query.ShareLbsQuery;
import com.takefree.dao.ext.ShareLbsExtMapper;
import com.takefree.service.ShareLbsManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 * Manager for ShareLbs.
 */

@Component

public class ShareLbsManagerImpl implements ShareLbsManager{

    
    @Autowired
    protected ShareLbsExtMapper shareLbsExtMapper;
    /**
     * query count by query condition.
     */
    @Override
    public int countByQuery(ShareLbsQuery query){
        return shareLbsExtMapper.countByQuery(query);
    }

    /**
     * delete by query condition.
     */
    @Override
    public int deleteByQuery(ShareLbsQuery query){
        return shareLbsExtMapper.deleteByQuery(query);
    }

    /**
     * delete by primary key.
     */
    @Override
    public int deleteByPrimaryKey(ShareLbsDO record){
        return shareLbsExtMapper.deleteByPrimaryKey(record);
    }

    /**
     * insert selective.
     */
    @Override
    public long insertSelective(ShareLbsDO record){
        return shareLbsExtMapper.insertSelective(record);
    }

    /**
     * select by query condition.
     */
    @Override
    public List<ShareLbsDO> selectByQuery(ShareLbsQuery query){
        return shareLbsExtMapper.selectByQuery(query);
    }

    /**
     * select by query condition with page.
    */
    @Override
    public PageResult<ShareLbsDO> selectByQueryWithPage(ShareLbsQuery query) {
        PageResult<ShareLbsDO> result = new PageResult<ShareLbsDO>();
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
    public ShareLbsDO selectByPrimaryKey(Long id){
        return shareLbsExtMapper.selectByPrimaryKey(id);
    }

    /**
     * update by query condition selective.
     */
    @Override
    public int updateByQuerySelective( ShareLbsDO record,  ShareLbsQuery query){
        return shareLbsExtMapper.updateByQuerySelective(record,  query);
    }

    /**
     * update by query condition.
     */
    @Override
    public int updateByQuery( ShareLbsDO record,  ShareLbsQuery query){

        return shareLbsExtMapper.updateByQuery(record, query);
    }

    /**
     * update by primary key selective.
     */
    @Override
    public int updateByPrimaryKeySelective(ShareLbsDO record){
        return shareLbsExtMapper.updateByPrimaryKeySelective(record);
    }
}
