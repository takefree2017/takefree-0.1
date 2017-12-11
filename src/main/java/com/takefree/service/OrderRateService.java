package com.takefree.service;

import com.takefree.pojo.model.OrderRate;

import java.util.List;

/**
 * Created by gaoxiang on 2017/11/7.
 */
public interface OrderRateService {
    OrderRate create(OrderRate orderRate);

    int deleteById(Long id);

    int updateById(OrderRate orderRate);

    OrderRate getById(Long id);

    List<OrderRate> getByOrderId(Long id);

}
