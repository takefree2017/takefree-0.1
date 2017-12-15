package com.takefree.pojo.model;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

/**
 * This class corresponds to the database table share_comment
 * @mbg.generated do_not_delete_during_merge
 */
@Data
public class ShareComment implements Serializable {
    /**
     * 主键
     * @mbg.generated
     */
    private Long id;

    /**
     * 分享id
     * @mbg.generated
     */
    @NotNull(message="shareId不能为空")
    private Long shareId;

    /**
     * 被回复的分享评论id
     * @mbg.generated
     */
    private Long parentCommentId;

    /**
     * 发出评论的用户id
     * @mbg.generated
     */
    private Long userId;

    /**
     * 评论内容
     * @mbg.generated
     */
    @NotNull(message="评论内容不能为空")
    private String content;

    /**
     * 记录插入时间
     * @mbg.generated
     */
    private Date gmtCreate;

    /**
     * 最后修改时间
     * @mbg.generated
     */
    private Date gmtModified;

    /**
     * 记录版本号
     * @mbg.generated
     */
    private Integer version;

    /**
     * This field corresponds to the database table share_comment
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method corresponds to the database table share_comment
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", shareId=").append(shareId);
        sb.append(", parentCommentId=").append(parentCommentId);
        sb.append(", userId=").append(userId);
        sb.append(", content=").append(content);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append(", version=").append(version);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
