package com.takefree.service.impl;

import com.takefree.common.PageResult;
import com.takefree.model.ShareDO;
import com.takefree.query.ShareQuery;
import com.takefree.dao.ext.ShareExtMapper;
import com.takefree.service.ShareManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 * Manager for Share.
 */

@Component

public class ShareManagerImpl implements ShareManager{

    
    @Autowired
    protected ShareExtMapper shareExtMapper;
    /**
     * query count by query condition.
     */
    @Override
    public int countByQuery(ShareQuery query){
        return shareExtMapper.countByQuery(query);
    }

    /**
     * delete by query condition.
     */
    @Override
    public int deleteByQuery(ShareQuery query){
        return shareExtMapper.deleteByQuery(query);
    }

    /**
     * delete by primary key.
     */
    @Override
    public int deleteByPrimaryKey(ShareDO record){
        return shareExtMapper.deleteByPrimaryKey(record);
    }

    /**
     * insert selective.
     */
    @Override
    public long insertSelective(ShareDO record){
        return shareExtMapper.insertSelective(record);
    }

    /**
     * select by query condition.
     */
    @Override
    public List<ShareDO> selectByQuery(ShareQuery query){
        return shareExtMapper.selectByQuery(query);
    }

    /**
     * select by query condition with page.
    */
    @Override
    public PageResult<ShareDO> selectByQueryWithPage(ShareQuery query) {
        PageResult<ShareDO> result = new PageResult<ShareDO>();
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
    public ShareDO selectByPrimaryKey(Long id){
        return shareExtMapper.selectByPrimaryKey(id);
    }

    /**
     * update by query condition selective.
     */
    @Override
    public int updateByQuerySelective( ShareDO record,  ShareQuery query){
        return shareExtMapper.updateByQuerySelective(record,  query);
    }

    /**
     * update by query condition.
     */
    @Override
    public int updateByQuery( ShareDO record,  ShareQuery query){

        return shareExtMapper.updateByQuery(record, query);
    }

    /**
     * update by primary key selective.
     */
    @Override
    public int updateByPrimaryKeySelective(ShareDO record){
        return shareExtMapper.updateByPrimaryKeySelective(record);
    }
}
