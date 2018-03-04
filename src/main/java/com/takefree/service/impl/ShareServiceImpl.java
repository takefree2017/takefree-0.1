package com.takefree.service.impl;

import com.takefree.common.util.BeanUtils;
import com.takefree.dto.mapper.ShareDTOMapper;
import com.takefree.dto.model.ShareDTO;
import com.takefree.dto.query.ShareDTOQuery;
import com.takefree.enums.ShareStatusEnum;
import com.takefree.pojo.mapper.*;
import com.takefree.pojo.model.*;
import com.takefree.pojo.query.ShareCategoryQuery;
import com.takefree.pojo.query.SharePicQuery;
import com.takefree.pojo.query.TakeApplicationQuery;
import com.takefree.service.TakeApplicationService;
import com.takefree.service.ShareService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by gaoxiang on 2017/11/14.
 */
@Service
public class ShareServiceImpl implements ShareService {
    @Autowired
    private ShareDTOMapper shareDTOMapper;

    @Autowired
    private ShareMapper shareMapper;

    @Autowired
    private ShareCategoryMapper shareCategoryMapper;

    @Autowired
    private ShareDescMapper shareDescMapper;

    @Autowired
    private ShareLbsMapper shareLbsMapper;

    @Autowired
    private ShareCounterMapper shareCounterMapper;

    @Autowired
    private SharePicMapper sharePicMapper;

    @Autowired
    private TakeApplicationService applyService;

    @Override
    @Transactional
    public int create(ShareDTO shareDTO) {
        Share shareInfo = new Share();
        BeanUtils.copyPropertiesIgnoreNull(shareDTO, shareInfo);
        shareMapper.insertSelective(shareInfo);
        shareDTO.setId(shareInfo.getId());

        ShareDesc shareDesc = new ShareDesc();
        shareDesc.setShareId(shareDTO.getId());
        BeanUtils.copyPropertiesIgnoreNull(shareDTO, shareDesc);
        shareDescMapper.insertSelective(shareDesc);

        ShareCounter shareCounter = new ShareCounter();
        shareCounter.setShareId(shareDTO.getId());
        BeanUtils.copyPropertiesIgnoreNull(shareDTO, shareCounter);
        shareCounterMapper.insertSelective(shareCounter);

        ShareLbs shareLbs = new ShareLbs();
        shareLbs.setShareId(shareDTO.getId());
        BeanUtils.copyPropertiesIgnoreNull(shareDTO, shareLbs);
        int row=shareLbsMapper.insertSelective(shareLbs);

        //可以优化
        if(shareDTO.getCategories()!=null) {
            for(ShareCategory shareCategory:shareDTO.getCategories()) {
                shareCategory.setShareId(shareDTO.getId());
                shareCategoryMapper.insert(shareCategory);
            }
        }

        //可以优化
        if(shareDTO.getSharePics()!=null) {
            for(SharePic sharePic:shareDTO.getSharePics()) {
                sharePic.setShareId(shareDTO.getId());
                sharePicMapper.insert(sharePic);
            }
        }

        return row;
    }

    @Override
    public ShareDTO getShareInfoById(Long id) {
        return shareDTOMapper.selectShareInfoById(id);
    }

    @Override
    public ShareDTO getShareDetailById(Long id) {
        ShareDTO shareDTO = shareDTOMapper.selectShareDetailById(id);
        if (shareDTO == null) {
            return null;
        }

        ShareCategoryQuery shareCategoryQuery = new ShareCategoryQuery();
        shareCategoryQuery.createCriteria().andShareIdEqualTo(id);
        List<ShareCategory> shareCategorys = shareCategoryMapper.selectByExample(shareCategoryQuery);
            shareDTO.setCategories(shareCategorys);

        SharePicQuery sharePicQuery = new SharePicQuery();
        sharePicQuery.createCriteria().andShareIdEqualTo(id);
        sharePicQuery.setOrderByClause("sequence");
        List<SharePic> sharePics = sharePicMapper.selectByExample(sharePicQuery);
        shareDTO.setSharePics(sharePics);

        return shareDTO;
    }

    @Override
    @Transactional
    public int updateByIdSelective(ShareDTO shareDTO) {
        Share shareInfo = new Share();
        BeanUtils.copyPropertiesIgnoreNull(shareDTO, shareInfo);
        if(BeanUtils.getNotNullPropertyNames(shareInfo).length>2) {
            shareMapper.updateByPrimaryKeySelective(shareInfo);
        }

        ShareDesc shareDesc = new ShareDesc();
        shareDesc.setShareId(shareDTO.getId());
        BeanUtils.copyPropertiesIgnoreNull(shareDTO, shareDesc);
        if(BeanUtils.getNotNullPropertyNames(shareDesc).length>2) {
            shareDescMapper.updateByPrimaryKeySelective(shareDesc);
        }

        ShareCounter shareCounter = new ShareCounter();
        shareCounter.setShareId(shareDTO.getId());
        BeanUtils.copyPropertiesIgnoreNull(shareDTO, shareCounter);
        if(BeanUtils.getNotNullPropertyNames(shareCounter).length>2) {
            shareCounterMapper.updateByPrimaryKeySelective(shareCounter);
        }

        ShareLbs shareLbs = new ShareLbs();
        shareLbs.setShareId(shareDTO.getId());
        BeanUtils.copyPropertiesIgnoreNull(shareDTO, shareLbs);
        String[] notnull=BeanUtils.getNotNullPropertyNames(shareLbs);
        if(BeanUtils.getNotNullPropertyNames(shareLbs).length>2) {
            shareLbsMapper.updateByPrimaryKeySelective(shareLbs);
        }

        //可以优化
        ShareCategoryQuery shareCategoryQuery = new ShareCategoryQuery();
        shareCategoryQuery.createCriteria().andShareIdEqualTo(shareDTO.getId());
        shareCategoryMapper.deleteByExample(shareCategoryQuery);
        if(shareDTO.getCategories()!=null) {
            for(ShareCategory shareCategory:shareDTO.getCategories()) {
                shareCategory.setShareId(shareDTO.getId());
                shareCategoryMapper.insert(shareCategory);
            }
        }

        //可以优化
        SharePicQuery sharePicQuery = new SharePicQuery();
        sharePicQuery.createCriteria().andShareIdEqualTo(shareDTO.getId());
        sharePicMapper.deleteByExample(sharePicQuery);
        if(shareDTO.getSharePics()!=null) {
            for(SharePic sharePic:shareDTO.getSharePics()) {
                sharePic.setShareId(shareDTO.getId());
                sharePicMapper.insert(sharePic);
            }
        }

        return 1;
    }

    @Override
    @Transactional
    public int deleteById(Long id) {
        Share share = new Share();
        share.setId(id);
        share.setStatus(ShareStatusEnum.DELETE.getCode());
        int row=shareMapper.updateByPrimaryKeySelective(share);

        applyService.updateAllReject(id);
        return row;
    }

    @Override
    public List<ShareDTO> getShareInfos(Integer page,Integer size,Long maxId,Long ownerId,Integer status,Integer shareModeId) {
        ShareDTOQuery shareDTOQuery = new ShareDTOQuery();
        if (page != null && size != null) {
            shareDTOQuery.page(page, size);
        }

        if (page == null && size != null) {
            shareDTOQuery.limit(size);
        }

        ShareDTOQuery.Criteria criteria = shareDTOQuery.createCriteria();
        if (ownerId != null) {
            criteria.andOwnerIdEqualTo(ownerId);
        }

        if (status != null) {
            criteria.andStatusEqualTo(status);
        }
        if (maxId != null) {
            criteria.andIdLessThan(maxId);
        }
        if (shareModeId != null) {
            criteria.andShareModeIdEqualTo(shareModeId);
        }

        shareDTOQuery.setOrderByClause("share.id desc");

        return shareDTOMapper.selectShareInfoListByExample(shareDTOQuery);
    }

    @Override
    public List<ShareDTO> searchShareInfos(Integer page,Integer size,Long maxId,Long ownerId,Integer status,Integer shareModeId,String word) {
        ShareDTOQuery shareDTOQuery = new ShareDTOQuery();
        if (page != null && size != null) {
            shareDTOQuery.page(page, size);
        }

        if (page == null && size != null) {
            shareDTOQuery.limit(size);
        }

        ShareDTOQuery.Criteria criteria = shareDTOQuery.createCriteria();
        if (ownerId != null) {
            criteria.andOwnerIdEqualTo(ownerId);
        }

        if (status != null) {
            criteria.andStatusEqualTo(status);
        }
        if (maxId != null) {
            criteria.andIdLessThan(maxId);
        }
        if (shareModeId != null) {
            criteria.andShareModeIdEqualTo(shareModeId);
        }
        if(StringUtils.isNotEmpty(word) ){
            String trimWord=word.trim();
            if(StringUtils.isNotEmpty(trimWord)){
                criteria.andTitleMatch(trimWord);
            }
        }

        shareDTOQuery.setOrderByClause("share.id desc");

        return shareDTOMapper.selectShareInfoListByExample(shareDTOQuery);
    }

    @Override
    public List<ShareDTO> getReceivedShareInfos(Integer page,Integer size,Long reveiverId,Long ownerId){
        ShareDTOQuery shareDTOQuery = new ShareDTOQuery();
        if (page != null && size != null) {
            shareDTOQuery.page(page, size);
        }
        if (page == null && size != null) {
            shareDTOQuery.limit(size);
        }

        ShareDTOQuery.Criteria criteria = shareDTOQuery.createCriteria();
        //TODO...
        criteria.andReceivedUserEqualTo(reveiverId);

        if (ownerId != null) {
            criteria.andOwnerIdEqualTo(ownerId);
        }

        shareDTOQuery.setOrderByClause("take_order.id desc");

        return shareDTOMapper.selectReceivedShareInfoListByExample(shareDTOQuery);
    }

    @Override
    @Transactional
    public boolean updateViewInfo(ShareDTO shareDTO,Long userId){
        //发布人查看
        if(userId!=null&&shareDTO.getOwnerId().equals(userId)){
            ShareCounter shareCouter=new ShareCounter();
            shareCouter.setShareId(shareDTO.getId());
            shareCouter.setNewApplyCount(0);
            shareCouter.setNewCommentCount(0);
            shareCounterMapper.updateByPrimaryKeySelective(shareCouter);
            return true;
        }else{ //其他人查看
            shareCounterMapper.changeViewCount(shareDTO.getId(),1);
            return true;
        }
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
    public List<ShareDTO> getUserLikeShareInfos(Integer page, Integer size, Long userId, Long ownerId, Integer shareStatus){
        ShareDTOQuery shareDTOQuery = new ShareDTOQuery();
        if (page != null && size != null) {
            shareDTOQuery.page(page, size);
        }
        if (page == null && size != null) {
            shareDTOQuery.limit(size);
        }


        ShareDTOQuery.Criteria criteria = shareDTOQuery.createCriteria();
        criteria.andLikeUserEqualTo(userId);
        if (shareStatus != null) {
            criteria.andStatusEqualTo(shareStatus);
        }
        if (ownerId != null) {
            criteria.andOwnerIdEqualTo(ownerId);
        }

        shareDTOQuery.setOrderByClause("share_like.id desc");

        return shareDTOMapper.selectLikeShareInfoListByExample(shareDTOQuery);
    }

}
