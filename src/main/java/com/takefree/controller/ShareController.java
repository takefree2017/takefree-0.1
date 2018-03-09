package com.takefree.controller;

import com.takefree.common.Exception.SimpleHttpException;
import com.takefree.common.annotation.Authorization;
import com.takefree.common.config.Constants;
import com.takefree.common.entry.JsonObjectList;
import com.takefree.common.entry.JsonSimpleObject;
import com.takefree.common.entry.Token;
import com.takefree.common.util.JsonObjectUtils;
import com.takefree.common.web.constant.HttpStatus;
import com.takefree.dto.model.ShareDTO;
import com.takefree.dto.model.TakeOrderDTO;
import com.takefree.enums.ShareStatusEnum;
import com.takefree.service.ShareLikeService;
import com.takefree.service.ShareService;
import com.takefree.service.TakeApplicationService;
import com.takefree.service.TakeOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Date;
import java.util.List;

/**
 * Created by gaoxiang on 2017/11/4.
 */
@Controller
@RequestMapping
public class ShareController {

    @Autowired
    private ShareService shareService;

    @Autowired
    private TakeOrderService takeOrderService;

    @Autowired
    private ShareLikeService shareLikeService;

    @Autowired
    private TakeApplicationService takeApplicationService;

    /**
     * 新建
     */
    @RequestMapping(value = "/share", method = RequestMethod.POST)
    @ResponseBody
    @Authorization
    public JsonSimpleObject createShare(@RequestAttribute(Constants.TAKEFREE_TOKEN) Token token,
                                        @Valid @RequestBody ShareDTO shareDTO) throws Exception {
        if (shareDTO.getId() != null) {
            throw new SimpleHttpException(HttpStatus.BAD_REQUEST, "分享已经存在");
        }
        shareDTO.setOwnerId(token.getUserDTO().getId());
        shareService.create(shareDTO);
        return JsonObjectUtils.buildSimpleObjectSuccess(null);
    }

    /**
     * 更新
     */
    @RequestMapping(value = "/share/{id}", method = RequestMethod.PUT)
    @ResponseBody
    @Authorization
    public JsonSimpleObject updateShare(@RequestAttribute(Constants.TAKEFREE_TOKEN) Token token, @PathVariable Long id,
                                        @RequestBody ShareDTO shareDTO) throws Exception {
        ShareDTO oldShareDTO = shareService.getShareInfoById(id);
        if (oldShareDTO == null) {
            throw new SimpleHttpException(HttpStatus.NOT_FOUND, "分享不存在");
        }
        if (!oldShareDTO.getOwnerId().equals(token.getUserDTO().getId())) {
            throw new SimpleHttpException(HttpStatus.FORBIDDEN, "无权限");
        }

        shareDTO.setId(id);
        shareService.updateByIdSelective(shareDTO);
        return JsonObjectUtils.buildSimpleObjectSuccess(null);
    }

    /**
     * 发布
     *
     * @param token
     * @param shareDTO id不存在是新建，否则更新
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/share/publish", method = RequestMethod.POST)
    @ResponseBody
    @Authorization
    public JsonSimpleObject publishShare(@RequestAttribute(Constants.TAKEFREE_TOKEN) Token token,
                                         @Valid @RequestBody ShareDTO shareDTO) throws Exception {
        shareDTO.setStatus(ShareStatusEnum.PUBLISH.getCode());
        shareDTO.setPublishTime(new Date());
        if (shareDTO.getId() == null) { //不存在新建
            return createShare(token, shareDTO);
        } else {                     //存在则更新
            return updateShare(token, shareDTO.getId(), shareDTO);
        }
    }

    /**
     * 删除，非物理删除。status=40
     */
    @RequestMapping(value = "/share/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    @Authorization
    public JsonSimpleObject deleteShare(@RequestAttribute(Constants.TAKEFREE_TOKEN) Token token, @PathVariable Long id)
            throws Exception {
        ShareDTO shareDTO = shareService.getShareInfoById(id);
        if (shareDTO == null) {
            throw new SimpleHttpException(HttpStatus.NOT_FOUND, "分享不存在");
        }
        shareService.deleteById(id);
        return JsonObjectUtils.buildSimpleObjectSuccess(null);
    }

    /**
     * 获取详细信息
     *
     * @param id
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/share/{id}", method = RequestMethod.GET)
    @ResponseBody
    //@JsonView(ResultView.DetailView.class)
    public JsonSimpleObject<ShareDTO> getShare(
            @RequestAttribute(value = Constants.TAKEFREE_TOKEN, required = false) Token token, @PathVariable Long id)
            throws Exception {
        ShareDTO shareDTO = shareService.getShareDetailById(id);
        if (shareDTO == null) {
            throw new SimpleHttpException(HttpStatus.NOT_FOUND, "分享不存在");
        }

        Long userId = null;
        if (token != null) {
            userId = token.getUserDTO().getId();
        }

        shareService.updateViewInfo(shareDTO, userId);
        return JsonObjectUtils.buildSimpleObjectSuccess(shareDTO);
    }

    /**
     * 按发布人，状态筛选
     *
     * @param pageNo     可选
     * @param pageSize   可选
     * @param maxId      可选
     * @param status     可选
     * @param ownerId    可选
     * @param searchWord 搜索关键字
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/share", method = RequestMethod.GET)
    @ResponseBody
    //@JsonView(ResultView.BriefView.class)
    public JsonObjectList<ShareDTO> getShares(
            @RequestAttribute(value = Constants.TAKEFREE_TOKEN, required = false) Token token, Integer pageNo,
            Integer pageSize, Long maxId, Integer status, Long ownerId, Integer shareModeId, String searchWord)
            throws Exception {
        List<ShareDTO> shareDTOS = shareService.searchShareInfos(pageNo, pageSize, maxId, ownerId, status, shareModeId,
                                                                 searchWord);

        if (token != null) {
            for (ShareDTO shareDTO : shareDTOS) {
                long likeCount = shareLikeService.getCount(shareDTO.getId(), token.getUserDTO().getId());
                if (likeCount == 0) {
                    shareDTO.setIsCurrentUserLike(false);
                } else {
                    shareDTO.setIsCurrentUserLike(true);
                }

                long applyCount = takeApplicationService.getCount(shareDTO.getId(), token.getUserDTO().getId());
                if (applyCount == 0) {
                    shareDTO.setIsCurrentUserApply(false);
                } else {
                    shareDTO.setIsCurrentUserApply(true);
                }
            }
        }

        return JsonObjectUtils.buildListSuccess(shareDTOS);
    }

    /**
     * @param token
     * @param pageNo   可选
     * @param pageSize 可选
     * @param ownerId  可选
     * @return
     * @throws Exception
     */
    //@JsonView(ResultView.BriefView.class)
    @RequestMapping(value = "/share/takein", method = RequestMethod.GET)
    @ResponseBody
    @Authorization
    public JsonObjectList<ShareDTO> getReceivedShareInfos(@RequestAttribute(Constants.TAKEFREE_TOKEN) Token token,
                                                          Integer pageNo, Integer pageSize, Long ownerId)
            throws Exception {
        List<ShareDTO> shareDTOS = shareService.getReceivedShareInfos(pageNo, pageSize, token.getUserDTO().getId(),
                                                                      ownerId);
        return JsonObjectUtils.buildListSuccess(shareDTOS);
    }

    /**
     * 获取用户喜欢的分享
     *
     * @param token
     * @param pageNo      可选
     * @param pageSize    可选
     * @param shareStatus 10(草稿),20(发布中),30(已完成),40(作废)
     * @param ownerId     可选
     * @return
     * @throws Exception
     */
    //@JsonView(ResultView.BriefView.class)
    @RequestMapping(value = "/share/like", method = RequestMethod.GET)
    @ResponseBody
    @Authorization
    public JsonObjectList<ShareDTO> getUserLikeShareInfos(@RequestAttribute(Constants.TAKEFREE_TOKEN) Token token,
                                                          Integer pageNo, Integer pageSize, Integer shareStatus,
                                                          Long ownerId) throws Exception {
        List<ShareDTO> shareDTOS = shareService.getUserLikeShareInfos(pageNo, pageSize, token.getUserDTO().getId(),
                                                                      ownerId, shareStatus);
        for (ShareDTO shareDTO : shareDTOS) {
            long likeCount = shareLikeService.getCount(shareDTO.getId(), token.getUserDTO().getId());
//                if (likeCount == 0) {
//                    shareDTO.setIsCurrentLike(false);
//                } else {
//                    shareDTO.setIsCurrentLike(true);
//                }

            long applyCount = takeApplicationService.getCount(shareDTO.getId(), token.getUserDTO().getId());
            if (applyCount == 0) {
                shareDTO.setIsCurrentUserApply(false);
            } else {
                shareDTO.setIsCurrentUserApply(true);
            }
        }
        return JsonObjectUtils.buildListSuccess(shareDTOS);
    }

    /**
     * 获取用户分享的申请
     *
     * @param token
     * @param pageNo      可选
     * @param pageSize    可选
     * @param applyStatus 可选 10(init),20(success),30(reject)
     * @param ownerId     可选,默认不需要
     * @return
     * @throws Exception
     */
    //@JsonView(ResultView.BriefView.class)
    @RequestMapping(value = "/share/apply", method = RequestMethod.GET)
    @ResponseBody
    @Authorization
    public JsonObjectList<ShareDTO> getUserApplyShareInfos(@RequestAttribute(Constants.TAKEFREE_TOKEN) Token token,
                                                           Integer pageNo, Integer pageSize, Integer applyStatus,
                                                           Long ownerId) throws Exception {
        List<ShareDTO> shareDTOS = shareService.getApplyShareInfos(pageNo, pageSize, token.getUserDTO().getId(),
                                                                   ownerId, applyStatus);
        for (ShareDTO shareDTO : shareDTOS) {
            long likeCount = shareLikeService.getCount(shareDTO.getId(), token.getUserDTO().getId());
            if (likeCount == 0) {
                shareDTO.setIsCurrentUserLike(false);
            } else {
                shareDTO.setIsCurrentUserLike(true);
            }

//                long applyCount = takeApplicationService.getCount(shareDTO.getId(), token.getUserDTO().getId());
//                if (applyCount == 0) {
//                    shareDTO.setIsCurrentApply(false);
//                } else {
//                    shareDTO.setIsCurrentApply(true);
//                }
        }
        return JsonObjectUtils.buildListSuccess(shareDTOS);
    }

    /**
     * 获取用户发出的分享
     *
     * @param token
     * @param pageNo   可选
     * @param pageSize 可选
     * @return
     * @throws Exception
     */
    //@JsonView(ResultView.AllView.class)
    @RequestMapping(value = "/share/takeout", method = RequestMethod.GET)
    @ResponseBody
    @Authorization
    public JsonObjectList<ShareDTO> getTakeOutShares(@RequestAttribute(Constants.TAKEFREE_TOKEN) Token token,
                                                     Integer shareModeId, Integer pageNo, Integer pageSize)
            throws Exception {
        List<ShareDTO> shareDTOS = shareService.getShareInfos(pageNo, pageSize, null, token.getUserDTO().getId(),
                                                              ShareStatusEnum.FINISH.getCode(), shareModeId);
        for (ShareDTO shareDTO : shareDTOS) {
            List<TakeOrderDTO> takeOrderDTOS = takeOrderService.getTakeOrderDTOs(null, null, shareDTO.getId(), null,
                                                                                 null, null);
            shareDTO.setTakeOrderDTOS(takeOrderDTOS);
        }
        return JsonObjectUtils.buildListSuccess(shareDTOS);
    }
}
