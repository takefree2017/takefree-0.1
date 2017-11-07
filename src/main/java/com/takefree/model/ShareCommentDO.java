package com.takefree.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

@Data
public class ShareCommentDO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     * share_comment.id
     */
    private Long id;

    /**
     * 分享id
     * share_comment.share_id
     */
    private Long shareId;

    /**
     * 被回复的分享评论id
     * share_comment.parent_comment_id
     */
    private Long parentCommentId;

    /**
     * 发出评论的用户id
     * share_comment.user_id
     */
    private Long userId;

    /**
     * 评论内容
     * share_comment.content
     */
    private String content;

    /**
     * 记录插入时间
     * share_comment.gmt_create
     */
    private LocalDateTime gmtCreate;

    /**
     * 最后修改时间
     * share_comment.gmt_modified
     */
    private LocalDateTime gmtModified;

    /**
     * 记录版本号
     * share_comment.version
     */
    private Integer version;

}
