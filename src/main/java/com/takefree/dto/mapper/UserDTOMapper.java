package com.takefree.dto.mapper;

import com.takefree.dto.model.UserDTO;
import com.takefree.dto.query.UserDTOQuery;
import com.takefree.pojo.query.TakeApplicationQuery;
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
    public UserDTO selectDetailById(Long id);

    public List<UserDTO> selectByMobile(String mobile);

    public List<UserDTO> selectFollowerByFolloweeId(UserDTOQuery userDTOQuery);

    public List<UserDTO> selectFolloweeByFollowerId(UserDTOQuery userDTOQuery);

    public List<UserDTO> selectShareApllyUsers(TakeApplicationQuery takeApplicationQuery);
}
