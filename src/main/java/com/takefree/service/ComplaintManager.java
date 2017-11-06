package com.takefree.service;

import com.takefree.common.PageResult;
import com.takefree.model.ComplaintDO;
import com.takefree.query.ComplaintQuery;

import java.util.List;


/**
 * Manager for Complaint.
 */

public interface ComplaintManager {
    /**
     * query count by query condition.
     */
    int countByQuery(ComplaintQuery query);

    /**
     * delete by query condition.
     */
    int deleteByQuery(ComplaintQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(ComplaintDO record);

    /**
     * insert selective.
     */
    long insertSelective(ComplaintDO record);

    /**
     * select by query condition.
     */
    List<ComplaintDO> selectByQuery(ComplaintQuery query);


    /**
     * select by query condition with page.
     */
    PageResult<ComplaintDO> selectByQueryWithPage(ComplaintQuery query);

    /**
     * select by primary key.
     */
    ComplaintDO selectByPrimaryKey(Long id);

    /**
     * update by query condition selective.
     */
    int updateByQuerySelective(ComplaintDO record, ComplaintQuery query);

    /**
     * update by query condition.
     */
    int updateByQuery(ComplaintDO record, ComplaintQuery query);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(ComplaintDO record);
}
