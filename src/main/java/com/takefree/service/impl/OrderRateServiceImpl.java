package com.takefree.service.impl;

import com.takefree.enums.OrderRateEnum;
import com.takefree.pojo.mapper.OrderRateMapper;
import com.takefree.pojo.mapper.TakeOrderMapper;
import com.takefree.pojo.model.OrderRate;
import com.takefree.pojo.model.TakeOrder;
import com.takefree.pojo.query.OrderRateQuery;
import com.takefree.service.OrderRateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by gaoxiang on 2017/12/11.
 */
@Service
public class OrderRateServiceImpl implements OrderRateService {
    @Autowired
    private OrderRateMapper orderRateMapper;

    @Autowired
    private TakeOrderMapper takeOrderMapper;

    @Override
    @Transactional
    public OrderRate create(OrderRate orderRate) {
        int row=orderRateMapper.insertSelective(orderRate);
        if(row>0){
            TakeOrder takeOrder=new TakeOrder();
            takeOrder.setRateStatus(OrderRateEnum.YES.getCode());
            takeOrder.setId(orderRate.getOrderId());
            takeOrderMapper.updateByPrimaryKeySelective(takeOrder);
        }
        return orderRate;
    }

    @Override
    @Transactional
    public int deleteById(Long id) {
        OrderRate orderRate=orderRateMapper.selectByPrimaryKey(id);
        if(orderRate==null){
            return 0;
        }
        int row=orderRateMapper.deleteByPrimaryKey(id);
        if(row>0){
            TakeOrder takeOrder=new TakeOrder();
            takeOrder.setRateStatus(OrderRateEnum.NO.getCode());
            takeOrder.setId(orderRate.getOrderId());
            takeOrderMapper.updateByPrimaryKeySelective(takeOrder);
        }
        return row;
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
