package com.takefree.dao;

import com.takefree.model.ShowCounterDO;
import com.takefree.query.ShowCounterQuery;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * MyBatis Mapper for ShowCounter.
 */
@Mapper
@Repository

public interface ShowCounterMapper {

    /**
     * query count by query condition.
     */
    int countByQuery(ShowCounterQuery query);

    /**
     * delete by query condition.
     */
    int deleteByQuery(ShowCounterQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(ShowCounterDO record);

    /**
     * insert selective.
     */
    int insertSelective(ShowCounterDO record);

    /**
     * select by query condition.
     */
    List<ShowCounterDO> selectByQuery(ShowCounterQuery query);

    /**
     * select by primary key.
     */
    ShowCounterDO selectByPrimaryKey(Long id);

    /**
     * update by query condition selective.
     */
    int updateByQuerySelective(@Param("record") ShowCounterDO record, @Param("query") ShowCounterQuery query);

    /**
     * update by query condition.
     */
    int updateByQuery(@Param("record") ShowCounterDO record, @Param("query") ShowCounterQuery query);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(ShowCounterDO record);
}
