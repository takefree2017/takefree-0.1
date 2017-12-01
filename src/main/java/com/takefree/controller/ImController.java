package com.takefree.controller;

import io.swagger.client.model.NewPassword;
import io.swagger.client.model.RegisterUsers;
import io.swagger.client.model.User;

import java.util.Random;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.takefree.common.Exception.SimpleHttpException;
import com.takefree.common.annotation.Authorization;
import com.takefree.common.entry.JsonObjectBase;
import com.takefree.common.util.JsonObjectUtils;
import com.takefree.common.web.constant.HttpStatus;
import com.takefree.im.easemobimpl.EasemobIMUsers;
import com.xiaoleilu.hutool.crypto.SecureUtil;


@Controller
@RequestMapping(value = "im")
public class ImController {

//    private static final Logger logger = LoggerFactory.getLogger(ImController.class);
    private EasemobIMUsers easemobIMUsers = new EasemobIMUsers();


   @RequestMapping(value = "test",method = RequestMethod.GET)
   @ResponseBody   
   public Object test() { 
   	   RegisterUsers users = new RegisterUsers();
       User user = new User();
       user.setUsername("test" + new Random().nextInt(500));
       user.setPassword(SecureUtil.md5("dddffff"));//用takefree端密码再做一次md5生成环信端密码,所以手机端与环信通信应该是3次md5
       users.add(user);
	   return easemobIMUsers.createNewIMUserSingle(users);
   }
    
    
    /**
     *
     * 创建环信端用户
     * @throws SimpleHttpException 
     */
    @RequestMapping(value = "user",method = RequestMethod.POST)
    @ResponseBody   
//    @Authorization
    public Object createUser(@RequestBody User user) throws SimpleHttpException{ 

    	if (user == null) {
    		throw new SimpleHttpException(HttpStatus.BAD_REQUEST, "用户id或密码不能为空"); 
		}
        RegisterUsers users = new RegisterUsers();
//        User user = new User();
//        user.setUsername(id2);
//        user.setPassword(SecureUtil.md5(password));//用takefree端密码再做一次md5生成环信端密码,所以手机端与环信通信应该是3次md5
        users.add(user);
		return easemobIMUsers.createNewIMUserSingle(users);
    }

    /**
    *
    * 改环信端用户密码
    */
    @RequestMapping(value = "/{id}",method = RequestMethod.PUT)
    @ResponseBody   
//    @Authorization  
    public Object changePassword(@PathVariable("id") String id,@RequestParam String password) {
        NewPassword psd = new NewPassword().newpassword(SecureUtil.md5(password));
        return easemobIMUsers.modifyIMUserPasswordWithAdminToken(id, psd);
    }

    /**
    *
    * 删环信端用户
    */
    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    @ResponseBody   
//    @Authorization  
    public Object deleteUser(@PathVariable("id") String id) {
        return easemobIMUsers.deleteIMUserByUserName(id);
    }
    
    /**
    *
    * 环信端用户增加好友
    */
    @RequestMapping(value = "/friend",method = RequestMethod.POST)
    @ResponseBody   
//    @Authorization  
    public Object addFriend(@RequestParam String id ,@RequestParam String friendId ) {
        return easemobIMUsers.addFriendSingle(id, friendId);
    }

    /**
    *
    * 环信端用户删除好友
    */
    @RequestMapping(value = "/friend",method = RequestMethod.DELETE)
    @ResponseBody   
//    @Authorization  
    public Object delFriend(@RequestAttribute("id") String id,@RequestAttribute("friendId") String friendId) {
        return easemobIMUsers.deleteFriendSingle(id, friendId);
    }
    

    /**
    *
    * 获取环信端用户好友
    */
    @RequestMapping(value = "friend",method = RequestMethod.GET)
    @ResponseBody   
//    @Authorization 
    public JsonObjectBase getFriend(@RequestAttribute("id") String id) {
        return JsonObjectUtils.buildSimpleObjectSuccess(easemobIMUsers.getFriends(id));
    }
    
//  public void getUserByName() {
//  String userName = "stringa";
//  Object result = easemobIMUsers.getIMUserByUserName(userName);
//  logger.info(result.toString());
//}
//
//
//public void gerUsers() {
//  Object result = easemobIMUsers.getIMUsersBatch(5L, null);
//  logger.info(result.toString());
//}



}
