package com.takefree.service.impl;

import com.takefree.common.Exception.SimpleHttpException;
import com.takefree.common.entry.Token;
import com.takefree.common.service.TokenManager;
import com.takefree.common.util.BeanUtils;
import com.takefree.common.web.constant.HttpStatus;
import com.takefree.mapper.UserDTOMapper;
import com.takefree.mapper.ext.UserDescriptionExtMapper;
import com.takefree.mapper.ext.UserInfoExtMapper;
import com.takefree.mapper.ext.UserTimeExtMapper;
import com.takefree.model.UserDTO;
import com.takefree.model.UserDescriptionDO;
import com.takefree.model.UserInfoDO;
import com.takefree.model.UserTimeDO;
import com.takefree.query.UserInfoQuery;
import com.takefree.service.UserService;
import com.xiaoleilu.hutool.crypto.SecureUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Created by gaoxiang on 2017/11/7.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDTOMapper userDTOMapper;

    @Autowired
    UserInfoExtMapper userInfoExtMapper;

    @Autowired
    UserDescriptionExtMapper userDescriptionExtMapper;

    @Autowired
    UserTimeExtMapper userTimeExtMapper;

    @Autowired
    private TokenManager tokenManager;

    @Override
    public UserInfoDO getUserInfoById(Long id) {
        return userInfoExtMapper.selectByPrimaryKey(id);
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

        UserInfoDO userInfoDO=new UserInfoDO();
        BeanUtils.copyPropertiesIgnoreNull(userDTO, userInfoDO);
        int result=userInfoExtMapper.insertSelective(userInfoDO);
        if(result==0){
            return false;
        }

        userDTO.setId(userInfoDO.getId());

        UserDescriptionDO userDescriptionDO=new UserDescriptionDO();
        BeanUtils.copyPropertiesIgnoreNull(userDTO, userDescriptionDO);
        userDescriptionDO.setUserId(userInfoDO.getId());
        userDescriptionExtMapper.insertSelective(userDescriptionDO);

        UserTimeDO userTimeDO=new UserTimeDO();
        BeanUtils.copyPropertiesIgnoreNull(userDTO, userTimeDO);
        userTimeDO.setUserId(userInfoDO.getId());
        userTimeExtMapper.insertSelective(userTimeDO);
        return true;
    }

    @Override
    @Transactional
    public Token login(UserDTO userDTO) throws Exception{
        List<UserDTO> userDTOS =userDTOMapper.SelectByMobile(userDTO.getMobile());
        if(userDTOS.size() == 0) {
            throw new SimpleHttpException(HttpStatus.BAD_REQUEST, "手机号错误");
        }
        if(!userDTO.getPassword().equals(userDTOS.get(0).getPassword())){
            throw new SimpleHttpException(HttpStatus.BAD_REQUEST, "手机号或密码错误");
        }

        userDTO = userDTOS.get(0);
        userDTO.setLastloginTime(LocalDateTime.now());
        Token token=tokenManager.createToken(userDTO);

        if(token!=null) {
            UserTimeDO userTimeDO=new UserTimeDO();
            userTimeDO.setUserId(userDTO.getId());
            userTimeDO.setLastloginTime(LocalDateTime.now());
            userTimeExtMapper.updateByPrimaryKeySelective(userTimeDO);
        }else{
            throw new SimpleHttpException(HttpStatus.INTERNAL_SERVER_ERROR, "内部错误");
        }

        return token;
    }

    @Override
    @Transactional
    public void updateById(UserDTO userDTO) {
        UserInfoDO userInfoDO=new UserInfoDO();
        BeanUtils.copyPropertiesIgnoreNull(userDTO,userInfoDO);
        userInfoExtMapper.updateByPrimaryKeySelective(userInfoDO);
        if(userDTO.getDescription() != null) {
            UserDescriptionDO userDescriptionDO=new UserDescriptionDO();
            BeanUtils.copyPropertiesIgnoreNull(userDTO, userDescriptionDO);
            userDescriptionExtMapper.insertSelective(userDescriptionDO);
            userDescriptionExtMapper.updateByPrimaryKeySelective(userDescriptionDO);
        }
    }

    @Override
    public List<UserInfoDO> getUserInfoByMobile(String mobile) {
        if(mobile==null){
            return null;
        }
        UserDTO userDTO=new UserDTO();
        UserInfoQuery userInfoQuery=new UserInfoQuery();
        userInfoQuery.createCriteria().andMobileEqualTo(mobile);

        return userInfoExtMapper.selectByQuery(userInfoQuery);
    }
}
