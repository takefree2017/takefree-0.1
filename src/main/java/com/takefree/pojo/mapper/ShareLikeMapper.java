package com.takefree.pojo.mapper;

import com.takefree.pojo.model.ShareLike;
import com.takefree.pojo.query.ShareLikeQuery;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

;

@Mapper
@Repository
public interface ShareLikeMapper {
    /**
     * This method corresponds to the database table share_like
     * @mbg.generated
     */
    long countByExample(ShareLikeQuery example);

    /**
     * This method corresponds to the database table share_like
     * @mbg.generated
     */
    int deleteByExample(ShareLikeQuery example);

    /**
     * This method corresponds to the database table share_like
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method corresponds to the database table share_like
     * @mbg.generated
     */
    int insert(ShareLike record);

    /**
     * This method corresponds to the database table share_like
     * @mbg.generated
     */
    int insertSelective(ShareLike record);

    /**
     * This method corresponds to the database table share_like
     * @mbg.generated
     */
    List<ShareLike> selectByExample(ShareLikeQuery example);

    /**
     * This method corresponds to the database table share_like
     * @mbg.generated
     */
    ShareLike selectByPrimaryKey(Long id);

    /**
     * This method corresponds to the database table share_like
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") ShareLike record, @Param("example") ShareLikeQuery example);

    /**
     * This method corresponds to the database table share_like
     * @mbg.generated
     */
    int updateByExample(@Param("record") ShareLike record, @Param("example") ShareLikeQuery example);

    /**
     * This method corresponds to the database table share_like
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(ShareLike record);

    /**
     * This method corresponds to the database table share_like
     * @mbg.generated
     */
    int updateByPrimaryKey(ShareLike record);
}
