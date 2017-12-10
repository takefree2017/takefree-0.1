package com.takefree.dto.mapper;

import com.takefree.dto.model.TakeOrderDTO;
import com.takefree.pojo.query.TakeOrderQuery;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by gaoxiang on 2017/11/7.
 */
@Repository
@Mapper
public interface TakeOrderDTOMapper {
    List<TakeOrderDTO> selectByExample(TakeOrderQuery takeOrderQuery);

    TakeOrderDTO selectByPrimaryKey(Long id);
}
