package com.takefree.controller;

import com.fasterxml.jackson.annotation.JsonView;
import com.takefree.common.Exception.SimpleHttpException;
import com.takefree.common.annotation.Authorization;
import com.takefree.common.config.Constants;
import com.takefree.common.entry.JsonObjectList;
import com.takefree.common.entry.JsonSimpleObject;
import com.takefree.common.entry.ResultView;
import com.takefree.common.entry.Token;
import com.takefree.common.util.JsonObjectUtils;
import com.takefree.common.web.constant.HttpStatus;
import com.takefree.dto.model.ShareDTO;
import com.takefree.dto.model.UserDTO;
import com.takefree.enums.ApplyStatusEnum;
import com.takefree.enums.ShareStatusEnum;
import com.takefree.pojo.model.ShareLike;
import com.takefree.pojo.model.TakeApplication;
import com.takefree.service.ShareApplyService;
import com.takefree.service.ShareService;
import org.apache.logging.log4j.core.config.plugins.validation.constraints.Required;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * Created by gaoxiang on 2017/11/4.
 */
@Controller
public class ShareApplyController {
    @Autowired
    private ShareService shareService;

    @Autowired
    private ShareApplyService shareApplyService;

    @RequestMapping(value = "/apply",method = RequestMethod.POST)
    @ResponseBody
    @Authorization
    public JsonSimpleObject<ShareLike> createApply(@RequestAttribute(Constants.TAKEFREE_TOKEN) Token token, @RequestBody TakeApplication takeApplication) throws Exception{
        ShareDTO shareInfo=shareService.getShareInfoById(takeApplication.getShareId());

        if(shareInfo==null){
            throw new SimpleHttpException(HttpStatus.BAD_REQUEST, "分享不存在");
        }else if(shareInfo.getStatus()!=ShareStatusEnum.PUBLISH.getCode()){
            throw new SimpleHttpException(HttpStatus.BAD_REQUEST, "分享状态不可申请");
        }else if(shareInfo.getOwnerId().equals(token.getUserDTO().getId())){
            throw new SimpleHttpException(HttpStatus.BAD_REQUEST, "不能申请本人分享");
        }

        if(shareApplyService.getCount(takeApplication.getShareId(),token.getUserDTO().getId())>0){
            throw new SimpleHttpException(HttpStatus.BAD_REQUEST, "已经申请");
        }

        takeApplication.setApplicantId(token.getUserDTO().getId());
        takeApplication.setOwnerId(shareInfo.getOwnerId());
        takeApplication.setApplyTime(new Date());
        takeApplication.setStatus(ApplyStatusEnum.INIT.getCode());
        /**
         * TODO...
         * address采用引用个方法有bug，修改之后被级联修改
         * 交易类型为10时，需要地址
         */

        takeApplication=shareApplyService.create(takeApplication);
        return JsonObjectUtils.buildSimpleObjectSuccess(takeApplication);
    }

    @RequestMapping(value = "/apply/{id}",method = RequestMethod.DELETE)
    @ResponseBody
    @Authorization
    public JsonSimpleObject deleteApply(@RequestAttribute(Constants.TAKEFREE_TOKEN) Token token, @PathVariable("id") Long takeApplicationId) throws Exception{
        shareApplyService.deleteById(takeApplicationId);
        return JsonObjectUtils.buildSimpleObjectSuccess(null);
    }

    /**
     * 获取用户分享的申请
     * @param token
     * @param pageNo 可选
     * @param pageSize 可选
     * @param applyStatus 可选 10(init),20(success),30(reject)
     * @param ownerId 可选,默认不需要
     * @return
     * @throws Exception
     */
    @JsonView(ResultView.BriefView.class)
    @RequestMapping(value = "/apply/share",method = RequestMethod.GET)
    @ResponseBody
    @Authorization
    public JsonObjectList<ShareDTO> getUserApplyShareInfos(@RequestAttribute(Constants.TAKEFREE_TOKEN) Token token, Integer pageNo, Integer pageSize, Integer applyStatus, Long ownerId) throws Exception{
        List<ShareDTO> shareDTOS=shareApplyService.getApplyShareInfos(pageNo, pageSize, token.getUserDTO().getId(), ownerId, applyStatus);
        return JsonObjectUtils.buildListSuccess(shareDTOS);
    }

    /**
     * 按分享查询申请用户
     * @param token
     * @param shareId
     * @param pageNo 可选
     * @param pageSize 可选
     * @param applyStatus 可选 10(init),20(success),30(reject)
     * @return
     * @throws Exception
     */
    @JsonView(ResultView.BriefView.class)
    @RequestMapping(value = "/apply/user",method = RequestMethod.GET)
    @ResponseBody
    public JsonObjectList<UserDTO> getApplyUsers(@RequestAttribute(Constants.TAKEFREE_TOKEN) Token token, Integer pageNo, Integer pageSize, @RequestParam(required=true) Long shareId, Integer applyStatus) throws Exception{
        List<UserDTO> shareDTOS=shareApplyService.getShareApplyUsers(pageNo, pageSize,shareId, applyStatus);
        return JsonObjectUtils.buildListSuccess(shareDTOS);
    }
}
