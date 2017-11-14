package com.takefree.mapper;

import com.takefree.model.UserAddress;
import com.takefree.query.UserAddressQuery;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

;

@Mapper
@Repository
public interface UserAddressMapper {
    /**
     * This method corresponds to the database table user_address
     * @mbg.generated
     */
    long countByExample(UserAddressQuery example);

    /**
     * This method corresponds to the database table user_address
     * @mbg.generated
     */
    int deleteByExample(UserAddressQuery example);

    /**
     * This method corresponds to the database table user_address
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method corresponds to the database table user_address
     * @mbg.generated
     */
    int insert(UserAddress record);

    /**
     * This method corresponds to the database table user_address
     * @mbg.generated
     */
    int insertSelective(UserAddress record);

    /**
     * This method corresponds to the database table user_address
     * @mbg.generated
     */
    List<UserAddress> selectByExample(UserAddressQuery example);

    /**
     * This method corresponds to the database table user_address
     * @mbg.generated
     */
    UserAddress selectByPrimaryKey(Long id);

    /**
     * This method corresponds to the database table user_address
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") UserAddress record, @Param("example") UserAddressQuery example);

    /**
     * This method corresponds to the database table user_address
     * @mbg.generated
     */
    int updateByExample(@Param("record") UserAddress record, @Param("example") UserAddressQuery example);

    /**
     * This method corresponds to the database table user_address
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(UserAddress record);

    /**
     * This method corresponds to the database table user_address
     * @mbg.generated
     */
    int updateByPrimaryKey(UserAddress record);
}
