package com.takefree.controller;

import com.takefree.common.entry.JsonObjectList;
import com.takefree.common.util.JsonObjectUtils;
import com.takefree.dto.model.IndexDTO;
import com.takefree.dto.model.OrderShowDTO;
import com.takefree.dto.model.ShareDTO;
import com.takefree.enums.ShareStatusEnum;
import com.takefree.service.OrderShowService;
import com.takefree.service.ShareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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
    public JsonObjectList<IndexDTO> getShares(@RequestParam Integer pageSize, Long maxShareId, Long maxShowId, Integer shareModeId) throws Exception{
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
                }
            }

            if(orderShowDTO==null) {
                if (showIts.hasNext()) {
                    orderShowDTO = showIts.next();
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
