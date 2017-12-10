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
import com.takefree.enums.ShareStatusEnum;
import com.takefree.dto.model.ShareDTO;
import com.takefree.service.ShareService;
import org.apache.logging.log4j.core.config.plugins.validation.constraints.Required;
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
@RequestMapping(value = "/share")
public class ShareController {
    @Autowired
    private ShareService shareService;

    /**
     * 新建
     */
    @RequestMapping(value = "",method = RequestMethod.POST)
    @ResponseBody
    @Authorization
    @JsonView(ResultView.BriefView.class)
    public JsonSimpleObject<ShareDTO> createShare(@RequestAttribute(Constants.TAKEFREE_TOKEN) Token token,@Valid @RequestBody ShareDTO shareDTO) throws Exception{
        if(shareDTO.getId()!=null){
            throw new SimpleHttpException(HttpStatus.BAD_REQUEST, "分享已经存在");
        }
        shareDTO.setOwnerId(token.getUserDTO().getId());
        shareDTO=shareService.create(shareDTO);
        return JsonObjectUtils.buildSimpleObjectSuccess(shareDTO);
    }

    /**
     * 更新
     */
    @RequestMapping(value = "/{id}",method = RequestMethod.PUT)
    @ResponseBody
    @Authorization
    @JsonView(ResultView.BriefView.class)
    public JsonSimpleObject<ShareDTO> updateShare(@RequestAttribute(Constants.TAKEFREE_TOKEN) Token token,@RequestParam Long id,@RequestBody ShareDTO shareDTO) throws Exception{
        ShareDTO oldShareDTO=shareService.getShareInfoById(id);
        if(oldShareDTO==null){
            throw new SimpleHttpException(HttpStatus.NOT_FOUND, "分享不存在");
        }
        if(!oldShareDTO.getOwnerId().equals(token.getUserDTO().getId())){
            throw new SimpleHttpException(HttpStatus.FORBIDDEN,"无权限");
        }

        shareDTO.setId(id);
        shareService.updateByIdSelective(shareDTO);
        return JsonObjectUtils.buildSimpleObjectSuccess(shareDTO);
    }

    /**
     * 发布
     * @param token
     * @param shareDTO id不存在是新建，否则更新
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/publish",method = RequestMethod.POST)
    @ResponseBody
    @Authorization
    @JsonView(ResultView.BriefView.class)
    public JsonSimpleObject<ShareDTO> publishShare(@RequestAttribute(Constants.TAKEFREE_TOKEN) Token token,@Valid @RequestBody ShareDTO shareDTO) throws Exception{
        shareDTO.setStatus(ShareStatusEnum.PUBLISH.getCode());
        shareDTO.setPublishTime(new Date());
        if(shareDTO.getId()==null){ //不存在新建
            return createShare(token,shareDTO);
        }else {                     //存在则更新
            return updateShare(token,shareDTO.getId(),shareDTO);
        }
    }

    /**
     * 删除，非物理删除。status=40
     */
    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    @ResponseBody
    @Authorization
    public JsonSimpleObject deleteShare(@RequestAttribute(Constants.TAKEFREE_TOKEN) Token token,@Required @PathVariable Long id) throws Exception{
        ShareDTO shareDTO=shareService.getShareInfoById(id);
        if(shareDTO==null){
            throw new SimpleHttpException(HttpStatus.NOT_FOUND, "分享不存在");
        }
        shareService.deleteById(id);
        return JsonObjectUtils.buildSimpleObjectSuccess(null);
    }

    /**
     * 获取详细信息
     * @param id
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    @ResponseBody
//    @JsonView(ResultView.DetailView.class)
    public JsonSimpleObject<ShareDTO> getShare(@RequestAttribute(value=Constants.TAKEFREE_TOKEN,required = false) Token token,@Required @PathVariable Long id) throws Exception{
        ShareDTO shareDTO=shareService.getShareDetailById(id);
        if(shareDTO==null){
            throw new SimpleHttpException(HttpStatus.NOT_FOUND, "分享不存在");
        }

        Long userId=null;
        if(token!=null){
            userId=token.getUserDTO().getId();
        }

        shareService.updateViewInfo(shareDTO,userId);
        return JsonObjectUtils.buildSimpleObjectSuccess(shareDTO);
    }

    /**
     * 按发布人，状态筛选
     * @param pageNo 可选
     * @param pageSize 可选
     * @param maxId 可选
     * @param status 可选
     * @param ownerId 可选
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "",method = RequestMethod.GET)
    @ResponseBody
    @JsonView(ResultView.BriefView.class)
    public JsonObjectList<ShareDTO> getShares(Integer pageNo,Integer pageSize,Long maxId,Integer status,Long ownerId) throws Exception{
        List<ShareDTO> shareDTOS=shareService.getShareInfos(pageNo,pageSize,maxId,ownerId,status);
        return JsonObjectUtils.buildListSuccess(shareDTOS);
    }


    /**
     *
     * @param token
     * @param pageNo 可选
     * @param pageSize 可选
     * @param ownerId 可选
     * @return
     * @throws Exception
     */
    @JsonView(ResultView.BriefView.class)
    @RequestMapping(value = "/received",method = RequestMethod.GET)
    @ResponseBody
    @Authorization
    public JsonObjectList<ShareDTO> getReceivedShareInfos(@RequestAttribute(Constants.TAKEFREE_TOKEN) Token token,Integer pageNo,Integer pageSize,Long ownerId) throws Exception{
        List<ShareDTO> shareDTOS=shareService.getReceivedShareInfos(pageNo,pageSize,token.getUserDTO().getId(),ownerId);
        return JsonObjectUtils.buildListSuccess(shareDTOS);
    }

}
