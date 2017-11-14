package com.takefree.mapper;

import com.takefree.model.ShowLike;
import com.takefree.query.ShowLikeQuery;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

;

@Mapper
@Repository
public interface ShowLikeMapper {
    /**
     * This method corresponds to the database table show_like
     * @mbg.generated
     */
    long countByExample(ShowLikeQuery example);

    /**
     * This method corresponds to the database table show_like
     * @mbg.generated
     */
    int deleteByExample(ShowLikeQuery example);

    /**
     * This method corresponds to the database table show_like
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method corresponds to the database table show_like
     * @mbg.generated
     */
    int insert(ShowLike record);

    /**
     * This method corresponds to the database table show_like
     * @mbg.generated
     */
    int insertSelective(ShowLike record);

    /**
     * This method corresponds to the database table show_like
     * @mbg.generated
     */
    List<ShowLike> selectByExample(ShowLikeQuery example);

    /**
     * This method corresponds to the database table show_like
     * @mbg.generated
     */
    ShowLike selectByPrimaryKey(Long id);

    /**
     * This method corresponds to the database table show_like
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") ShowLike record, @Param("example") ShowLikeQuery example);

    /**
     * This method corresponds to the database table show_like
     * @mbg.generated
     */
    int updateByExample(@Param("record") ShowLike record, @Param("example") ShowLikeQuery example);

    /**
     * This method corresponds to the database table show_like
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(ShowLike record);

    /**
     * This method corresponds to the database table show_like
     * @mbg.generated
     */
    int updateByPrimaryKey(ShowLike record);
}
