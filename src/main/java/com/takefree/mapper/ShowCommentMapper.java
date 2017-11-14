package com.takefree.mapper;

import com.takefree.model.ShowComment;
import com.takefree.query.ShowCommentQuery;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

;

@Mapper
@Repository
public interface ShowCommentMapper {
    /**
     * This method corresponds to the database table show_comment
     * @mbg.generated
     */
    long countByExample(ShowCommentQuery example);

    /**
     * This method corresponds to the database table show_comment
     * @mbg.generated
     */
    int deleteByExample(ShowCommentQuery example);

    /**
     * This method corresponds to the database table show_comment
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method corresponds to the database table show_comment
     * @mbg.generated
     */
    int insert(ShowComment record);

    /**
     * This method corresponds to the database table show_comment
     * @mbg.generated
     */
    int insertSelective(ShowComment record);

    /**
     * This method corresponds to the database table show_comment
     * @mbg.generated
     */
    List<ShowComment> selectByExample(ShowCommentQuery example);

    /**
     * This method corresponds to the database table show_comment
     * @mbg.generated
     */
    ShowComment selectByPrimaryKey(Long id);

    /**
     * This method corresponds to the database table show_comment
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") ShowComment record, @Param("example") ShowCommentQuery example);

    /**
     * This method corresponds to the database table show_comment
     * @mbg.generated
     */
    int updateByExample(@Param("record") ShowComment record, @Param("example") ShowCommentQuery example);

    /**
     * This method corresponds to the database table show_comment
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(ShowComment record);

    /**
     * This method corresponds to the database table show_comment
     * @mbg.generated
     */
    int updateByPrimaryKey(ShowComment record);
}
