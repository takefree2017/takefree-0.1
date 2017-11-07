package com.takefree.service.impl;

import com.takefree.common.PageResult;
import com.takefree.model.RegionInfoDO;
import com.takefree.query.RegionInfoQuery;
import com.takefree.dao.ext.RegionInfoExtMapper;
import com.takefree.service.RegionInfoManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 * Manager for RegionInfo.
 */

@Component

public class RegionInfoManagerImpl implements RegionInfoManager{

    
    @Autowired
    protected RegionInfoExtMapper regionInfoExtMapper;
    /**
     * query count by query condition.
     */
    @Override
    public int countByQuery(RegionInfoQuery query){
        return regionInfoExtMapper.countByQuery(query);
    }

    /**
     * delete by query condition.
     */
    @Override
    public int deleteByQuery(RegionInfoQuery query){
        return regionInfoExtMapper.deleteByQuery(query);
    }

    /**
     * delete by primary key.
     */
    @Override
    public int deleteByPrimaryKey(RegionInfoDO record){
        return regionInfoExtMapper.deleteByPrimaryKey(record);
    }

    /**
     * insert selective.
     */
    @Override
    public long insertSelective(RegionInfoDO record){
        return regionInfoExtMapper.insertSelective(record);
    }

    /**
     * select by query condition.
     */
    @Override
    public List<RegionInfoDO> selectByQuery(RegionInfoQuery query){
        return regionInfoExtMapper.selectByQuery(query);
    }

    /**
     * select by query condition with page.
    */
    @Override
    public PageResult<RegionInfoDO> selectByQueryWithPage(RegionInfoQuery query) {
        PageResult<RegionInfoDO> result = new PageResult<RegionInfoDO>();
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
    public RegionInfoDO selectByPrimaryKey(Long id){
        return regionInfoExtMapper.selectByPrimaryKey(id);
    }

    /**
     * update by query condition selective.
     */
    @Override
    public int updateByQuerySelective( RegionInfoDO record,  RegionInfoQuery query){
        return regionInfoExtMapper.updateByQuerySelective(record,  query);
    }

    /**
     * update by query condition.
     */
    @Override
    public int updateByQuery( RegionInfoDO record,  RegionInfoQuery query){

        return regionInfoExtMapper.updateByQuery(record, query);
    }

    /**
     * update by primary key selective.
     */
    @Override
    public int updateByPrimaryKeySelective(RegionInfoDO record){
        return regionInfoExtMapper.updateByPrimaryKeySelective(record);
    }
}
