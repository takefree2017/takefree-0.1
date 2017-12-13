package com.takefree.service.impl;

import com.takefree.enums.LogisticsStatusEnum;
import com.takefree.pojo.mapper.LogisticsMapper;
import com.takefree.pojo.mapper.TakeOrderMapper;
import com.takefree.pojo.model.Logistics;
import com.takefree.pojo.model.TakeOrder;
import com.takefree.pojo.query.LogisticsQuery;
import com.takefree.service.LogisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by gaoxiang on 2017/12/11.
 */
@Service
public class LogisticsServiceImpl implements LogisticsService {
    @Autowired
    private LogisticsMapper logisticsMapper;

    @Autowired
    private TakeOrderMapper takeOrderMapper;

    @Override
    @Transactional
    public Logistics create(Logistics logistics) {
        int row=logisticsMapper.insertSelective(logistics);
        if(row>0){
            TakeOrder takeOrder=new TakeOrder();
            takeOrder.setRateStatus(LogisticsStatusEnum.YES.getCode());
            takeOrder.setId(logistics.getOrderId());
            takeOrderMapper.updateByPrimaryKeySelective(takeOrder);
        }
        return logistics;
    }


    @Override
    public int updateById(Logistics logistics) {
        return logisticsMapper.updateByPrimaryKeySelective(logistics);
    }

    @Override
    @Transactional
    public int deleteById(Long id) {
        Logistics logistics=logisticsMapper.selectByPrimaryKey(id);
        int row= logisticsMapper.deleteByPrimaryKey(id);
        if(row>0){
            TakeOrder takeOrder=new TakeOrder();
            takeOrder.setRateStatus(LogisticsStatusEnum.NO.getCode());
            takeOrder.setId(logistics.getOrderId());
            takeOrderMapper.updateByPrimaryKeySelective(takeOrder);
        }
        return row;
    }

    @Override
    public Logistics getById(Long id) {
        return logisticsMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Logistics> getByOrderId(Long orderId) {
        LogisticsQuery logisticsQuery=new LogisticsQuery();
        LogisticsQuery.Criteria criteria= logisticsQuery.createCriteria();
        criteria.andOrderIdEqualTo(orderId);
        return logisticsMapper.selectByExample(logisticsQuery);
    }
}
