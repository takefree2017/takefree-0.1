package com.takefree.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.takefree.dao.TestObjectMapper;
import com.takefree.dataobject.TestObject;

@Service
public class TestService {
    
    @Autowired
    private TestObjectMapper gradeMapper;
    
    public TestObject getByNm(int id){
        return gradeMapper.getById(id);
    }
}
