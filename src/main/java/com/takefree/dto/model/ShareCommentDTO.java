package com.takefree.dto.model;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

/**
 * This class corresponds to the database table share_comment
 * @mbg.generated do_not_delete_during_merge
 */
@Data
public class ShareCommentDTO implements Serializable {
    /**
     * 主键
     */
    private Long id;

    /**
     * 分享id
     */

    private Long shareId;

    /**
     * 被回复的分享评论id
     */
    private Long parentCommentId;

    /**
     * 发出评论的用户id
     */
    private Long parentUserId;

    /**
     * 昵称
     */
    private String parentUserNickName;

    /**
     * 小图像
     */
    private String parentUserSmallIcon;

    /**
     * 评论内容
     */
    private String parentContent;

    /**
     * 发出评论的用户id
     */
    private Long userId;

    /**
     * 昵称
     */
    private String userNickName;

    /**
     * 小图像
     */
    private String userSmallIcon;

    /**
     * 评论内容
     */
    private String content;

    /**
     * 记录插入时间
     */
    private Date gmtCreate;

    /**
     * 最后修改时间
     */
    private Date gmtModified;

    /**
     * 记录版本号
     */
    private Integer version;

    /**
     * This field corresponds to the database table share_comment
     */
    private static final long serialVersionUID = 1L;

}
