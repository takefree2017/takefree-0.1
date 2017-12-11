package com.takefree.dto.mapper;

import com.takefree.dto.model.TakeApplicationDTO;
import com.takefree.pojo.query.TakeApplicationQuery;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by gaoxiang on 2017/11/7.
 */
@Repository
@Mapper
public interface TakeApplicationDTOMapper {
    List<TakeApplicationDTO> selectByExample(TakeApplicationQuery takeApplicationQuery);

    TakeApplicationDTO selectByPrimaryKey(Long id);
}
