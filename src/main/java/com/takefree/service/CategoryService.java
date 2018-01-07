package com.takefree.service;


import com.takefree.dto.model.CategoryDTO;
import com.takefree.pojo.model.CategoryInfo;
import java.util.List;

/**
 * Created by zhangzhongyuan on 2017/11/7.
 */
public interface CategoryService {
    public CategoryInfo getCategoryInfoById(Long id);

    public List<CategoryDTO> getAll();
}
