package com.takefree.service.impl;

import com.takefree.dto.mapper.CategoryDTOMapper;
import com.takefree.dto.model.CategoryDTO;
import com.takefree.pojo.mapper.CategoryInfoMapper;
import com.takefree.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryDTOMapper categoryDTOMapper;

    @Autowired
    private CategoryInfoMapper categoryInfoMapper;
    
    public List<CategoryDTO> getAll(){
        return null;
    }
}
