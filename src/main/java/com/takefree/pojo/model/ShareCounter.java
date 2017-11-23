package com.takefree.pojo.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * This class corresponds to the database table share_counter
 * @mbg.generated do_not_delete_during_merge
 */
@Data
public class ShareCounter implements Serializable {
    /**
     * 分享id
     * @mbg.generated
     */
    private Long shareId;

    /**
     * 打开次数
     * @mbg.generated
     */
    private Integer viewCount;

    /**
     * 被like次数
     * @mbg.generated
     */
    private Integer likeCount;

    /**
     * 被申请次数
     * @mbg.generated
     */
    private Integer applyCount;

    /**
     * 新申请次数
     * @mbg.generated
     */
    private Integer newApplyCount;

    /**
     * 评论次数
     * @mbg.generated
     */
    private Integer commentCount;

    /**
     * 新评论次数
     * @mbg.generated
     */
    private Integer newCommentCount;

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
     * This field corresponds to the database table share_counter
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method corresponds to the database table share_counter
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", shareId=").append(shareId);
        sb.append(", viewCount=").append(viewCount);
        sb.append(", likeCount=").append(likeCount);
        sb.append(", applyCount=").append(applyCount);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append(", version=").append(version);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
