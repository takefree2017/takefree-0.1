package com.takefree.pojo.mapper;

import com.takefree.pojo.model.ShowPic;
import com.takefree.pojo.query.ShowPicQuery;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ShowPicMapper {
    /**
     * This method corresponds to the database table show_pic
     * @mbg.generated
     */
    long countByExample(ShowPicQuery example);

    /**
     * This method corresponds to the database table show_pic
     * @mbg.generated
     */
    int deleteByExample(ShowPicQuery example);

    /**
     * This method corresponds to the database table show_pic
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method corresponds to the database table show_pic
     * @mbg.generated
     */
    int insert(ShowPic record);

    /**
     * This method corresponds to the database table show_pic
     * @mbg.generated
     */
    int insertSelective(ShowPic record);

    /**
     * This method corresponds to the database table show_pic
     * @mbg.generated
     */
    List<ShowPic> selectByExample(ShowPicQuery example);

    /**
     * This method corresponds to the database table show_pic
     * @mbg.generated
     */
    ShowPic selectByPrimaryKey(Long id);

    /**
     * This method corresponds to the database table show_pic
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") ShowPic record, @Param("example") ShowPicQuery example);

    /**
     * This method corresponds to the database table show_pic
     * @mbg.generated
     */
    int updateByExample(@Param("record") ShowPic record, @Param("example") ShowPicQuery example);

    /**
     * This method corresponds to the database table show_pic
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(ShowPic record);

    /**
     * This method corresponds to the database table show_pic
     * @mbg.generated
     */
    int updateByPrimaryKey(ShowPic record);
}
