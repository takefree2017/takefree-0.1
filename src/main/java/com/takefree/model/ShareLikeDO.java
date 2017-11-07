package com.takefree.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

@Data
public class ShareLikeDO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     * share_like.id
     */
    private Long id;

    /**
     * 被like的分享id
     * share_like.share_id
     */
    private Long shareId;

    /**
     * 发起like的用户id
     * share_like.user_id
     */
    private Long userId;

    /**
     * 记录插入时间
     * share_like.gmt_create
     */
    private LocalDateTime gmtCreate;

    /**
     * 最后修改时间
     * share_like.gmt_modified
     */
    private LocalDateTime gmtModified;

    /**
     * 记录版本号
     * share_like.version
     */
    private Integer version;

}
