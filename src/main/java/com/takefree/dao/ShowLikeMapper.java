package com.takefree.dao;

import com.takefree.model.ShowLikeDO;
import com.takefree.query.ShowLikeQuery;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * MyBatis Mapper for ShowLike.
 */
@Mapper
@Repository

public interface ShowLikeMapper {

    /**
     * query count by query condition.
     */
    int countByQuery(ShowLikeQuery query);

    /**
     * delete by query condition.
     */
    int deleteByQuery(ShowLikeQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(ShowLikeDO record);

    /**
     * insert selective.
     */
    int insertSelective(ShowLikeDO record);

    /**
     * select by query condition.
     */
    List<ShowLikeDO> selectByQuery(ShowLikeQuery query);

    /**
     * select by primary key.
     */
    ShowLikeDO selectByPrimaryKey(Long id);

    /**
     * update by query condition selective.
     */
    int updateByQuerySelective(@Param("record") ShowLikeDO record, @Param("query") ShowLikeQuery query);

    /**
     * update by query condition.
     */
    int updateByQuery(@Param("record") ShowLikeDO record, @Param("query") ShowLikeQuery query);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(ShowLikeDO record);
}
