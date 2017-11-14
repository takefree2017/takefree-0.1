package com.takefree.mapper;

import com.takefree.model.ShareComment;
import com.takefree.query.ShareCommentQuery;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

;

@Mapper
@Repository
public interface ShareCommentMapper {
    /**
     * This method corresponds to the database table share_comment
     * @mbg.generated
     */
    long countByExample(ShareCommentQuery example);

    /**
     * This method corresponds to the database table share_comment
     * @mbg.generated
     */
    int deleteByExample(ShareCommentQuery example);

    /**
     * This method corresponds to the database table share_comment
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method corresponds to the database table share_comment
     * @mbg.generated
     */
    int insert(ShareComment record);

    /**
     * This method corresponds to the database table share_comment
     * @mbg.generated
     */
    int insertSelective(ShareComment record);

    /**
     * This method corresponds to the database table share_comment
     * @mbg.generated
     */
    List<ShareComment> selectByExample(ShareCommentQuery example);

    /**
     * This method corresponds to the database table share_comment
     * @mbg.generated
     */
    ShareComment selectByPrimaryKey(Long id);

    /**
     * This method corresponds to the database table share_comment
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") ShareComment record, @Param("example") ShareCommentQuery example);

    /**
     * This method corresponds to the database table share_comment
     * @mbg.generated
     */
    int updateByExample(@Param("record") ShareComment record, @Param("example") ShareCommentQuery example);

    /**
     * This method corresponds to the database table share_comment
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(ShareComment record);

    /**
     * This method corresponds to the database table share_comment
     * @mbg.generated
     */
    int updateByPrimaryKey(ShareComment record);
}
