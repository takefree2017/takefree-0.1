package com.takefree.service.impl;

import com.takefree.common.Exception.SimpleHttpException;
import com.takefree.common.entry.Token;
import com.takefree.common.web.constant.HttpStatus;
import com.takefree.dto.mapper.TakeOrderDTOMapper;
import com.takefree.dto.model.ShareDTO;
import com.takefree.dto.model.TakeOrderDTO;
import com.takefree.enums.ApplyStatusEnum;
import com.takefree.enums.ShareStatusEnum;
import com.takefree.pojo.mapper.ShareCounterMapper;
import com.takefree.pojo.mapper.TakeApplicationMapper;
import com.takefree.pojo.mapper.TakeOrderMapper;
import com.takefree.pojo.model.TakeOrder;
import com.takefree.pojo.query.TakeApplicationQuery;
import com.takefree.pojo.query.TakeOrderQuery;
import com.takefree.service.TakeApplicationService;
import com.takefree.service.TakeOrderService;
import com.takefree.service.ShareService;
import com.takefree.vo.CreateOrderForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by gaoxiang on 2017/12/10.
 */
@Service
public class TakeOrderServiceImpl implements TakeOrderService {
    @Autowired
    private ShareService shareService;

    @Autowired
    private ShareCounterMapper shareCounterMapper;

    @Autowired
    private TakeApplicationService takeApplicationService;

    @Autowired
    private TakeApplicationMapper takeApplicationMapper;

    @Autowired
    private TakeOrderMapper takeOrderMapper;

    @Autowired
    private TakeOrderDTOMapper takeOrderDTOMapper;

    @Override
    @Transactional
    public long createOrders(Token token, CreateOrderForm createOrderForm) throws Exception{
        ShareDTO shareInfo=shareService.getShareInfoById(createOrderForm.getShareId());
        if(shareInfo==null){
            throw new SimpleHttpException(HttpStatus.BAD_REQUEST, "分享不存在");
        }

        if(!shareInfo.getOwnerId().equals(token.getUserDTO().getId())){
            throw new SimpleHttpException(HttpStatus.UNAUTHORIZED, "非本人分享");
        }

        if(shareInfo.getStatus() != ShareStatusEnum.PUBLISH.getCode()){
            throw new SimpleHttpException(HttpStatus.BAD_REQUEST, "分享非发布状态");
        }

        if((shareInfo.getNumber()-shareInfo.getTakeNumber()) < createOrderForm.getUsers().size()){
            throw new SimpleHttpException(HttpStatus.BAD_REQUEST, "超出分享数量");
        }

        TakeApplicationQuery takeApplicationQuery=new TakeApplicationQuery();
        TakeApplicationQuery.Criteria criteria=takeApplicationQuery.createCriteria();
        criteria.andApplicantIdIn(createOrderForm.getUsers());
        criteria.andShareIdEqualTo(createOrderForm.getShareId());

        long count=takeApplicationMapper.countByExample(takeApplicationQuery);
        if(count != createOrderForm.getUsers().size()){
            throw new SimpleHttpException(HttpStatus.BAD_REQUEST, "输入用户与申请不匹配");
        }

        takeOrderMapper.insertOrders(takeApplicationQuery);


        ShareDTO updateShare=new ShareDTO();
        updateShare.setId(createOrderForm.getShareId());
        updateShare.setStatus(ShareStatusEnum.FINISH.getCode());
        updateShare.setTakeNumber(shareInfo.getTakeNumber() + createOrderForm.getUsers().size());
        shareService.updateByIdSelective(updateShare);

        com.takefree.pojo.model.TakeApplication takeApplication=new com.takefree.pojo.model.TakeApplication();
        takeApplication.setStatus(ApplyStatusEnum.SUCCESS.getCode());
        takeApplicationMapper.updateByExampleSelective(takeApplication,takeApplicationQuery);

        this.takeApplicationService.updateAllReject(createOrderForm.getShareId());
        return count;
    }

    @Override
    public long deleteById(Long id) {
        int count=takeOrderMapper.deleteByPrimaryKey(id);
//        shareCounterMapper.changeTakeNumber(id,-count);
        return count;
    }

    @Override
    public long updateByIdSelected(Token token, TakeOrder takeOrder) throws Exception{
        //TODO...权限检查
        return takeOrderMapper.updateByPrimaryKeySelective(takeOrder);
    }

    @Override
    public TakeOrderDTO getById(Long id){
        return takeOrderDTOMapper.selectByPrimaryKey(id);
    }


    @Override
    public List<TakeOrderDTO> getOrders(Integer page, Integer size,Long shareId, Long ownerId, Long applicantId, Integer orderStatus) throws Exception{
        TakeOrderQuery takeOrderQuery=new TakeOrderQuery();
        if (page != null && size != null) {
            takeOrderQuery.page(page, size);
        }

        if (page == null && size != null) {
            takeOrderQuery.limit(size);
        }

        TakeOrderQuery.Criteria criteria = takeOrderQuery.createCriteria();
        if (shareId != null) {
            criteria.andShareIdEqualTo(shareId);
        }

        if (ownerId != null) {
            criteria.andOwnerIdEqualTo(ownerId);
        }

        if(applicantId!=null){
            criteria.andApplicantIdEqualTo(applicantId);
        }

        if (orderStatus != null) {
            criteria.andStatusEqualTo(orderStatus);
        }
        takeOrderQuery.setOrderByClause("take_order.id desc");

        return takeOrderDTOMapper.selectByExample(takeOrderQuery);
    }

}
