package com.takefree.model;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class ShareDescDO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 分享id, 主键
     * share_desc.share_id
     */
    private Long shareId;

    /**
     * 分享描述
     * share_desc.description
     */
    private String description;

    /**
     * 记录插入时间
     * share_desc.gmt_create
     */
    private LocalDateTime gmtCreate;

    /**
     * 最后修改时间
     * share_desc.gmt_update
     */
    private LocalDateTime gmtModified;

    /**
     * 记录版本号
     * share_desc.version
     */
    private Integer version;

}
