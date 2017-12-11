package com.takefree.service;

import com.takefree.dto.model.ShareLikeDTO;
import com.takefree.pojo.model.Logistics;
import com.takefree.pojo.model.ShareLike;

import java.util.List;

/**
 * Created by gaoxiang on 2017/11/7.
 */
public interface LogisticsService {
    Logistics create(Logistics logistics);

    int deleteById(Long id);

    int updateById(Logistics logistics);

    Logistics getById(Long id);

    List<Logistics> getByOrderId(Long id);

}
