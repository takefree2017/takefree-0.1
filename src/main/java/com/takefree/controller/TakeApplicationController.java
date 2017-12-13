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
import com.takefree.dto.model.TakeApplicationDTO;
import com.takefree.enums.ApplyStatusEnum;
import com.takefree.enums.ShareStatusEnum;
import com.takefree.pojo.model.ShareLike;
import com.takefree.pojo.model.TakeApplication;
import com.takefree.service.TakeApplicationService;
import com.takefree.service.ShareService;
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
public class TakeApplicationController {
    @Autowired
    private ShareService shareService;

    @Autowired
    private TakeApplicationService takeApplicationService;

    @RequestMapping(value = "/apply",method = RequestMethod.POST)
    @ResponseBody
    @Authorization
    public JsonSimpleObject<ShareLike> createApply(@RequestAttribute(Constants.TAKEFREE_TOKEN) Token token,@Valid @RequestBody TakeApplication takeApplication) throws Exception{
        ShareDTO shareInfo=shareService.getShareInfoById(takeApplication.getShareId());

        if(shareInfo==null){
            throw new SimpleHttpException(HttpStatus.BAD_REQUEST, "分享不存在");
        }else if(shareInfo.getStatus()!=ShareStatusEnum.PUBLISH.getCode()){
            throw new SimpleHttpException(HttpStatus.BAD_REQUEST, "分享状态不可申请");
        }else if(shareInfo.getOwnerId().equals(token.getUserDTO().getId())){
            throw new SimpleHttpException(HttpStatus.BAD_REQUEST, "不能申请本人分享");
        }

        if(this.takeApplicationService.getCount(takeApplication.getShareId(), token.getUserDTO().getId()) > 0){
            throw new SimpleHttpException(HttpStatus.BAD_REQUEST, "已经申请");
        }

        takeApplication.setApplicantId(token.getUserDTO().getId());
        takeApplication.setOwnerId(shareInfo.getOwnerId()); //建议删掉
        takeApplication.setApplyTime(new Date());
        //takeApplication.setStatus(ApplyStatusEnum.INIT.getCode());
        /**
         * TODO...
         * address采用引用个方法有bug，修改之后被级联修改
         * 交易类型为10时，需要地址
         */

        takeApplication= this.takeApplicationService.create(takeApplication);
        return JsonObjectUtils.buildSimpleObjectSuccess(takeApplication);
    }

    @RequestMapping(value = "/apply/{id}",method = RequestMethod.DELETE)
    @ResponseBody
    @Authorization
    public JsonSimpleObject deleteApply(@RequestAttribute(Constants.TAKEFREE_TOKEN) Token token, @PathVariable("id") Long takeApplicationId) throws Exception{
        TakeApplicationDTO apply= takeApplicationService.getById(takeApplicationId);
        if(apply==null){
            throw new SimpleHttpException(HttpStatus.NOT_FOUND, "无此申请");
        }
        if(!apply.getApplicantId().equals(token.getUserDTO().getId())){
            throw new SimpleHttpException(HttpStatus.FORBIDDEN, "Unauthorized");
        }
        int row=takeApplicationService.deleteById(takeApplicationId);
        return JsonObjectUtils.buildSimpleObjectSuccess(null);
    }

    @RequestMapping(value = "/apply/{id}",method = RequestMethod.PUT)
    @ResponseBody
    @Authorization
    public JsonSimpleObject updateApply(@RequestAttribute(Constants.TAKEFREE_TOKEN) Token token, @PathVariable("id") Long takeApplicationId,@RequestBody TakeApplication takeApplication) throws Exception{
        TakeApplicationDTO apply= takeApplicationService.getById(takeApplicationId);
        if(apply==null){
            throw new SimpleHttpException(HttpStatus.NOT_FOUND, "无此申请");
        }
        if(!apply.getApplicantId().equals(token.getUserDTO().getId())){
            throw new SimpleHttpException(HttpStatus.FORBIDDEN, "Unauthorized");
        }
        takeApplication.setId(takeApplicationId);
        int row=takeApplicationService.updateById(takeApplication);
        return JsonObjectUtils.buildSimpleObjectSuccess(null);
    }

    @RequestMapping(value = "/apply/{id}",method = RequestMethod.GET)
    @ResponseBody
    @Authorization
    public JsonSimpleObject<TakeApplicationDTO> getApply(@RequestAttribute(Constants.TAKEFREE_TOKEN) Token token, @PathVariable("id") Long takeApplicationId) throws Exception{
        TakeApplicationDTO apply= takeApplicationService.getById(takeApplicationId);
        if(apply==null){
            throw new SimpleHttpException(HttpStatus.NOT_FOUND, "无此订单");
        }
        if(!apply.getApplicantId().equals(token.getUserDTO().getId())){
            throw new SimpleHttpException(HttpStatus.UNAUTHORIZED, "Unauthorized");
        }
        return JsonObjectUtils.buildSimpleObjectSuccess(apply);
    }

    /**
     * 获取分享订单
     * @param applyUserId 可选
     * @param shareId 可选
     * @param pageNo 可选
     * @param pageSize 可选
     * @param status 可选 10初始状态; 20
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/apply",method = RequestMethod.GET)
    @ResponseBody
    public JsonObjectList<TakeApplicationDTO> getApplys(@RequestAttribute(value=Constants.TAKEFREE_TOKEN,required = false) Token token, Integer pageNo, Integer pageSize, Long applyUserId, Long shareId, Integer status) throws Exception{
        if(applyUserId!=null){
            if(token==null||!token.getUserDTO().getId().equals(applyUserId)){
                throw new SimpleHttpException(HttpStatus.UNAUTHORIZED, "Unauthorized");
            }
        }

        List<TakeApplicationDTO> apply= takeApplicationService.getApplys(pageNo, pageSize, shareId, null, applyUserId, status);
        return JsonObjectUtils.buildListSuccess(apply);
    }
}
