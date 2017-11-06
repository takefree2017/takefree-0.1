package com.takefree.service.impl;

import com.takefree.common.PageResult;
import com.takefree.model.CategoryLikeDO;
import com.takefree.query.CategoryLikeQuery;
import com.takefree.dao.ext.CategoryLikeExtMapper;
import com.takefree.service.CategoryLikeManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 * Manager for CategoryLike.
 */

@Component

public class CategoryLikeManagerImpl implements CategoryLikeManager{

    
    @Autowired
    protected CategoryLikeExtMapper categoryLikeExtMapper;
    /**
     * query count by query condition.
     */
    @Override
    public int countByQuery(CategoryLikeQuery query){
        return categoryLikeExtMapper.countByQuery(query);
    }

    /**
     * delete by query condition.
     */
    @Override
    public int deleteByQuery(CategoryLikeQuery query){
        return categoryLikeExtMapper.deleteByQuery(query);
    }

    /**
     * delete by primary key.
     */
    @Override
    public int deleteByPrimaryKey(CategoryLikeDO record){
        return categoryLikeExtMapper.deleteByPrimaryKey(record);
    }

    /**
     * insert selective.
     */
    @Override
    public long insertSelective(CategoryLikeDO record){
        return categoryLikeExtMapper.insertSelective(record);
    }

    /**
     * select by query condition.
     */
    @Override
    public List<CategoryLikeDO> selectByQuery(CategoryLikeQuery query){
        return categoryLikeExtMapper.selectByQuery(query);
    }

    /**
     * select by query condition with page.
    */
    @Override
    public PageResult<CategoryLikeDO> selectByQueryWithPage(CategoryLikeQuery query) {
        PageResult<CategoryLikeDO> result = new PageResult<CategoryLikeDO>();
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
    public CategoryLikeDO selectByPrimaryKey(Long id){
        return categoryLikeExtMapper.selectByPrimaryKey(id);
    }

    /**
     * update by query condition selective.
     */
    @Override
    public int updateByQuerySelective( CategoryLikeDO record,  CategoryLikeQuery query){
        return categoryLikeExtMapper.updateByQuerySelective(record,  query);
    }

    /**
     * update by query condition.
     */
    @Override
    public int updateByQuery( CategoryLikeDO record,  CategoryLikeQuery query){

        return categoryLikeExtMapper.updateByQuery(record, query);
    }

    /**
     * update by primary key selective.
     */
    @Override
    public int updateByPrimaryKeySelective(CategoryLikeDO record){
        return categoryLikeExtMapper.updateByPrimaryKeySelective(record);
    }
}
