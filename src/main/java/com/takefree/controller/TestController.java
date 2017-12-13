package com.takefree.controller;

import com.takefree.im.SmsService;
import com.takefree.dto.model.ShareDTO;
import com.takefree.service.ShareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Random;
import java.util.UUID;

/**
 * Created by gaoxiang on 2017/11/4.
 */
@Controller
@RequestMapping(value = "/test")
public class TestController {
    @Autowired
    private ShareService shareService;
    @Autowired
    SmsService ss;
    /**
     * 新建
     * @throws Exception 
     */
    @RequestMapping(value = "s",method = RequestMethod.GET)
    @ResponseBody
    public void testsms() throws Exception {
    	ss.sendCode("18910789656","rediskey-verifcode");
        return ;
    }
    
    /**
     * 新建
     */
    @RequestMapping(value = "c",method = RequestMethod.GET)
    @ResponseBody
    public void createShare() throws Exception{
    	ShareDTO shareDTO = new ShareDTO(); 
        for (int i = 0; i < 1000000; i++) {
        	shareDTO = new ShareDTO(); 
        	Random random  = new Random();
//        	String tmp = "{\"orderId\": \"110417121112001061\", \"params\": \"verificationCode=9521\",\"receiver\": \"18698569551\",\"sign\": \"Free社区\", \"templateCode\": \"4216916e-aca8-4802-88b4-87a4c467c0b6\" }";
        	shareDTO.setDescription("description" + String.valueOf(random.nextInt()));
        	shareDTO.setOwnerId((long)random.nextInt(1000));
        	shareDTO.setPicHomepage("/backup/"  + String.valueOf(random.nextInt()));
        	shareDTO.setShareDescPreview("desc" + UUID.randomUUID().toString().substring(5, 10));
        	shareDTO.setOwnerNickName(UUID.randomUUID().toString());
        	shareDTO=shareService.create(shareDTO);
		}
        return ;
    }

}
