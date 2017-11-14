package com.takefree.model;

import java.io.Serializable;
import java.util.Date;

/**
 * This class corresponds to the database table show_comment
 * @mbg.generated do_not_delete_during_merge
 */
public class ShowComment implements Serializable {
    /**
     * 主键
     * @mbg.generated
     */
    private Long id;

    /**
     * 显摆id
     * @mbg.generated
     */
    private Long showId;

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
     * This field corresponds to the database table show_comment
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column show_comment.id
     * @return the value of show_comment.id
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method sets the value of the database column show_comment.id
     * @param id the value for show_comment.id
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column show_comment.show_id
     * @return the value of show_comment.show_id
     * @mbg.generated
     */
    public Long getShowId() {
        return showId;
    }

    /**
     * This method sets the value of the database column show_comment.show_id
     * @param showId the value for show_comment.show_id
     * @mbg.generated
     */
    public void setShowId(Long showId) {
        this.showId = showId;
    }

    /**
     * This method returns the value of the database column show_comment.parent_comment_id
     * @return the value of show_comment.parent_comment_id
     * @mbg.generated
     */
    public Long getParentCommentId() {
        return parentCommentId;
    }

    /**
     * This method sets the value of the database column show_comment.parent_comment_id
     * @param parentCommentId the value for show_comment.parent_comment_id
     * @mbg.generated
     */
    public void setParentCommentId(Long parentCommentId) {
        this.parentCommentId = parentCommentId;
    }

    /**
     * This method returns the value of the database column show_comment.user_id
     * @return the value of show_comment.user_id
     * @mbg.generated
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method sets the value of the database column show_comment.user_id
     * @param userId the value for show_comment.user_id
     * @mbg.generated
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method returns the value of the database column show_comment.content
     * @return the value of show_comment.content
     * @mbg.generated
     */
    public String getContent() {
        return content;
    }

    /**
     * This method sets the value of the database column show_comment.content
     * @param content the value for show_comment.content
     * @mbg.generated
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method returns the value of the database column show_comment.gmt_create
     * @return the value of show_comment.gmt_create
     * @mbg.generated
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method sets the value of the database column show_comment.gmt_create
     * @param gmtCreate the value for show_comment.gmt_create
     * @mbg.generated
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method returns the value of the database column show_comment.gmt_modified
     * @return the value of show_comment.gmt_modified
     * @mbg.generated
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * This method sets the value of the database column show_comment.gmt_modified
     * @param gmtModified the value for show_comment.gmt_modified
     * @mbg.generated
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * This method returns the value of the database column show_comment.version
     * @return the value of show_comment.version
     * @mbg.generated
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * This method sets the value of the database column show_comment.version
     * @param version the value for show_comment.version
     * @mbg.generated
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * This method corresponds to the database table show_comment
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", showId=").append(showId);
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