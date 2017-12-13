package com.takefree.service.impl;

import com.takefree.pojo.mapper.CategoryLikeMapper;
import com.takefree.pojo.model.CategoryLike;
import com.takefree.pojo.query.CategoryLikeQuery;
import com.takefree.service.CategoryLikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by gaoxiang on 2017/12/13.
 */
@Service
public class CategoryLikeServiceImpl implements CategoryLikeService {

    @Autowired
    private CategoryLikeMapper categoryLikeMapper;

    @Override
    public CategoryLike create(CategoryLike categoryLike) {
        categoryLikeMapper.insertSelective(categoryLike);

        return categoryLike;
    }

    @Override
    public int delete(Long categoryId, Long userId) {
        CategoryLikeQuery categoryLikeQuery=new CategoryLikeQuery();
        CategoryLikeQuery.Criteria criteria=categoryLikeQuery.createCriteria();

        if(categoryId!=null){
            criteria.andCategoryIdEqualTo(categoryId);
        }

        if(userId!=null){
            criteria.andUserIdEqualTo(userId);
        }

        return categoryLikeMapper.deleteByExample(categoryLikeQuery);

    }

    @Override
    public List<CategoryLike> getCategoryLikes(Integer page, Integer size, Long maxId, Long userId) {
        CategoryLikeQuery categoryLikeQuery=new CategoryLikeQuery();
        CategoryLikeQuery.Criteria criteria=categoryLikeQuery.createCriteria();

        if (page != null && size != null) {
            categoryLikeQuery.page(page, size);
        }
        if (page == null && size != null) {
            categoryLikeQuery.limit(size);
        }

        if(userId!=null){
            criteria.andUserIdEqualTo(userId);
        }

        return categoryLikeMapper.selectByExample(categoryLikeQuery);
    }

    @Override
    public long getCount(Long categoryId, Long userId) {
        CategoryLikeQuery categoryLikeQuery=new CategoryLikeQuery();
        CategoryLikeQuery.Criteria criteria=categoryLikeQuery.createCriteria();

        if(categoryId!=null){
            criteria.andCategoryIdEqualTo(categoryId);
        }

        if(userId!=null){
            criteria.andUserIdEqualTo(userId);
        }
        return categoryLikeMapper.countByExample(categoryLikeQuery);
    }
}
