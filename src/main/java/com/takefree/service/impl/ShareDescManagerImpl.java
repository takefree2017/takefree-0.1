package com.takefree.service.impl;

import com.takefree.common.PageResult;
import com.takefree.model.ShareDescDO;
import com.takefree.query.ShareDescQuery;
import com.takefree.dao.ext.ShareDescExtMapper;
import com.takefree.service.ShareDescManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 * Manager for ShareDesc.
 */

@Component

public class ShareDescManagerImpl implements ShareDescManager{

    
    @Autowired
    protected ShareDescExtMapper shareDescExtMapper;
    /**
     * query count by query condition.
     */
    @Override
    public int countByQuery(ShareDescQuery query){
        return shareDescExtMapper.countByQuery(query);
    }

    /**
     * delete by query condition.
     */
    @Override
    public int deleteByQuery(ShareDescQuery query){
        return shareDescExtMapper.deleteByQuery(query);
    }

    /**
     * delete by primary key.
     */
    @Override
    public int deleteByPrimaryKey(ShareDescDO record){
        return shareDescExtMapper.deleteByPrimaryKey(record);
    }

    /**
     * insert selective.
     */
    @Override
    public long insertSelective(ShareDescDO record){
        return shareDescExtMapper.insertSelective(record);
    }

    /**
     * select by query condition.
     */
    @Override
    public List<ShareDescDO> selectByQuery(ShareDescQuery query){
        return shareDescExtMapper.selectByQuery(query);
    }

    /**
     * select by query condition with page.
    */
    @Override
    public PageResult<ShareDescDO> selectByQueryWithPage(ShareDescQuery query) {
        PageResult<ShareDescDO> result = new PageResult<ShareDescDO>();
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
    public ShareDescDO selectByPrimaryKey(Long id){
        return shareDescExtMapper.selectByPrimaryKey(id);
    }

    /**
     * update by query condition selective.
     */
    @Override
    public int updateByQuerySelective( ShareDescDO record,  ShareDescQuery query){
        return shareDescExtMapper.updateByQuerySelective(record,  query);
    }

    /**
     * update by query condition.
     */
    @Override
    public int updateByQuery( ShareDescDO record,  ShareDescQuery query){

        return shareDescExtMapper.updateByQuery(record, query);
    }

    /**
     * update by primary key selective.
     */
    @Override
    public int updateByPrimaryKeySelective(ShareDescDO record){
        return shareDescExtMapper.updateByPrimaryKeySelective(record);
    }
}
