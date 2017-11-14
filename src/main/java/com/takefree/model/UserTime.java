package com.takefree.model;

import java.io.Serializable;
import java.util.Date;

/**
 * This class corresponds to the database table user_time
 * @mbg.generated do_not_delete_during_merge
 */
public class UserTime implements Serializable {
    /**
     * 用户id, 主键
     * @mbg.generated
     */
    private Long userId;

    /**
     * 用户创建时间
     * @mbg.generated
     */
    private Date createTime;

    /**
     * 最后登录时间
     * @mbg.generated
     */
    private Date lastloginTime;

    /**
     * 记录版本号
     * @mbg.generated
     */
    private Integer version;

    /**
     * This field corresponds to the database table user_time
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column user_time.user_id
     * @return the value of user_time.user_id
     * @mbg.generated
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method sets the value of the database column user_time.user_id
     * @param userId the value for user_time.user_id
     * @mbg.generated
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method returns the value of the database column user_time.create_time
     * @return the value of user_time.create_time
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method sets the value of the database column user_time.create_time
     * @param createTime the value for user_time.create_time
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method returns the value of the database column user_time.lastlogin_time
     * @return the value of user_time.lastlogin_time
     * @mbg.generated
     */
    public Date getLastloginTime() {
        return lastloginTime;
    }

    /**
     * This method sets the value of the database column user_time.lastlogin_time
     * @param lastloginTime the value for user_time.lastlogin_time
     * @mbg.generated
     */
    public void setLastloginTime(Date lastloginTime) {
        this.lastloginTime = lastloginTime;
    }

    /**
     * This method returns the value of the database column user_time.version
     * @return the value of user_time.version
     * @mbg.generated
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * This method sets the value of the database column user_time.version
     * @param version the value for user_time.version
     * @mbg.generated
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * This method corresponds to the database table user_time
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", createTime=").append(createTime);
        sb.append(", lastloginTime=").append(lastloginTime);
        sb.append(", version=").append(version);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}