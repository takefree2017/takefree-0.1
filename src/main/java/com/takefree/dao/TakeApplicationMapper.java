package com.takefree.dao;

import com.takefree.model.TakeApplicationDO;
import com.takefree.query.TakeApplicationQuery;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * MyBatis Mapper for TakeApplication.
 */
@Mapper
@Repository

public interface TakeApplicationMapper {

    /**
     * query count by query condition.
     */
    int countByQuery(TakeApplicationQuery query);

    /**
     * delete by query condition.
     */
    int deleteByQuery(TakeApplicationQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(TakeApplicationDO record);

    /**
     * insert selective.
     */
    int insertSelective(TakeApplicationDO record);

    /**
     * select by query condition.
     */
    List<TakeApplicationDO> selectByQuery(TakeApplicationQuery query);

    /**
     * select by primary key.
     */
    TakeApplicationDO selectByPrimaryKey(Long id);

    /**
     * update by query condition selective.
     */
    int updateByQuerySelective(@Param("record") TakeApplicationDO record, @Param("query") TakeApplicationQuery query);

    /**
     * update by query condition.
     */
    int updateByQuery(@Param("record") TakeApplicationDO record, @Param("query") TakeApplicationQuery query);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(TakeApplicationDO record);
}
