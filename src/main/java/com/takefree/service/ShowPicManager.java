package com.takefree.service;

import com.takefree.common.PageResult;
import com.takefree.model.ShowPicDO;
import com.takefree.query.ShowPicQuery;

import java.util.List;


/**
 * Manager for ShowPic.
 */

public interface ShowPicManager {
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
    long insertSelective(ShowPicDO record);

    /**
     * select by query condition.
     */
    List<ShowPicDO> selectByQuery(ShowPicQuery query);


    /**
     * select by query condition with page.
     */
    PageResult<ShowPicDO> selectByQueryWithPage(ShowPicQuery query);

    /**
     * select by primary key.
     */
    ShowPicDO selectByPrimaryKey(Long id);

    /**
     * update by query condition selective.
     */
    int updateByQuerySelective(ShowPicDO record, ShowPicQuery query);

    /**
     * update by query condition.
     */
    int updateByQuery(ShowPicDO record, ShowPicQuery query);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(ShowPicDO record);
}
