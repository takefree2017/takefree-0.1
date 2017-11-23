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
import com.takefree.service.ShareService;
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

    @Override
    @Transactional
    public ShareDTO create(ShareDTO shareDTO) {
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
        shareLbsMapper.insertSelective(shareLbs);

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

        return shareDTO;
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
    public ShareDTO updateById(ShareDTO shareDTO) {
        Share shareInfo = new Share();
        BeanUtils.copyPropertiesIgnoreNull(shareDTO, shareInfo);
        shareMapper.updateByPrimaryKeySelective(shareInfo);

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

        return shareDTO;
    }

    @Override
    @Transactional
    public boolean deleteById(Long id) {
        Share share = new Share();
        share.setId(id);
        share.setStatus(ShareStatusEnum.DELETE.getCode());
        shareMapper.updateByPrimaryKeySelective(share);
        return true;
    }

    @Override
    public List<ShareDTO> getShareInfoList(Integer page,Integer size,Long maxId,Long ownerId,Long takerId,Integer status) {
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
        if (takerId != null) {
            criteria.andTakerIdEqualTo(takerId);
        }
        if (status != null) {
            criteria.andStatusEqualTo(status);
        }
        if (maxId != null) {
            criteria.andIdLessThan(maxId);
        }

        shareDTOQuery.setOrderByClause("share.id desc");

        return shareDTOMapper.selectShareInfoListByExample(shareDTOQuery);
    }

    @Override
    public List<ShareDTO> getLikeShareInfoList(Integer page,Integer size,Long userId,Long ownerId,Integer status){
        ShareDTOQuery shareDTOQuery = new ShareDTOQuery();
        if (page != null && size != null) {
            shareDTOQuery.page(page, size);
        }
        if (page == null && size != null) {
            shareDTOQuery.limit(size);
        }


        ShareDTOQuery.Criteria criteria = shareDTOQuery.createCriteria();
        criteria.andLikeUserEqualTo(userId);
        if (status != null) {
            criteria.andStatusEqualTo(status);
        }
        if (ownerId != null) {
            criteria.andOwnerIdEqualTo(ownerId);
        }

        shareDTOQuery.setOrderByClause("share_like.id desc");

        return shareDTOMapper.selectLikeShareInfoListByExample(shareDTOQuery);
    }

    @Override
    public List<ShareDTO> getApplyShareInfoList(Integer page,Integer size,Long userId,Long ownerId,Integer status){
        ShareDTOQuery shareDTOQuery = new ShareDTOQuery();
        if (page != null && size != null) {
            shareDTOQuery.page(page, size);
        }
        if (page == null && size != null) {
            shareDTOQuery.limit(size);
        }


        ShareDTOQuery.Criteria criteria = shareDTOQuery.createCriteria();
        criteria.andApplyUserEqualTo(userId);
        if (status != null) {
            criteria.andStatusEqualTo(status);
        }
        if (ownerId != null) {
            criteria.andOwnerIdEqualTo(ownerId);
        }

        shareDTOQuery.setOrderByClause("share_application.id desc");

        return shareDTOMapper.selectApplyShareInfoListByExample(shareDTOQuery);
    }

    @Override
    public List<ShareDTO> getReceivedShareInfoList(Integer page,Integer size,Long userId,Long ownerId){
        ShareDTOQuery shareDTOQuery = new ShareDTOQuery();
        if (page != null && size != null) {
            shareDTOQuery.page(page, size);
        }
        if (page == null && size != null) {
            shareDTOQuery.limit(size);
        }

        ShareDTOQuery.Criteria criteria = shareDTOQuery.createCriteria();
        criteria.andReceivedUserEqualTo(userId);

        if (ownerId != null) {
            criteria.andOwnerIdEqualTo(ownerId);
        }

        shareDTOQuery.setOrderByClause("share_order.id desc");

        return shareDTOMapper.selectReceivedShareInfoListByExample(shareDTOQuery);
    }

    @Override
    @Transactional
    public boolean updateViewInfo(ShareDTO shareDTO,Long userId){
        //发布人查看
        if(userId!=null&&shareDTO.getOwnerId()==userId){
            ShareCounter shareCouter=new ShareCounter();
            shareCouter.setShareId(shareDTO.getId());
            shareCouter.setNewApplyCount(0);
            shareCouter.setNewCommentCount(0);
            shareCounterMapper.updateByPrimaryKeySelective(shareCouter);
            return true;
        }else{ //其他人查看
            shareCounterMapper.addViewCount(shareDTO.getId(),1);
            return true;
        }
    }
}
