package com.takefree.model;

import java.io.Serializable;
import java.util.Date;

/**
 * This class corresponds to the database table show_like
 * @mbg.generated do_not_delete_during_merge
 */
public class ShowLike implements Serializable {
    /**
     * 主键
     * @mbg.generated
     */
    private Long id;

    /**
     * 被like的显摆id
     * @mbg.generated
     */
    private Long showId;

    /**
     * 发起like的用户id
     * @mbg.generated
     */
    private Long userId;

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
     * This field corresponds to the database table show_like
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column show_like.id
     * @return the value of show_like.id
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method sets the value of the database column show_like.id
     * @param id the value for show_like.id
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column show_like.show_id
     * @return the value of show_like.show_id
     * @mbg.generated
     */
    public Long getShowId() {
        return showId;
    }

    /**
     * This method sets the value of the database column show_like.show_id
     * @param showId the value for show_like.show_id
     * @mbg.generated
     */
    public void setShowId(Long showId) {
        this.showId = showId;
    }

    /**
     * This method returns the value of the database column show_like.user_id
     * @return the value of show_like.user_id
     * @mbg.generated
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method sets the value of the database column show_like.user_id
     * @param userId the value for show_like.user_id
     * @mbg.generated
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method returns the value of the database column show_like.gmt_create
     * @return the value of show_like.gmt_create
     * @mbg.generated
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method sets the value of the database column show_like.gmt_create
     * @param gmtCreate the value for show_like.gmt_create
     * @mbg.generated
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method returns the value of the database column show_like.gmt_modified
     * @return the value of show_like.gmt_modified
     * @mbg.generated
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * This method sets the value of the database column show_like.gmt_modified
     * @param gmtModified the value for show_like.gmt_modified
     * @mbg.generated
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * This method returns the value of the database column show_like.version
     * @return the value of show_like.version
     * @mbg.generated
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * This method sets the value of the database column show_like.version
     * @param version the value for show_like.version
     * @mbg.generated
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * This method corresponds to the database table show_like
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
        sb.append(", userId=").append(userId);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append(", version=").append(version);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}