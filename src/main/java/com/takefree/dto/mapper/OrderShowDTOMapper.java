package com.takefree.dto.mapper;

import com.takefree.dto.model.OrderShowDTO;
import com.takefree.pojo.query.OrderShowQuery;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by gaoxiang on 2017/11/7.
 */
@Repository
@Mapper
public interface OrderShowDTOMapper {
    public OrderShowDTO selectShowDTOById(Long id);

    public List<OrderShowDTO> selectShowDTOsByExample(OrderShowQuery orderShowQuery);
}
