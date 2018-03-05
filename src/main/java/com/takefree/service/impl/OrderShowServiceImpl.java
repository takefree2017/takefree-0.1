package com.takefree.service.impl;

import com.takefree.common.util.BeanUtils;
import com.takefree.dto.mapper.OrderShowDTOMapper;
import com.takefree.dto.model.OrderShowDTO;
import com.takefree.enums.ShowStatusEnum;
import com.takefree.pojo.mapper.*;
import com.takefree.pojo.model.*;
import com.takefree.pojo.query.OrderShowQuery;
import com.takefree.pojo.query.ShowPicQuery;
import com.takefree.service.OrderShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by gaoxiang on 2017/12/11.
 */
@Service
public class OrderShowServiceImpl implements OrderShowService {

    @Autowired
    private OrderShowDTOMapper orderShowDTOMapper;

    @Autowired
    private OrderShowMapper orderShowMapper;

    @Autowired
    private OrderShowContentMapper orderShowContentMapper;

    @Autowired
    private ShowCounterMapper showCounterMapper;

    @Autowired
    private ShowPicMapper showPicMapper;

    @Autowired
    private TakeOrderMapper takeOrderMapper;

    @Override
    @Transactional
    public OrderShowDTO create(OrderShowDTO orderShowDTO) {
        OrderShow orderShow = new OrderShow();
        BeanUtils.copyPropertiesIgnoreNull(orderShowDTO, orderShow);
        int row = orderShowMapper.insertSelective(orderShow);
        if (row > 0) {
            TakeOrder takeOrder = new TakeOrder();
            takeOrder.setShowStatus(ShowStatusEnum.YES.getCode());
            takeOrder.setId(orderShowDTO.getOrderId());
            takeOrderMapper.updateByPrimaryKeySelective(takeOrder);
        }

        OrderShowContent orderShowContent = new OrderShowContent();
        orderShowContent.setOrderShowId(orderShow.getId());
        BeanUtils.copyPropertiesIgnoreNull(orderShowDTO, orderShowContent);
        orderShowContentMapper.insertSelective(orderShowContent);

        ShowCounter showCounter = new ShowCounter();
        showCounter.setShowId(orderShow.getId());
        showCounterMapper.insertSelective(showCounter);

        /**
         * TODO...优化
         */
        if (orderShowDTO.getShowPics() != null) {
            for (ShowPic showPic : orderShowDTO.getShowPics()) {
                showPic.setShowId(orderShow.getId());
                showPicMapper.insertSelective(showPic);
            }
        }

        orderShowDTO.setId(orderShow.getId());
        return orderShowDTO;
    }

    @Override
    public OrderShow getShowInfoById(Long id) {
        return orderShowMapper.selectByPrimaryKey(id);
    }

    @Override
    public OrderShowDTO getShowDTOById(Long id) {
        return orderShowDTOMapper.selectShowDTOById(id);
    }

    @Override
    public OrderShowDTO getShowDTODetailById(Long id) {
        OrderShowDTO orderShowDTO = orderShowDTOMapper.selectShowDTOById(id);
        if (orderShowDTO == null) {
            return null;
        }

        ShowPicQuery showPicQuery = new ShowPicQuery();
        ShowPicQuery.Criteria criteria = showPicQuery.createCriteria();
        criteria.andShowIdEqualTo(id);
        showPicQuery.setOrderByClause("sequence");
        orderShowDTO.setShowPics(showPicMapper.selectByExample(showPicQuery));

        return orderShowDTO;
    }

    @Override
    @Transactional
    public OrderShowDTO updateByIdSelective(OrderShowDTO orderShowDTO) {
        OrderShow orderShow = new OrderShow();
        orderShow.setId(orderShowDTO.getId());
        BeanUtils.copyPropertiesIgnoreNull(orderShowDTO, orderShowDTO);
        if (BeanUtils.getNotNullPropertyNames(orderShow).length > 2) {
            orderShowMapper.updateByPrimaryKeySelective(orderShow);
        }

        OrderShowContent orderShowContent = new OrderShowContent();
        orderShowContent.setOrderShowId(orderShowDTO.getId());
        BeanUtils.copyPropertiesIgnoreNull(orderShowDTO, orderShowContent);
        if (BeanUtils.getNotNullPropertyNames(orderShowContent).length > 2) {
            orderShowContentMapper.updateByPrimaryKeySelective(orderShowContent);
        }

        ShowCounter showCounter = new ShowCounter();
        showCounter.setShowId(orderShowDTO.getId());
        BeanUtils.copyPropertiesIgnoreNull(orderShowDTO, showCounter);
        if (BeanUtils.getNotNullPropertyNames(showCounter).length > 2) {
            showCounterMapper.updateByPrimaryKeySelective(showCounter);
        }

        //可以优化
        ShowPicQuery showPicQuery = new ShowPicQuery();
        showPicQuery.createCriteria().andShowIdEqualTo(orderShowDTO.getId());
        showPicMapper.deleteByExample(showPicQuery);
        if (orderShowDTO.getShowPics() != null) {
            for (ShowPic showPic : orderShowDTO.getShowPics()) {
                showPic.setShowId(orderShowDTO.getId());
                showPicMapper.insertSelective(showPic);
            }
        }
        return orderShowDTO;
    }

    @Override
    @Transactional
    public int deleteById(Long id) {
        /**
         * TODO...物理删除修改为逻辑删除，需要加字段
         */
        OrderShow orderShow=orderShowMapper.selectByPrimaryKey(id);
        int row = orderShowMapper.deleteByPrimaryKey(id);
        if (row > 0) {
            TakeOrder takeOrder = new TakeOrder();
            takeOrder.setRateStatus(ShowStatusEnum.NO.getCode());
            takeOrder.setId(orderShow.getOrderId());
            takeOrderMapper.updateByPrimaryKeySelective(takeOrder);
        }
        return row;

//        orderShowContentMapper.deleteByExample();
//        showCounterMapper.deleteByExample();
//        showPicMapper.deleteByExample();
    }

    @Override
    public List<OrderShowDTO> getShowDTOs(Integer page, Integer size, Long maxId, Long shareId, Long orderId,
                                          Long receiverId, Long giverId) {
        OrderShowQuery orderShowQuery = new OrderShowQuery();
        OrderShowQuery.Criteria criteria = orderShowQuery.createCriteria();
        if (page != null && size != null) {
            orderShowQuery.page(page, size);
        }

        if (page == null && size != null) {
            orderShowQuery.limit(size);
        }

        if (maxId != null) {
            criteria.andIdLessThan(maxId);
        }

        if (shareId != null) {
            criteria.andShareIdEqualTo(shareId);
        }

        if (orderId != null) {
            criteria.andOrderIdEqualTo(orderId);
        }

        if (receiverId != null) {
            criteria.andReceiverIdEqualTo(receiverId);
        }

        if (giverId != null) {
            criteria.andGiverIdEqualTo(giverId);
        }

        orderShowQuery.setOrderByClause("order_show.id desc");

        return orderShowDTOMapper.selectShowDTOsByExample(orderShowQuery);
    }

    @Override
    public boolean updateViewInfo(OrderShowDTO orderShowDTO, Long userId) {
        //发布人查看
        if (userId != null && orderShowDTO.getGiverId() .equals(userId)) {
//            ShowCounter showCounter=new ShowCounter();
//            showCounter.setShowId(orderShowDTO.getId());
//            showCounter.setNewApplyCount(0);
//            showCounter.setNewCommentCount(0);
//            showCounterMapper.updateByPrimaryKeySelective(showCounter);
            return true;
        } else { //其他人查看
            showCounterMapper.changeViewCount(orderShowDTO.getId(), 1);
            return true;
        }
    }
}
