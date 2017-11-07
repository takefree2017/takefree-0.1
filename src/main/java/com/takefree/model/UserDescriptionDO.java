package com.takefree.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

@Data
public class UserDescriptionDO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户id, 主键
     * user_description.id
     */
    private Long id;

    /**
     * 用户简介
     * user_description.description
     */
    private String description;

    /**
     * 记录版本号
     * user_description.version
     */
    private Integer version;

    /**
     * 记录插入时间
     * user_description.gmt_create
     */
    private LocalDateTime gmtCreate;

    /**
     * 最后修改时间
     * user_description.gmt_modified
     */
    private LocalDateTime gmtModified;

}
