package com.takefree.mapper;

import com.takefree.model.UserDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by gaoxiang on 2017/11/7.
 */
@Repository
@Mapper
public interface UserDTOMapper {
    @Select("SELECT user_info.*,user_description.description,user_time.lastlogin_time FROM user_info,user_description,user_time WHERE user_info.id = #{id} and user_info.id=user_description.user_id and user_info.id=user_time.user_id ")
    public UserDTO SelectById(Long id);

    @Select("SELECT user_info.*,user_description.description,user_time.lastlogin_time FROM user_info,user_description,user_time WHERE user_info.mobile = #{mobile} and user_info.id=user_description.user_id and user_info.id=user_time.user_id ")
    public List<UserDTO> SelectByMobile(String mobile);
}
