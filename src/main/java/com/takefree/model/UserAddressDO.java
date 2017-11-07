package com.takefree.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

@Data
public class UserAddressDO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     * user_address.id
     */
    private Long id;

    /**
     * 用户id
     * user_address.user_id
     */
    private Long userId;

    /**
     * 省份id
     * user_address.province_id
     */
    private Integer provinceId;

    /**
     * 城市id
     * user_address.city_id
     */
    private Integer cityId;

    /**
     * 邮政编码
     * user_address.postcode
     */
    private String postcode;

    /**
     * 邮寄地址
     * user_address.address
     */
    private String address;

    /**
     * 是否默认地址, 0不是默认1默认地址
     * user_address.is_default
     */
    private Integer isDefault;

    /**
     * 记录插入时间
     * user_address.gmt_create
     */
    private LocalDateTime gmtCreate;

    /**
     * 最后修改时间
     * user_address.gmt_modified
     */
    private LocalDateTime gmtModified;

    /**
     * 记录版本号
     * user_address.version
     */
    private Integer version;

}
