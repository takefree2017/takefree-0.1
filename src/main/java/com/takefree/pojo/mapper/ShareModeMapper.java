package com.takefree.pojo.mapper;

import com.takefree.pojo.model.ShareMode;
import com.takefree.pojo.query.ShareModeQuery;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

;

@Mapper
@Repository
public interface ShareModeMapper {
    /**
     * This method corresponds to the database table share_mode
     * @mbg.generated
     */
    long countByExample(ShareModeQuery example);

    /**
     * This method corresponds to the database table share_mode
     * @mbg.generated
     */
    int deleteByExample(ShareModeQuery example);

    /**
     * This method corresponds to the database table share_mode
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method corresponds to the database table share_mode
     * @mbg.generated
     */
    int insert(ShareMode record);

    /**
     * This method corresponds to the database table share_mode
     * @mbg.generated
     */
    int insertSelective(ShareMode record);

    /**
     * This method corresponds to the database table share_mode
     * @mbg.generated
     */
    List<ShareMode> selectByExample(ShareModeQuery example);

    /**
     * This method corresponds to the database table share_mode
     * @mbg.generated
     */
    ShareMode selectByPrimaryKey(Integer id);

    /**
     * This method corresponds to the database table share_mode
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") ShareMode record, @Param("example") ShareModeQuery example);

    /**
     * This method corresponds to the database table share_mode
     * @mbg.generated
     */
    int updateByExample(@Param("record") ShareMode record, @Param("example") ShareModeQuery example);

    /**
     * This method corresponds to the database table share_mode
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(ShareMode record);

    /**
     * This method corresponds to the database table share_mode
     * @mbg.generated
     */
    int updateByPrimaryKey(ShareMode record);
}
