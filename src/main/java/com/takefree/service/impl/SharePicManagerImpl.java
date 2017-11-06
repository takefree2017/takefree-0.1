package com.takefree.service.impl;

import com.takefree.common.PageResult;
import com.takefree.model.SharePicDO;
import com.takefree.query.SharePicQuery;
import com.takefree.dao.ext.SharePicExtMapper;
import com.takefree.service.SharePicManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 * Manager for SharePic.
 */

@Component

public class SharePicManagerImpl implements SharePicManager{

    
    @Autowired
    protected SharePicExtMapper sharePicExtMapper;
    /**
     * query count by query condition.
     */
    @Override
    public int countByQuery(SharePicQuery query){
        return sharePicExtMapper.countByQuery(query);
    }

    /**
     * delete by query condition.
     */
    @Override
    public int deleteByQuery(SharePicQuery query){
        return sharePicExtMapper.deleteByQuery(query);
    }

    /**
     * delete by primary key.
     */
    @Override
    public int deleteByPrimaryKey(SharePicDO record){
        return sharePicExtMapper.deleteByPrimaryKey(record);
    }

    /**
     * insert selective.
     */
    @Override
    public long insertSelective(SharePicDO record){
        return sharePicExtMapper.insertSelective(record);
    }

    /**
     * select by query condition.
     */
    @Override
    public List<SharePicDO> selectByQuery(SharePicQuery query){
        return sharePicExtMapper.selectByQuery(query);
    }

    /**
     * select by query condition with page.
    */
    @Override
    public PageResult<SharePicDO> selectByQueryWithPage(SharePicQuery query) {
        PageResult<SharePicDO> result = new PageResult<SharePicDO>();
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
    public SharePicDO selectByPrimaryKey(Long id){
        return sharePicExtMapper.selectByPrimaryKey(id);
    }

    /**
     * update by query condition selective.
     */
    @Override
    public int updateByQuerySelective( SharePicDO record,  SharePicQuery query){
        return sharePicExtMapper.updateByQuerySelective(record,  query);
    }

    /**
     * update by query condition.
     */
    @Override
    public int updateByQuery( SharePicDO record,  SharePicQuery query){

        return sharePicExtMapper.updateByQuery(record, query);
    }

    /**
     * update by primary key selective.
     */
    @Override
    public int updateByPrimaryKeySelective(SharePicDO record){
        return sharePicExtMapper.updateByPrimaryKeySelective(record);
    }
}
