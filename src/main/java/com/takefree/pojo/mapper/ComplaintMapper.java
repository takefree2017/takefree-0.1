package com.takefree.pojo.mapper;

import com.takefree.pojo.model.Complaint;
import com.takefree.pojo.query.ComplaintQuery;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

;

@Mapper
@Repository
public interface ComplaintMapper {
    /**
     * This method corresponds to the database table complaint
     * @mbg.generated
     */
    long countByExample(ComplaintQuery example);

    /**
     * This method corresponds to the database table complaint
     * @mbg.generated
     */
    int deleteByExample(ComplaintQuery example);

    /**
     * This method corresponds to the database table complaint
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method corresponds to the database table complaint
     * @mbg.generated
     */
    int insert(Complaint record);

    /**
     * This method corresponds to the database table complaint
     * @mbg.generated
     */
    int insertSelective(Complaint record);

    /**
     * This method corresponds to the database table complaint
     * @mbg.generated
     */
    List<Complaint> selectByExample(ComplaintQuery example);

    /**
     * This method corresponds to the database table complaint
     * @mbg.generated
     */
    Complaint selectByPrimaryKey(Long id);

    /**
     * This method corresponds to the database table complaint
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Complaint record, @Param("example") ComplaintQuery example);

    /**
     * This method corresponds to the database table complaint
     * @mbg.generated
     */
    int updateByExample(@Param("record") Complaint record, @Param("example") ComplaintQuery example);

    /**
     * This method corresponds to the database table complaint
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Complaint record);

    /**
     * This method corresponds to the database table complaint
     * @mbg.generated
     */
    int updateByPrimaryKey(Complaint record);
}
