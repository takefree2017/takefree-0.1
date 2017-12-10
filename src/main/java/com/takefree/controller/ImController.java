package com.takefree.controller;

import io.swagger.client.model.NewPassword;
import io.swagger.client.model.RegisterUsers;
import io.swagger.client.model.User;

import java.util.Random;

import javax.annotation.security.RolesAllowed;

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
    
    /**
     *
     * 创建环信端用户
     * @throws SimpleHttpException 
     */
    @RequestMapping(value = "user",method = RequestMethod.POST)
    @ResponseBody   
//    @Authorization
    public Object createUser(@RequestBody User user) throws SimpleHttpException{ 

    	if (user.getUsername() == null) {
    		throw new SimpleHttpException(HttpStatus.BAD_REQUEST, "用户id不能为空"); 
		}
        RegisterUsers users = new RegisterUsers();
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

    /**
    *
    * 发消息
    */
    @RequestMapping(value = "sendmsg/{from}/{to}/{msg}",method = RequestMethod.GET)
    @ResponseBody   
 //   @RolesAllowed("ROLE_ADMIN")
//    public Object sendMsg(@RequestAttribute("from") String from,@RequestAttribute("to") String to,@RequestAttribute("msg") String msg) { 
    public Object sendMsg(@PathVariable("from") String from,@PathVariable("to") String to,@PathVariable("msg") String msg) { 
 	   return easemobIMUsers.sendMsg(from, to, msg);
    }
    
    /**
    *
    * 获取环信端用户离线消息数
    */
    @RequestMapping(value = "msgcount/{id}",method = RequestMethod.GET)
    @ResponseBody   
 //   @RolesAllowed("ROLE_ADMIN")
    public Object msgCount(@PathVariable("id") String id) { 
 	   return easemobIMUsers.getOfflineMsgCount(id);
    }
     
}
