package com.takefree.service.impl;

import com.takefree.dto.mapper.ShareDTOMapper;
import com.takefree.dto.mapper.TakeApplicationDTOMapper;
import com.takefree.dto.mapper.UserDTOMapper;
import com.takefree.dto.model.TakeApplicationDTO;
import com.takefree.dto.model.UserDTO;
import com.takefree.enums.ApplyStatusEnum;
import com.takefree.pojo.mapper.ShareCounterMapper;
import com.takefree.pojo.mapper.TakeApplicationMapper;
import com.takefree.pojo.model.TakeApplication;
import com.takefree.pojo.query.TakeApplicationQuery;
import com.takefree.service.TakeApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by gaoxiang on 2017/12/10.
 */
@Service
public class TakeApplicationServiceImpl implements TakeApplicationService {
    @Autowired
    private ShareDTOMapper shareDTOMapper;

    @Autowired
    private ShareCounterMapper shareCounterMapper;

    @Autowired
    private TakeApplicationMapper takeApplicationMapper;

    @Autowired
    private TakeApplicationDTOMapper takeApplicationDTOMapper;

    @Autowired
    private UserDTOMapper userDTOMapper;

    @Override
    public TakeApplication create(TakeApplication takeApplication) {
        takeApplicationMapper.insertSelective(takeApplication);
        shareCounterMapper.changeApplyCount(takeApplication.getShareId(),1);
        return takeApplication;
    }

    @Override
    public long deleteById(Long id) {
        int row=takeApplicationMapper.deleteByPrimaryKey(id);
        shareCounterMapper.changeApplyCount(id,-row);
        return row;
    }

    @Override
    public long updateById(TakeApplication takeApplication) {
        return takeApplicationMapper.updateByPrimaryKeySelective(takeApplication);
    }

    @Override
    public TakeApplicationDTO getById(Long id) {
        return takeApplicationDTOMapper.selectByPrimaryKey(id);
    }

    @Override
    public long getCount(Long shareId, Long applyUserId) {
        TakeApplicationQuery takeApplicationQuery=new TakeApplicationQuery();
        TakeApplicationQuery.Criteria criteria=takeApplicationQuery.createCriteria();
        criteria.andApplicantIdEqualTo(applyUserId);
        criteria.andShareIdEqualTo(shareId);
        return takeApplicationMapper.countByExample(takeApplicationQuery);
    }

    @Override
    public long updateAllReject(Long shareId) {
        TakeApplication takeApplication=new TakeApplication();
        takeApplication.setStatus(ApplyStatusEnum.REJECT.getCode());

        TakeApplicationQuery takeApplicationQuery=new TakeApplicationQuery();
        TakeApplicationQuery.Criteria criteria=takeApplicationQuery.createCriteria();
        criteria.andStatusNotEqualTo(ApplyStatusEnum.SUCCESS.getCode());
        criteria.andShareIdEqualTo(shareId);

        return takeApplicationMapper.updateByExampleSelective(takeApplication,takeApplicationQuery);
    }


    @Override
    public List<UserDTO> getShareApplyUsers(Integer page, Integer size, Long shareId, Integer applyStatus){
        TakeApplicationQuery takeApplicationQuery = new TakeApplicationQuery();
        if (page != null && size != null) {
            takeApplicationQuery.page(page, size);
        }
        if (page == null && size != null) {
            takeApplicationQuery.limit(size);
        }

        TakeApplicationQuery.Criteria criteria = takeApplicationQuery.createCriteria();
        criteria.andShareIdEqualTo(shareId);
        if (applyStatus != null) {
            criteria.andStatusEqualTo(applyStatus);
        }

        takeApplicationQuery.setOrderByClause("take_application.id desc");

        return userDTOMapper.selectShareApllyUsers(takeApplicationQuery);
    }

    @Override
    public List<TakeApplicationDTO> getApplys(Integer page, Integer size, Long shareId, Long ownerId, Long applicantId, Integer orderStatus) throws Exception{
        TakeApplicationQuery takeApplicationQuery=new TakeApplicationQuery();
        if (page != null && size != null) {
            takeApplicationQuery.page(page, size);
        }

        if (page == null && size != null) {
            takeApplicationQuery.limit(size);
        }

        TakeApplicationQuery.Criteria criteria = takeApplicationQuery.createCriteria();
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
        takeApplicationQuery.setOrderByClause("take_application.id desc");

        return takeApplicationDTOMapper.selectByExample(takeApplicationQuery);
    }
}
