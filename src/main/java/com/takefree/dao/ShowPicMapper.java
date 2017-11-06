package com.takefree.dao;

import com.takefree.model.ShowPicDO;
import com.takefree.query.ShowPicQuery;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * MyBatis Mapper for ShowPic.
 */
@Mapper
@Repository

public interface ShowPicMapper {

    /**
     * query count by query condition.
     */
    int countByQuery(ShowPicQuery query);

    /**
     * delete by query condition.
     */
    int deleteByQuery(ShowPicQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(ShowPicDO record);

    /**
     * insert selective.
     */
    int insertSelective(ShowPicDO record);

    /**
     * select by query condition.
     */
    List<ShowPicDO> selectByQuery(ShowPicQuery query);

    /**
     * select by primary key.
     */
    ShowPicDO selectByPrimaryKey(Long id);

    /**
     * update by query condition selective.
     */
    int updateByQuerySelective(@Param("record") ShowPicDO record, @Param("query") ShowPicQuery query);

    /**
     * update by query condition.
     */
    int updateByQuery(@Param("record") ShowPicDO record, @Param("query") ShowPicQuery query);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(ShowPicDO record);
}
