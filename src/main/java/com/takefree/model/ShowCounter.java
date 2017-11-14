package com.takefree.model;

import java.io.Serializable;
import java.util.Date;

/**
 * This class corresponds to the database table show_counter
 * @mbg.generated do_not_delete_during_merge
 */
public class ShowCounter implements Serializable {
    /**
     * 分享id
     * @mbg.generated
     */
    private Long showId;

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
     * 评论次数
     * @mbg.generated
     */
    private Integer commentCount;

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
     * This field corresponds to the database table show_counter
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column show_counter.show_id
     * @return the value of show_counter.show_id
     * @mbg.generated
     */
    public Long getShowId() {
        return showId;
    }

    /**
     * This method sets the value of the database column show_counter.show_id
     * @param showId the value for show_counter.show_id
     * @mbg.generated
     */
    public void setShowId(Long showId) {
        this.showId = showId;
    }

    /**
     * This method returns the value of the database column show_counter.view_count
     * @return the value of show_counter.view_count
     * @mbg.generated
     */
    public Integer getViewCount() {
        return viewCount;
    }

    /**
     * This method sets the value of the database column show_counter.view_count
     * @param viewCount the value for show_counter.view_count
     * @mbg.generated
     */
    public void setViewCount(Integer viewCount) {
        this.viewCount = viewCount;
    }

    /**
     * This method returns the value of the database column show_counter.like_count
     * @return the value of show_counter.like_count
     * @mbg.generated
     */
    public Integer getLikeCount() {
        return likeCount;
    }

    /**
     * This method sets the value of the database column show_counter.like_count
     * @param likeCount the value for show_counter.like_count
     * @mbg.generated
     */
    public void setLikeCount(Integer likeCount) {
        this.likeCount = likeCount;
    }

    /**
     * This method returns the value of the database column show_counter.comment_count
     * @return the value of show_counter.comment_count
     * @mbg.generated
     */
    public Integer getCommentCount() {
        return commentCount;
    }

    /**
     * This method sets the value of the database column show_counter.comment_count
     * @param commentCount the value for show_counter.comment_count
     * @mbg.generated
     */
    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    /**
     * This method returns the value of the database column show_counter.gmt_create
     * @return the value of show_counter.gmt_create
     * @mbg.generated
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method sets the value of the database column show_counter.gmt_create
     * @param gmtCreate the value for show_counter.gmt_create
     * @mbg.generated
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method returns the value of the database column show_counter.gmt_modified
     * @return the value of show_counter.gmt_modified
     * @mbg.generated
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * This method sets the value of the database column show_counter.gmt_modified
     * @param gmtModified the value for show_counter.gmt_modified
     * @mbg.generated
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * This method returns the value of the database column show_counter.version
     * @return the value of show_counter.version
     * @mbg.generated
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * This method sets the value of the database column show_counter.version
     * @param version the value for show_counter.version
     * @mbg.generated
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * This method corresponds to the database table show_counter
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", showId=").append(showId);
        sb.append(", viewCount=").append(viewCount);
        sb.append(", likeCount=").append(likeCount);
        sb.append(", commentCount=").append(commentCount);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append(", version=").append(version);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}