package com.takefree.service;

import com.takefree.common.entry.Token;
import com.takefree.dto.model.TakeOrderDTO;
import com.takefree.pojo.model.TakeOrder;
import com.takefree.vo.CreateOrderForm;

import java.util.List;

/**
 * Created by gaoxiang on 2017/11/7.
 */
public interface TakeOrderService {
    long createOrders(Token token, CreateOrderForm createOrderForm) throws Exception;

    long deleteById(Long id);

    long updateByIdSelected(Token token,TakeOrder takeOrder) throws Exception;

    TakeOrderDTO getById(Long id);

    List<TakeOrderDTO> getOrders(Integer page, Integer size, Long shareId, Long ownerId, Long applicantId, Integer orderStatus) throws Exception;
}
