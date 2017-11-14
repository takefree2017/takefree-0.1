package com.takefree.model;

import java.io.Serializable;
import java.util.Date;

/**
 * This class corresponds to the database table share_counter
 * @mbg.generated do_not_delete_during_merge
 */
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
     * This method returns the value of the database column share_counter.share_id
     * @return the value of share_counter.share_id
     * @mbg.generated
     */
    public Long getShareId() {
        return shareId;
    }

    /**
     * This method sets the value of the database column share_counter.share_id
     * @param shareId the value for share_counter.share_id
     * @mbg.generated
     */
    public void setShareId(Long shareId) {
        this.shareId = shareId;
    }

    /**
     * This method returns the value of the database column share_counter.view_count
     * @return the value of share_counter.view_count
     * @mbg.generated
     */
    public Integer getViewCount() {
        return viewCount;
    }

    /**
     * This method sets the value of the database column share_counter.view_count
     * @param viewCount the value for share_counter.view_count
     * @mbg.generated
     */
    public void setViewCount(Integer viewCount) {
        this.viewCount = viewCount;
    }

    /**
     * This method returns the value of the database column share_counter.like_count
     * @return the value of share_counter.like_count
     * @mbg.generated
     */
    public Integer getLikeCount() {
        return likeCount;
    }

    /**
     * This method sets the value of the database column share_counter.like_count
     * @param likeCount the value for share_counter.like_count
     * @mbg.generated
     */
    public void setLikeCount(Integer likeCount) {
        this.likeCount = likeCount;
    }

    /**
     * This method returns the value of the database column share_counter.apply_count
     * @return the value of share_counter.apply_count
     * @mbg.generated
     */
    public Integer getApplyCount() {
        return applyCount;
    }

    /**
     * This method sets the value of the database column share_counter.apply_count
     * @param applyCount the value for share_counter.apply_count
     * @mbg.generated
     */
    public void setApplyCount(Integer applyCount) {
        this.applyCount = applyCount;
    }

    /**
     * This method returns the value of the database column share_counter.gmt_create
     * @return the value of share_counter.gmt_create
     * @mbg.generated
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method sets the value of the database column share_counter.gmt_create
     * @param gmtCreate the value for share_counter.gmt_create
     * @mbg.generated
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method returns the value of the database column share_counter.gmt_modified
     * @return the value of share_counter.gmt_modified
     * @mbg.generated
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * This method sets the value of the database column share_counter.gmt_modified
     * @param gmtModified the value for share_counter.gmt_modified
     * @mbg.generated
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * This method returns the value of the database column share_counter.version
     * @return the value of share_counter.version
     * @mbg.generated
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * This method sets the value of the database column share_counter.version
     * @param version the value for share_counter.version
     * @mbg.generated
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

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