package com.takefree.service.impl;

import com.takefree.common.PageResult;
import com.takefree.service.CategoryInfoManager;
import com.takefree.dao.ext.CategoryInfoExtMapper;
import com.takefree.model.CategoryInfoDO;
import com.takefree.query.CategoryInfoQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 * Manager for CategoryInfo.
 */

@Component

public class CategoryInfoManagerImpl implements CategoryInfoManager {

    
    @Autowired
    protected CategoryInfoExtMapper categoryInfoExtMapper;
    /**
     * query count by query condition.
     */
    @Override
    public int countByQuery(CategoryInfoQuery query){
        return categoryInfoExtMapper.countByQuery(query);
    }

    /**
     * delete by query condition.
     */
    @Override
    public int deleteByQuery(CategoryInfoQuery query){
        return categoryInfoExtMapper.deleteByQuery(query);
    }

    /**
     * delete by primary key.
     */
    @Override
    public int deleteByPrimaryKey(CategoryInfoDO record){
        return categoryInfoExtMapper.deleteByPrimaryKey(record);
    }

    /**
     * insert selective.
     */
    @Override
    public long insertSelective(CategoryInfoDO record){
        return categoryInfoExtMapper.insertSelective(record);
    }

    /**
     * select by query condition.
     */
    @Override
    public List<CategoryInfoDO> selectByQuery(CategoryInfoQuery query){
        return categoryInfoExtMapper.selectByQuery(query);
    }

    /**
     * select by query condition with page.
    */
    @Override
    public PageResult<CategoryInfoDO> selectByQueryWithPage(CategoryInfoQuery query) {
        PageResult<CategoryInfoDO> result = new PageResult<CategoryInfoDO>();
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
    public CategoryInfoDO selectByPrimaryKey(Long id){
        return categoryInfoExtMapper.selectByPrimaryKey(id);
    }

    /**
     * update by query condition selective.
     */
    @Override
    public int updateByQuerySelective( CategoryInfoDO record,  CategoryInfoQuery query){
        return categoryInfoExtMapper.updateByQuerySelective(record,  query);
    }

    /**
     * update by query condition.
     */
    @Override
    public int updateByQuery( CategoryInfoDO record,  CategoryInfoQuery query){

        return categoryInfoExtMapper.updateByQuery(record, query);
    }

    /**
     * update by primary key selective.
     */
    @Override
    public int updateByPrimaryKeySelective(CategoryInfoDO record){
        return categoryInfoExtMapper.updateByPrimaryKeySelective(record);
    }
}
