package com.takefree.service;

import com.takefree.dto.model.OrderShowDTO;
import com.takefree.pojo.model.OrderShow;

import java.util.List;

/**
 * Created by gaoxiang on 2017/11/7.
 */
public interface OrderShowService {
    OrderShowDTO create(OrderShowDTO orderShowDTO);

    OrderShow getShowInfoById(Long id);

    OrderShowDTO getShowDTOById(Long id);

    OrderShowDTO getShowDTODetailById(Long id);

    OrderShowDTO updateByIdSelective(OrderShowDTO orderShowDTO);

    int deleteById(Long id);

    List<OrderShowDTO> getShowDTOs(Integer page, Integer size, Long maxId,Long shareId, Long orderId, Long receiverId,Long giverId);

    boolean updateViewInfo(OrderShowDTO orderShowDTO, Long userId);

}
