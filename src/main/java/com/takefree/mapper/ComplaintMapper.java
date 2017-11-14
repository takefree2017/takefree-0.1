package com.takefree.mapper;

import com.takefree.model.ComplaintDO;
import com.takefree.query.ComplaintQuery;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
/**
 * MyBatis Mapper for Complaint.
 */
 @Mapper
 @Repository

public interface ComplaintMapper {
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
    int insertSelective(ComplaintDO record);

    /**
     * select by query condition.
     */
    List<ComplaintDO> selectByQuery(ComplaintQuery query);

    /**
     * select by primary key.
     */
    ComplaintDO selectByPrimaryKey(Long id);

    /**
     * update by query condition selective.
     */
    int updateByQuerySelective(@Param("record") ComplaintDO record, @Param("query") ComplaintQuery query);

    /**
     * update by query condition.
     */
    int updateByQuery(@Param("record") ComplaintDO record, @Param("query") ComplaintQuery query);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(ComplaintDO record);
}
