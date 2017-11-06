package com.takefree.model;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class UserTimeDO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户id, 主键
     * user_time.id
     */
    private Long id;

    /**
     * 用户创建时间
     * user_time.create_time
     */
    private LocalDateTime createTime;

    /**
     * 最后登录时间
     * user_time.lastlogin_time
     */
    private LocalDateTime lastloginTime;

    /**
     * 记录版本号
     * user_time.version
     */
    private Integer version;
}
