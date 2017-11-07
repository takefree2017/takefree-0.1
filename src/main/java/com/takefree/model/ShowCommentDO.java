package com.takefree.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

@Data
public class ShowCommentDO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     * show_comment.id
     */
    private Long id;

    /**
     * 显摆id
     * show_comment.show_id
     */
    private Long showId;

    /**
     * 被回复的分享评论id
     * show_comment.parent_comment_id
     */
    private Long parentCommentId;

    /**
     * 发出评论的用户id
     * show_comment.user_id
     */
    private Long userId;

    /**
     * 评论内容
     * show_comment.content
     */
    private String content;

    /**
     * 记录插入时间
     * show_comment.gmt_create
     */
    private LocalDateTime gmtCreate;

    /**
     * 最后修改时间
     * show_comment.gmt_modified
     */
    private LocalDateTime gmtModified;

    /**
     * 记录版本号
     * show_comment.version
     */
    private Integer version;

}
