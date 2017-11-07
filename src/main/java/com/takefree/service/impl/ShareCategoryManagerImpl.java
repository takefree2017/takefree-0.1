package com.takefree.service.impl;

import com.takefree.common.PageResult;
import com.takefree.model.ShareCategoryDO;
import com.takefree.query.ShareCategoryQuery;
import com.takefree.dao.ext.ShareCategoryExtMapper;
import com.takefree.service.ShareCategoryManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 * Manager for ShareCategory.
 */

@Component

public class ShareCategoryManagerImpl implements ShareCategoryManager{

    
    @Autowired
    protected ShareCategoryExtMapper shareCategoryExtMapper;
    /**
     * query count by query condition.
     */
    @Override
    public int countByQuery(ShareCategoryQuery query){
        return shareCategoryExtMapper.countByQuery(query);
    }

    /**
     * delete by query condition.
     */
    @Override
    public int deleteByQuery(ShareCategoryQuery query){
        return shareCategoryExtMapper.deleteByQuery(query);
    }

    /**
     * delete by primary key.
     */
    @Override
    public int deleteByPrimaryKey(ShareCategoryDO record){
        return shareCategoryExtMapper.deleteByPrimaryKey(record);
    }

    /**
     * insert selective.
     */
    @Override
    public long insertSelective(ShareCategoryDO record){
        return shareCategoryExtMapper.insertSelective(record);
    }

    /**
     * select by query condition.
     */
    @Override
    public List<ShareCategoryDO> selectByQuery(ShareCategoryQuery query){
        return shareCategoryExtMapper.selectByQuery(query);
    }

    /**
     * select by query condition with page.
    */
    @Override
    public PageResult<ShareCategoryDO> selectByQueryWithPage(ShareCategoryQuery query) {
        PageResult<ShareCategoryDO> result = new PageResult<ShareCategoryDO>();
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
    public ShareCategoryDO selectByPrimaryKey(Long id){
        return shareCategoryExtMapper.selectByPrimaryKey(id);
    }

    /**
     * update by query condition selective.
     */
    @Override
    public int updateByQuerySelective( ShareCategoryDO record,  ShareCategoryQuery query){
        return shareCategoryExtMapper.updateByQuerySelective(record,  query);
    }

    /**
     * update by query condition.
     */
    @Override
    public int updateByQuery( ShareCategoryDO record,  ShareCategoryQuery query){

        return shareCategoryExtMapper.updateByQuery(record, query);
    }

    /**
     * update by primary key selective.
     */
    @Override
    public int updateByPrimaryKeySelective(ShareCategoryDO record){
        return shareCategoryExtMapper.updateByPrimaryKeySelective(record);
    }
}
