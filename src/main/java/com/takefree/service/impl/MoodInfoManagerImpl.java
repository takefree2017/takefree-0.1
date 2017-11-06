package com.takefree.service.impl;

import com.takefree.common.PageResult;
import com.takefree.model.MoodInfoDO;
import com.takefree.query.MoodInfoQuery;
import com.takefree.dao.ext.MoodInfoExtMapper;
import com.takefree.service.MoodInfoManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 * Manager for MoodInfo.
 */

@Component

public class MoodInfoManagerImpl implements MoodInfoManager{

    
    @Autowired
    protected MoodInfoExtMapper moodInfoExtMapper;
    /**
     * query count by query condition.
     */
    @Override
    public int countByQuery(MoodInfoQuery query){
        return moodInfoExtMapper.countByQuery(query);
    }

    /**
     * delete by query condition.
     */
    @Override
    public int deleteByQuery(MoodInfoQuery query){
        return moodInfoExtMapper.deleteByQuery(query);
    }

    /**
     * delete by primary key.
     */
    @Override
    public int deleteByPrimaryKey(MoodInfoDO record){
        return moodInfoExtMapper.deleteByPrimaryKey(record);
    }

    /**
     * insert selective.
     */
    @Override
    public long insertSelective(MoodInfoDO record){
        return moodInfoExtMapper.insertSelective(record);
    }

    /**
     * select by query condition.
     */
    @Override
    public List<MoodInfoDO> selectByQuery(MoodInfoQuery query){
        return moodInfoExtMapper.selectByQuery(query);
    }

    /**
     * select by query condition with page.
    */
    @Override
    public PageResult<MoodInfoDO> selectByQueryWithPage(MoodInfoQuery query) {
        PageResult<MoodInfoDO> result = new PageResult<MoodInfoDO>();
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
    public MoodInfoDO selectByPrimaryKey(Long id){
        return moodInfoExtMapper.selectByPrimaryKey(id);
    }

    /**
     * update by query condition selective.
     */
    @Override
    public int updateByQuerySelective( MoodInfoDO record,  MoodInfoQuery query){
        return moodInfoExtMapper.updateByQuerySelective(record,  query);
    }

    /**
     * update by query condition.
     */
    @Override
    public int updateByQuery( MoodInfoDO record,  MoodInfoQuery query){

        return moodInfoExtMapper.updateByQuery(record, query);
    }

    /**
     * update by primary key selective.
     */
    @Override
    public int updateByPrimaryKeySelective(MoodInfoDO record){
        return moodInfoExtMapper.updateByPrimaryKeySelective(record);
    }
}
