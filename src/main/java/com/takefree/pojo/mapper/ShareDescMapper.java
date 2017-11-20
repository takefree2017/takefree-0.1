package com.takefree.pojo.mapper;

import com.takefree.pojo.model.ShareDesc;
import com.takefree.pojo.query.ShareDescQuery;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ShareDescMapper {
    /**
     * This method corresponds to the database table share_desc
     * @mbg.generated
     */
    long countByExample(ShareDescQuery example);

    /**
     * This method corresponds to the database table share_desc
     * @mbg.generated
     */
    int deleteByExample(ShareDescQuery example);

    /**
     * This method corresponds to the database table share_desc
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long shareId);

    /**
     * This method corresponds to the database table share_desc
     * @mbg.generated
     */
    int insert(ShareDesc record);

    /**
     * This method corresponds to the database table share_desc
     * @mbg.generated
     */
    int insertSelective(ShareDesc record);

    /**
     * This method corresponds to the database table share_desc
     * @mbg.generated
     */
    List<ShareDesc> selectByExampleWithBLOBs(ShareDescQuery example);

    /**
     * This method corresponds to the database table share_desc
     * @mbg.generated
     */
    List<ShareDesc> selectByExample(ShareDescQuery example);

    /**
     * This method corresponds to the database table share_desc
     * @mbg.generated
     */
    ShareDesc selectByPrimaryKey(Long shareId);

    /**
     * This method corresponds to the database table share_desc
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") ShareDesc record, @Param("example") ShareDescQuery example);

    /**
     * This method corresponds to the database table share_desc
     * @mbg.generated
     */
    int updateByExampleWithBLOBs(@Param("record") ShareDesc record, @Param("example") ShareDescQuery example);

    /**
     * This method corresponds to the database table share_desc
     * @mbg.generated
     */
    int updateByExample(@Param("record") ShareDesc record, @Param("example") ShareDescQuery example);

    /**
     * This method corresponds to the database table share_desc
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(ShareDesc record);

    /**
     * This method corresponds to the database table share_desc
     * @mbg.generated
     */
    int updateByPrimaryKeyWithBLOBs(ShareDesc record);

    /**
     * This method corresponds to the database table share_desc
     * @mbg.generated
     */
    int updateByPrimaryKey(ShareDesc record);
}
