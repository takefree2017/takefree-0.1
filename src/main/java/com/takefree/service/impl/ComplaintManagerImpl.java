package com.takefree.service.impl;

import com.takefree.common.PageResult;
import com.takefree.model.ComplaintDO;
import com.takefree.query.ComplaintQuery;
import com.takefree.dao.ext.ComplaintExtMapper;
import com.takefree.service.ComplaintManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 * Manager for Complaint.
 */

@Component

public class ComplaintManagerImpl implements ComplaintManager{

    
    @Autowired
    protected ComplaintExtMapper complaintExtMapper;
    /**
     * query count by query condition.
     */
    @Override
    public int countByQuery(ComplaintQuery query){
        return complaintExtMapper.countByQuery(query);
    }

    /**
     * delete by query condition.
     */
    @Override
    public int deleteByQuery(ComplaintQuery query){
        return complaintExtMapper.deleteByQuery(query);
    }

    /**
     * delete by primary key.
     */
    @Override
    public int deleteByPrimaryKey(ComplaintDO record){
        return complaintExtMapper.deleteByPrimaryKey(record);
    }

    /**
     * insert selective.
     */
    @Override
    public long insertSelective(ComplaintDO record){
        return complaintExtMapper.insertSelective(record);
    }

    /**
     * select by query condition.
     */
    @Override
    public List<ComplaintDO> selectByQuery(ComplaintQuery query){
        return complaintExtMapper.selectByQuery(query);
    }

    /**
     * select by query condition with page.
    */
    @Override
    public PageResult<ComplaintDO> selectByQueryWithPage(ComplaintQuery query) {
        PageResult<ComplaintDO> result = new PageResult<ComplaintDO>();
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
    public ComplaintDO selectByPrimaryKey(Long id){
        return complaintExtMapper.selectByPrimaryKey(id);
    }

    /**
     * update by query condition selective.
     */
    @Override
    public int updateByQuerySelective( ComplaintDO record,  ComplaintQuery query){
        return complaintExtMapper.updateByQuerySelective(record,  query);
    }

    /**
     * update by query condition.
     */
    @Override
    public int updateByQuery( ComplaintDO record,  ComplaintQuery query){

        return complaintExtMapper.updateByQuery(record, query);
    }

    /**
     * update by primary key selective.
     */
    @Override
    public int updateByPrimaryKeySelective(ComplaintDO record){
        return complaintExtMapper.updateByPrimaryKeySelective(record);
    }
}
