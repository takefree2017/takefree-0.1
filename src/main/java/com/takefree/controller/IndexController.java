package com.takefree.controller;

import com.takefree.common.config.Constants;
import com.takefree.common.entry.JsonObjectList;
import com.takefree.common.entry.Token;
import com.takefree.common.util.JsonObjectUtils;
import com.takefree.dto.model.IndexDTO;
import com.takefree.dto.model.OrderShowDTO;
import com.takefree.dto.model.ShareDTO;
import com.takefree.enums.ShareStatusEnum;
import com.takefree.pojo.model.TakeApplication;
import com.takefree.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by gaoxiang on 2017/11/4.
 */
@Controller
public class IndexController {
    @Autowired
    private ShareService shareService;

    @Autowired
    private OrderShowService orderShowService;

    @Autowired
    private ShareLikeService shareLikeService;

    @Autowired
    private TakeApplicationService takeApplicationService;

    @Autowired
    private ShowLikeService showLikeService;

    /**
     *
     * @param pageSize
     * @param maxShareId
     * @param maxShowId
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/index",method = RequestMethod.GET)
    @ResponseBody
    public JsonObjectList<IndexDTO> getList(@RequestAttribute(value= Constants.TAKEFREE_TOKEN,required = false) Token token,@RequestParam Integer pageSize, Long maxShareId, Long maxShowId, Integer shareModeId) throws Exception{
        List<ShareDTO> shareDTOS=shareService.getShareInfos(null, pageSize, maxShareId, null, ShareStatusEnum.PUBLISH.getCode(),shareModeId);
        List<OrderShowDTO> orderShowDTOS = orderShowService.getShowDTOs(null, pageSize, maxShowId, null, null, null, null);
        LinkedList<IndexDTO> result=new LinkedList<IndexDTO>();
        int number;
        ShareDTO shareDTO=null;
        OrderShowDTO orderShowDTO=null;

        Iterator<ShareDTO> shareIts=shareDTOS.iterator();
        Iterator<OrderShowDTO> showIts=orderShowDTOS.iterator();

        for(int i=0;i<pageSize;i++){
            if(shareDTO==null) {
                if (shareIts.hasNext()) {
                    shareDTO = shareIts.next();
                    if(token!=null) {
                        long likeCount=shareLikeService.getCount(shareDTO.getId(), token.getUserDTO().getId());
                        if(likeCount==0) {
                            shareDTO.setIsCurrentUserLike(false);
                        }else{
                            shareDTO.setIsCurrentUserLike(true);
                        }

                        long applyCount=takeApplicationService.getCount(shareDTO.getId(),token.getUserDTO().getId());
                        if(applyCount==0) {
                            shareDTO.setIsCurrentUserApply(false);
                        }else{
                            shareDTO.setIsCurrentUserApply(true);
                        }
                    }
                }
            }

            if(orderShowDTO==null) {
                if (showIts.hasNext()) {
                    orderShowDTO = showIts.next();
                    if(token!=null) {
                        long likeCount=showLikeService.getCount(orderShowDTO.getId(), token.getUserDTO().getId());
                        if(likeCount==0) {
                            orderShowDTO.setIsCurrentUserLike(false);
                        }else{
                            orderShowDTO.setIsCurrentUserLike(true);
                        }
                    }
                }
            }

            if(shareDTO==null&&orderShowDTO==null){
                break;
            }

            IndexDTO indexDTO=new IndexDTO();
            indexDTO.setSequence(i+1);
            if(shareDTO!=null&&orderShowDTO!=null){
                if(shareDTO.getPublishTime().after(orderShowDTO.getGmtCreate())){
                    indexDTO.setType(1);
                    indexDTO.setShare(shareDTO);
                    shareDTO=null;
                }else{
                    indexDTO.setType(2);
                    indexDTO.setShow(orderShowDTO);
                    orderShowDTO=null;
                }
            }else if(shareDTO!=null){
                indexDTO.setType(1);
                indexDTO.setShare(shareDTO);
                shareDTO=null;
            }else if(orderShowDTO!=null){
                indexDTO.setType(2);
                indexDTO.setShow(orderShowDTO);
                orderShowDTO=null;
            }
            result.add(indexDTO);
        }

        return JsonObjectUtils.buildListSuccess(result);
    }
}
