package com.takefree.service.impl;

import com.takefree.pojo.mapper.LogisticsMapper;
import com.takefree.pojo.model.Logistics;
import com.takefree.pojo.query.LogisticsQuery;
import com.takefree.service.LogisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by gaoxiang on 2017/12/11.
 */
@Service
public class LogisticsServiceImpl implements LogisticsService {
    @Autowired
    private LogisticsMapper logisticsMapper;

    @Override
    public Logistics create(Logistics logistics) {
        logisticsMapper.insertSelective(logistics);
        return logistics;
    }


    @Override
    public int updateById(Logistics logistics) {
        return logisticsMapper.updateByPrimaryKeySelective(logistics);
    }

    @Override
    public int deleteById(Long id) {
        return logisticsMapper.deleteByPrimaryKey(id);
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
