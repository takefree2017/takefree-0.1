package com.takefree.service.impl;

import com.takefree.pojo.mapper.OrderRateMapper;
import com.takefree.pojo.model.OrderRate;
import com.takefree.pojo.query.OrderRateQuery;
import com.takefree.service.OrderRateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by gaoxiang on 2017/12/11.
 */
@Service
public class OrderRateServiceImpl implements OrderRateService {
    @Autowired
    private OrderRateMapper orderRateMapper;

    @Override
    public OrderRate create(OrderRate orderRate) {
        orderRateMapper.insertSelective(orderRate);
        return orderRate;
    }

    @Override
    public int deleteById(Long id) {
        return orderRateMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int updateById(OrderRate orderRate) {
        return orderRateMapper.updateByPrimaryKeySelective(orderRate);
    }

    @Override
    public OrderRate getById(Long id) {
        return orderRateMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<OrderRate> getByOrderId(Long id) {
        OrderRateQuery orderRateQuery=new OrderRateQuery();
        OrderRateQuery.Criteria criteria=orderRateQuery.createCriteria();
        criteria.andOrderIdEqualTo(id);
        return orderRateMapper.selectByExample(orderRateQuery);
    }
}
