package com.takefree.model;

import java.io.Serializable;
import java.util.Date;

/**
 * This class corresponds to the database table user_like
 * @mbg.generated do_not_delete_during_merge
 */
public class UserLike implements Serializable {
    /**
     * 主键
     * @mbg.generated
     */
    private Long id;

    /**
     * 被like的用户id
     * @mbg.generated
     */
    private Long userFolloweeId;

    /**
     * 发起like的用户id
     * @mbg.generated
     */
    private Long userFollowerId;

    /**
     * 1正常; 0已取消
     * @mbg.generated
     */
    private Byte status;

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
     * This field corresponds to the database table user_like
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column user_like.id
     * @return the value of user_like.id
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method sets the value of the database column user_like.id
     * @param id the value for user_like.id
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column user_like.user_followee_id
     * @return the value of user_like.user_followee_id
     * @mbg.generated
     */
    public Long getUserFolloweeId() {
        return userFolloweeId;
    }

    /**
     * This method sets the value of the database column user_like.user_followee_id
     * @param userFolloweeId the value for user_like.user_followee_id
     * @mbg.generated
     */
    public void setUserFolloweeId(Long userFolloweeId) {
        this.userFolloweeId = userFolloweeId;
    }

    /**
     * This method returns the value of the database column user_like.user_follower_id
     * @return the value of user_like.user_follower_id
     * @mbg.generated
     */
    public Long getUserFollowerId() {
        return userFollowerId;
    }

    /**
     * This method sets the value of the database column user_like.user_follower_id
     * @param userFollowerId the value for user_like.user_follower_id
     * @mbg.generated
     */
    public void setUserFollowerId(Long userFollowerId) {
        this.userFollowerId = userFollowerId;
    }

    /**
     * This method returns the value of the database column user_like.status
     * @return the value of user_like.status
     * @mbg.generated
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * This method sets the value of the database column user_like.status
     * @param status the value for user_like.status
     * @mbg.generated
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * This method returns the value of the database column user_like.gmt_create
     * @return the value of user_like.gmt_create
     * @mbg.generated
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method sets the value of the database column user_like.gmt_create
     * @param gmtCreate the value for user_like.gmt_create
     * @mbg.generated
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method returns the value of the database column user_like.gmt_modified
     * @return the value of user_like.gmt_modified
     * @mbg.generated
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * This method sets the value of the database column user_like.gmt_modified
     * @param gmtModified the value for user_like.gmt_modified
     * @mbg.generated
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * This method returns the value of the database column user_like.version
     * @return the value of user_like.version
     * @mbg.generated
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * This method sets the value of the database column user_like.version
     * @param version the value for user_like.version
     * @mbg.generated
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * This method corresponds to the database table user_like
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userFolloweeId=").append(userFolloweeId);
        sb.append(", userFollowerId=").append(userFollowerId);
        sb.append(", status=").append(status);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append(", version=").append(version);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}