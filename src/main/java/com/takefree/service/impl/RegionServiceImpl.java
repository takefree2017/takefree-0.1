package com.takefree.service.impl;

import com.takefree.pojo.mapper.RegionInfoMapper;
import com.takefree.pojo.model.RegionInfo;
import com.takefree.pojo.query.RegionInfoQuery;
import com.takefree.service.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegionServiceImpl implements RegionService{
    @Autowired
    private RegionInfoMapper regionInfoMapper;
    
    public List<RegionInfo> getAll(){
    	
    	List<RegionInfo> lr = regionInfoMapper.selectByExample(new RegionInfoQuery());
        return lr;
    }
}
