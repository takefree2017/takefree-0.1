package com.takefree.model;

import java.io.Serializable;
import java.util.Date;

/**
 * This class corresponds to the database table user_description
 * @mbg.generated do_not_delete_during_merge
 */
public class UserDescription implements Serializable {
    /**
     * 用户id, 主键
     * @mbg.generated
     */
    private Long userId;

    /**
     * 用户简介
     * @mbg.generated
     */
    private String description;

    /**
     * 记录版本号
     * @mbg.generated
     */
    private Integer version;

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
     * This field corresponds to the database table user_description
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column user_description.user_id
     * @return the value of user_description.user_id
     * @mbg.generated
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method sets the value of the database column user_description.user_id
     * @param userId the value for user_description.user_id
     * @mbg.generated
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method returns the value of the database column user_description.description
     * @return the value of user_description.description
     * @mbg.generated
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method sets the value of the database column user_description.description
     * @param description the value for user_description.description
     * @mbg.generated
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method returns the value of the database column user_description.version
     * @return the value of user_description.version
     * @mbg.generated
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * This method sets the value of the database column user_description.version
     * @param version the value for user_description.version
     * @mbg.generated
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * This method returns the value of the database column user_description.gmt_create
     * @return the value of user_description.gmt_create
     * @mbg.generated
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method sets the value of the database column user_description.gmt_create
     * @param gmtCreate the value for user_description.gmt_create
     * @mbg.generated
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method returns the value of the database column user_description.gmt_modified
     * @return the value of user_description.gmt_modified
     * @mbg.generated
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * This method sets the value of the database column user_description.gmt_modified
     * @param gmtModified the value for user_description.gmt_modified
     * @mbg.generated
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * This method corresponds to the database table user_description
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", description=").append(description);
        sb.append(", version=").append(version);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}