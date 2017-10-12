package com.qianbao.takefree.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qianbao.takefree.dao.TestObjectMapper;
import com.qianbao.takefree.dataobject.TestObject;

@Service
public class TestService {
    
    @Autowired
    private TestObjectMapper gradeMapper;
    
    public TestObject getByNm(int id){
        return gradeMapper.getById(id);
    }
}
