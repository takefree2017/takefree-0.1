package com.takefree.dto.mapper;

import com.takefree.dto.model.ShowLikeDTO;
import com.takefree.pojo.query.ShowLikeQuery;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by gaoxiang on 2017/11/7.
 */
@Repository
@Mapper
public interface ShowLikeDTOMapper {
    List<ShowLikeDTO> selectByExample(ShowLikeQuery showLikeQuery);

//    ShowLikeDTO selectByPrimaryKey(Long id);
}
