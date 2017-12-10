package com.takefree.service;


import com.takefree.common.entry.Token;
import com.takefree.dto.model.TakeOrderDTO;
import com.takefree.pojo.model.TakeOrder;
import com.takefree.vo.CreateOrderForm;

import java.util.List;

/**
 * Created by gaoxiang on 2017/11/7.
 */
public interface ShareOrderService {
    long createOrders(Token token, CreateOrderForm createOrderForm) throws Exception;

    long deleteById(Long id);

    long updateByIdSelected(Token token,TakeOrder takeOrder) throws Exception;

    List<TakeOrderDTO> getOrders(Integer page, Integer size, Long shareId, Long ownerId, Long applicantId, Integer orderStatus) throws Exception;
}
