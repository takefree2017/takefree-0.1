package com.takefree.pojo.model;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;

/**
 * This class corresponds to the database table user_address
 * @mbg.generated do_not_delete_during_merge
 */
@Data
public class UserAddress implements Serializable {
    /**
     * 主键
     * @mbg.generated
     */
    private Long id;

    /**
     * 用户id
     * @mbg.generated
     */
    @NotNull(message="用户id不能为空")
    private Long userId;

    /**
     * @mbg.generated
     */
    @NotNull(message="用户姓名不能为空")
    private String userName;

    /**
     * @mbg.generated
     */
    private String phone;

    /**
     * 省份id
     * @mbg.generated
     */
    private Integer provinceId;

    /**
     * 城市id
     * @mbg.generated
     */
    private Integer cityId;

    /**
     * 邮政编码
     * @mbg.generated
     */
    private String postcode;

    /**
     * 邮寄地址
     * @mbg.generated
     */
    private String address;

    /**
     * 是否默认地址, 0不是默认1默认地址
     * @mbg.generated
     */
    private Integer isDefault;

    /**
     * 记录插入时间
     * @mbg.generated
     */
    private Date gmtCreate;

    /**
     * 最后修改时间
     * @mbg.generated
     */
    private Date gmtModified;

    /**
     * 记录版本号
     * @mbg.generated
     */
    private Integer version;

    /**
     * This field corresponds to the database table user_address
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method corresponds to the database table user_address
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", userName=").append(userName);
        sb.append(", phone=").append(phone);
        sb.append(", provinceId=").append(provinceId);
        sb.append(", cityId=").append(cityId);
        sb.append(", postcode=").append(postcode);
        sb.append(", address=").append(address);
        sb.append(", isDefault=").append(isDefault);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append(", version=").append(version);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
