package com.takefree.service.impl;

import com.takefree.common.Exception.SimpleHttpException;
import com.takefree.common.entry.Token;
import com.takefree.common.service.TokenManager;
import com.takefree.common.util.BeanUtils;
import com.takefree.common.web.constant.HttpStatus;
import com.takefree.dto.mapper.UserDTOMapper;
import com.takefree.dto.model.UserDTO;
import com.takefree.pojo.mapper.UserDescriptionMapper;
import com.takefree.pojo.mapper.UserInfoMapper;
import com.takefree.pojo.mapper.UserTimeMapper;
import com.takefree.pojo.model.UserDescription;
import com.takefree.pojo.model.UserInfo;
import com.takefree.pojo.model.UserTime;
import com.takefree.pojo.query.UserInfoQuery;
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
    UserDTOMapper userDTOMapper;

    @Autowired
    UserInfoMapper userInfoMapper;

    @Autowired
    UserDescriptionMapper userDescriptionMapper;

    @Autowired
    UserTimeMapper userTimeMapper;

    @Autowired
    private TokenManager tokenManager;

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
        return userDTOMapper.SelectById(id);
    }

    @Override
    @Transactional
    public boolean create(UserDTO userDTO) {
        //密码MD5两次保存
        userDTO.setPassword(SecureUtil.md5(SecureUtil.md5(userDTO.getPassword())));

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
    public Token login(UserDTO userDTO) throws Exception{
        List<UserDTO> userDTOS =userDTOMapper.SelectByMobile(userDTO.getMobile());
        if(userDTOS.size() == 0) {
            throw new SimpleHttpException(HttpStatus.BAD_REQUEST, "手机号错误");
        }
        if(!userDTO.getPassword().equals(userDTOS.get(0).getPassword())){
            throw new SimpleHttpException(HttpStatus.BAD_REQUEST, "手机号或密码错误");
        }

        userDTO = userDTOS.get(0);
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

        return token;
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
}
