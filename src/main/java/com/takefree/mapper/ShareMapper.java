package com.takefree.mapper;

import com.takefree.model.Share;
import com.takefree.query.ShareQuery;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

;

@Mapper
@Repository
public interface ShareMapper {
    /**
     * This method corresponds to the database table share
     * @mbg.generated
     */
    long countByExample(ShareQuery example);

    /**
     * This method corresponds to the database table share
     * @mbg.generated
     */
    int deleteByExample(ShareQuery example);

    /**
     * This method corresponds to the database table share
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method corresponds to the database table share
     * @mbg.generated
     */
    int insert(Share record);

    /**
     * This method corresponds to the database table share
     * @mbg.generated
     */
    int insertSelective(Share record);

    /**
     * This method corresponds to the database table share
     * @mbg.generated
     */
    List<Share> selectByExample(ShareQuery example);

    /**
     * This method corresponds to the database table share
     * @mbg.generated
     */
    Share selectByPrimaryKey(Long id);

    /**
     * This method corresponds to the database table share
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Share record, @Param("example") ShareQuery example);

    /**
     * This method corresponds to the database table share
     * @mbg.generated
     */
    int updateByExample(@Param("record") Share record, @Param("example") ShareQuery example);

    /**
     * This method corresponds to the database table share
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Share record);

    /**
     * This method corresponds to the database table share
     * @mbg.generated
     */
    int updateByPrimaryKey(Share record);
}
