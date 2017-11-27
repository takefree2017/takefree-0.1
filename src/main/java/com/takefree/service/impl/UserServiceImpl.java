package com.takefree.service.impl;

import com.takefree.common.Exception.SimpleHttpException;
import com.takefree.common.entry.Token;
import com.takefree.common.service.SmsService;
import com.takefree.common.service.TokenManager;
import com.takefree.common.util.BeanUtils;
import com.takefree.common.util.Util;
import com.takefree.common.web.constant.HttpStatus;
import com.takefree.dto.mapper.UserDTOMapper;
import com.takefree.dto.model.UserDTO;
import com.takefree.dto.query.UserDTOQuery;
import com.takefree.enums.UserStatusEnum;
import com.takefree.pojo.mapper.UserDescriptionMapper;
import com.takefree.pojo.mapper.UserInfoMapper;
import com.takefree.pojo.mapper.UserTimeMapper;
import com.takefree.pojo.model.UserDescription;
import com.takefree.pojo.model.UserInfo;
import com.takefree.pojo.model.UserTime;
import com.takefree.pojo.query.UserInfoQuery;
import com.takefree.service.UserLikeService;
import com.takefree.service.UserService;
import com.xiaoleilu.hutool.crypto.SecureUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * Created by gaoxiang on 2017/11/7.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDTOMapper userDTOMapper;

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Autowired
    private UserDescriptionMapper userDescriptionMapper;

    @Autowired
    private UserTimeMapper userTimeMapper;

    @Autowired
    private TokenManager tokenManager;

    @Autowired
    private SmsService smsService;

    @Autowired
    private UserLikeService userLikeService;

    private static String loginSmsTemplete="TakeFree 登录验证码$code$，请在5分钟内使用。";

    private static String loginSmsReidsPrefix="LOGIN";

    @Override
    public UserDTO getUserInfoById(Long id) {
        UserInfo userInfo=userInfoMapper.selectByPrimaryKey(id);
        if(userInfo==null){
            return null;
        }
        UserDTO userDTO=new UserDTO();
        BeanUtils.copyPropertiesIgnoreNull(userInfo,userDTO);
        return userDTO;
    }

    @Override
    public UserDTO getUserDetailById(Long id) {
        return userDTOMapper.selectDetailById(id);
    }

    @Override
    @Transactional
    public boolean create(UserDTO userDTO) {
        //密码MD5两次保存
        userDTO.setPassword(Util.encryptPassword(userDTO.getPassword()));

        UserInfo userInfo=new UserInfo();
        BeanUtils.copyPropertiesIgnoreNull(userDTO, userInfo);
        int result=userInfoMapper.insertSelective(userInfo);
        if(result==0){
            return false;
        }

        userDTO.setId(userInfo.getId());

        UserDescription userDescription=new UserDescription();
        BeanUtils.copyPropertiesIgnoreNull(userDTO, userDescription);
        userDescription.setUserId(userInfo.getId());
        userDescriptionMapper.insertSelective(userDescription);

        UserTime userTime=new UserTime();
        BeanUtils.copyPropertiesIgnoreNull(userDTO, userTime);
        userTime.setUserId(userInfo.getId());
        userTimeMapper.insertSelective(userTime);
        return true;
    }

    @Override
    public Token loginByPassword(String mobile,String passord) throws Exception{
        List<UserDTO> userDTOS =userDTOMapper.selectByMobile(mobile);
        if(userDTOS.size() == 0) {
            throw new SimpleHttpException(HttpStatus.BAD_REQUEST, "手机号错误");
        }
        if(userDTOS.get(0).getStatus() != UserStatusEnum.ACTIVE.getCode()){
            throw new SimpleHttpException(HttpStatus.BAD_REQUEST, "用户未激活，请用短信方式激活");
        }
        if(!Util.encryptPassword(passord).equals(userDTOS.get(0).getPassword())){
            throw new SimpleHttpException(HttpStatus.BAD_REQUEST, "手机号或密码错误");
        }

        UserDTO userDTO = userDTOS.get(0);

        return login(userDTO);
    }

    @Override
    public Token loginBySms(String mobile,String smsCode) throws Exception{
        List<UserDTO> userDTOS =userDTOMapper.selectByMobile(mobile);
        if(userDTOS.size() == 0) {
            throw new SimpleHttpException(HttpStatus.BAD_REQUEST, "手机号错误");
        }
        UserDTO userDTO = userDTOS.get(0);
        if(smsService.checkCode(mobile,loginSmsReidsPrefix,smsCode)){
            return login(userDTO);
        }else{
            throw new SimpleHttpException(HttpStatus.BAD_REQUEST, "验证码错误");
        }
    }

    private Token login(UserDTO userDTO) throws Exception{
        userDTO.setLastloginTime(new Date());
        Token token=tokenManager.createToken(userDTO);

        if(token!=null) {
            UserTime userTime=new UserTime();
            userTime.setUserId(userDTO.getId());
            userTime.setLastloginTime(new Date());
            userTimeMapper.updateByPrimaryKeySelective(userTime);
        }else{
            throw new SimpleHttpException(HttpStatus.INTERNAL_SERVER_ERROR, "内部错误");
        }

        //首次登陆
//        if(userDTO.getStatus() != UserStatusEnum.ACTIVE.getCode()){
//            token.setIsActive(false);
//            UserInfo userInfo=new UserInfo();
//            userInfo.setId(userDTO.getId());
//            userInfo.setStatus(UserStatusEnum.ACTIVE.getCode());
//            userInfoMapper.updateByPrimaryKeySelective(userInfo);
//        }

        return token;
    }

    @Override
    public boolean sendLoginSms(String mobile) throws Exception{
        List<UserDTO> userDTOS =userDTOMapper.selectByMobile(mobile);
        if(userDTOS.size() == 0) {
            throw new SimpleHttpException(HttpStatus.BAD_REQUEST, "手机号错误");
        }
        return smsService.sendCode(mobile,loginSmsReidsPrefix,loginSmsTemplete);
    }


    @Override
    public Boolean logout(Token token) throws Exception{
        return tokenManager.deleteToken(token);
    }

    @Override
    @Transactional
    public void updateById(UserDTO userDTO) {
        UserInfo userInfo=new UserInfo();
        BeanUtils.copyPropertiesIgnoreNull(userDTO,userInfo);
        userInfoMapper.updateByPrimaryKeySelective(userInfo);
        if(userDTO.getDescription() != null) {
            UserDescription userDescription=new UserDescription();
            BeanUtils.copyPropertiesIgnoreNull(userDTO, userDescription);
            userDescriptionMapper.insertSelective(userDescription);
            userDescriptionMapper.updateByPrimaryKeySelective(userDescription);
        }
    }

    @Override
    public List<UserInfo> getUserInfoByMobile(String mobile) {
        if(mobile==null){
            return null;
        }
        UserDTO userDTO=new UserDTO();
        UserInfoQuery userInfoQuery=new UserInfoQuery();
        userInfoQuery.createCriteria().andMobileEqualTo(mobile);

        return userInfoMapper.selectByExample(userInfoQuery);
    }

    @Override
    public List<UserDTO> getFollowerByFolloweeId(Integer pageNo,Integer pageSize,Long followeeId){
        UserDTOQuery userDTOQuery=new UserDTOQuery();
        if (pageNo != null && pageSize != null) {
            userDTOQuery.page(pageNo, pageSize);
        }

        if (pageNo == null && pageSize != null) {
            userDTOQuery.limit(pageSize);
        }

        UserDTOQuery.Criteria criteria=userDTOQuery.createCriteria();

        criteria.andFolloweeIdEqualTo(followeeId);

        List<UserDTO> followers=userDTOMapper.selectFollowerByFolloweeId(userDTOQuery);

        for(UserDTO follower:followers){
            //判断like我的人，是否也被我like
            if(userLikeService.getByFollowerAndFollowee(followeeId,follower.getId())!=null){
                follower.setIsFollowee(true);
            }else{
                follower.setIsFollowee(false);
            }
        }
        return followers;
    }

    @Override
    public List<UserDTO> getFolloweeByFollowerId(Integer pageNo,Integer pageSize,Long followerId){
        UserDTOQuery userDTOQuery=new UserDTOQuery();
        if (pageNo != null && pageSize != null) {
            userDTOQuery.page(pageNo, pageSize);
        }

        if (pageNo == null && pageSize != null) {
            userDTOQuery.limit(pageSize);
        }

        UserDTOQuery.Criteria criteria=userDTOQuery.createCriteria();

        criteria.andFollowerIdEqualTo(followerId);

        return userDTOMapper.selectFolloweeByFollowerId(userDTOQuery);
    }
}
