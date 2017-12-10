package com.takefree.service.impl;

import com.takefree.dto.mapper.ShareDTOMapper;
import com.takefree.dto.mapper.UserDTOMapper;
import com.takefree.dto.model.ShareDTO;
import com.takefree.dto.model.UserDTO;
import com.takefree.dto.query.ShareDTOQuery;
import com.takefree.enums.ApplyStatusEnum;
import com.takefree.pojo.mapper.ShareCounterMapper;
import com.takefree.pojo.mapper.TakeApplicationMapper;
import com.takefree.pojo.model.TakeApplication;
import com.takefree.pojo.query.TakeApplicationQuery;
import com.takefree.service.ShareApplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by gaoxiang on 2017/12/10.
 */
@Service
public class ShareApplyServiceImpl implements ShareApplyService {
    @Autowired
    private ShareDTOMapper shareDTOMapper;

    @Autowired
    private ShareCounterMapper shareCounterMapper;

    @Autowired
    private TakeApplicationMapper takeApplicationMapper;

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
    public List<ShareDTO> getApplyShareInfos(Integer page, Integer size, Long applierId, Long ownerId, Integer applyStatus){
        TakeApplicationQuery takeApplicationQuery = new TakeApplicationQuery();
        if (page != null && size != null) {
            takeApplicationQuery.page(page, size);
        }
        if (page == null && size != null) {
            takeApplicationQuery.limit(size);
        }


        TakeApplicationQuery.Criteria criteria = takeApplicationQuery.createCriteria();
        criteria.andApplicantIdEqualTo(applierId);
        if (applyStatus != null) {
            criteria.andStatusEqualTo(applyStatus);
        }
        if (ownerId != null) {
            criteria.andOwnerIdEqualTo(ownerId);
        }

        takeApplicationQuery.setOrderByClause("take_application.id desc");

        return shareDTOMapper.selectApplyShareInfoListByExample(takeApplicationQuery);
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
}
