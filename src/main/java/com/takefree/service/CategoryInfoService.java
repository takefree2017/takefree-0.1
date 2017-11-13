package com.takefree.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.takefree.dao.CategoryInfoMapper;
import com.takefree.dataobject.CategoryInfoObject;

@Service
public class CategoryInfoService {

    @Autowired
    private CategoryInfoMapper gradeMapper;
    
    public List<CategoryInfoObject> getAll(int layer){

    	List<CategoryInfoObject> lr = gradeMapper.getAll(layer);
        return lr;
    }
}
