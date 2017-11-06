package com.takefree.model;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class ShowLikeDO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     * show_like.id
     */
    private Long id;

    /**
     * 被like的显摆id
     * show_like.show_id
     */
    private Long showId;

    /**
     * 发起like的用户id
     * show_like.user_id
     */
    private Long userId;

    /**
     * 记录插入时间
     * show_like.gmt_create
     */
    private LocalDateTime gmtCreate;

    /**
     * 最后修改时间
     * show_like.gmt_update
     */
    private LocalDateTime gmtModified;

    /**
     * 记录版本号
     * show_like.version
     */
    private Integer version;

}
