package com.takefree.dto.mapper;

import com.takefree.dto.model.ShareLikeDTO;
import com.takefree.pojo.query.ShareLikeQuery;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by gaoxiang on 2017/11/7.
 */
@Repository
@Mapper
public interface ShareLikeDTOMapper {
    List<ShareLikeDTO> selectByExample(ShareLikeQuery shareLikeQuery);

    ShareLikeDTO selectByPrimaryKey(Long id);
}
