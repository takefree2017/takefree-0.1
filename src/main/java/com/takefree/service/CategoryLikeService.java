package com.takefree.service;


import com.takefree.pojo.model.CategoryLike;

import java.util.List;

/**
 * Created by gaoxiang on 2017/11/7.
 */
public interface CategoryLikeService {
    CategoryLike create(CategoryLike categoryLike);

    int delete(Long categoryId, Long userId);

    List<CategoryLike> getCategoryLikes(Integer page, Integer size, Long maxId, Long userId);

    long getCount(Long categoryId, Long userId);

}
