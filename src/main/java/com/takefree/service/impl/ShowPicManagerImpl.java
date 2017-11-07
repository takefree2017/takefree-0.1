package com.takefree.service.impl;

import com.takefree.common.PageResult;
import com.takefree.model.ShowPicDO;
import com.takefree.query.ShowPicQuery;
import com.takefree.dao.ext.ShowPicExtMapper;
import com.takefree.service.ShowPicManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 * Manager for ShowPic.
 */

@Component

public class ShowPicManagerImpl implements ShowPicManager{

    
    @Autowired
    protected ShowPicExtMapper showPicExtMapper;
    /**
     * query count by query condition.
     */
    @Override
    public int countByQuery(ShowPicQuery query){
        return showPicExtMapper.countByQuery(query);
    }

    /**
     * delete by query condition.
     */
    @Override
    public int deleteByQuery(ShowPicQuery query){
        return showPicExtMapper.deleteByQuery(query);
    }

    /**
     * delete by primary key.
     */
    @Override
    public int deleteByPrimaryKey(ShowPicDO record){
        return showPicExtMapper.deleteByPrimaryKey(record);
    }

    /**
     * insert selective.
     */
    @Override
    public long insertSelective(ShowPicDO record){
        return showPicExtMapper.insertSelective(record);
    }

    /**
     * select by query condition.
     */
    @Override
    public List<ShowPicDO> selectByQuery(ShowPicQuery query){
        return showPicExtMapper.selectByQuery(query);
    }

    /**
     * select by query condition with page.
    */
    @Override
    public PageResult<ShowPicDO> selectByQueryWithPage(ShowPicQuery query) {
        PageResult<ShowPicDO> result = new PageResult<ShowPicDO>();
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
    public ShowPicDO selectByPrimaryKey(Long id){
        return showPicExtMapper.selectByPrimaryKey(id);
    }

    /**
     * update by query condition selective.
     */
    @Override
    public int updateByQuerySelective( ShowPicDO record,  ShowPicQuery query){
        return showPicExtMapper.updateByQuerySelective(record,  query);
    }

    /**
     * update by query condition.
     */
    @Override
    public int updateByQuery( ShowPicDO record,  ShowPicQuery query){

        return showPicExtMapper.updateByQuery(record, query);
    }

    /**
     * update by primary key selective.
     */
    @Override
    public int updateByPrimaryKeySelective(ShowPicDO record){
        return showPicExtMapper.updateByPrimaryKeySelective(record);
    }
}
