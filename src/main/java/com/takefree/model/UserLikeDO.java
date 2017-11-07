package com.takefree.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

@Data
public class UserLikeDO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     * user_like.id
     */
    private Long id;

    /**
     * 被like的用户id
     * user_like.user_followee_id
     */
    private Long userFolloweeId;

    /**
     * 发起like的用户id
     * user_like.user_follower_id
     */
    private Long userFollowerId;

    /**
     * 1正常; 0已取消
     * user_like.status
     */
    private Integer status;

    /**
     * 记录插入时间
     * user_like.gmt_create
     */
    private LocalDateTime gmtCreate;

    /**
     * 最后修改时间
     * user_like.gmt_modified
     */
    private LocalDateTime gmtModified;

    /**
     * 记录版本号
     * user_like.version
     */
    private Integer version;

}
