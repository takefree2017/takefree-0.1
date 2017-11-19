package com.takefree.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.takefree.dao.RegionInfoMapper;
import com.takefree.dataobject.RegionInfoObject;

@Service
public class RegionInfoService {
    @Autowired
    private RegionInfoMapper gradeMapper;
    
    public List<RegionInfoObject> getAll(int layer){
    	
    	List<RegionInfoObject> lr = gradeMapper.getAll(layer);
        return lr;
    }
}
