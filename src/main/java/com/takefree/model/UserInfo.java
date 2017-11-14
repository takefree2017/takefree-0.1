package com.takefree.model;

import java.io.Serializable;
import java.util.Date;

/**
 * This class corresponds to the database table user_info
 * @mbg.generated do_not_delete_during_merge
 */
public class UserInfo implements Serializable {
    /**
     * 用户id, 主键
     * @mbg.generated
     */
    private Long id;

    /**
     * 昵称
     * @mbg.generated
     */
    private String nickName;

    /**
     * 真名
     * @mbg.generated
     */
    private String realName;

    /**
     * 手机
     * @mbg.generated
     */
    private String mobile;

    /**
     * 邮箱
     * @mbg.generated
     */
    private String email;

    /**
     * 推荐人id
     * @mbg.generated
     */
    private Long endorserId;

    /**
     * 密码
     * @mbg.generated
     */
    private String password;

    /**
     * 用户状态:10未激活/20已激活
     * @mbg.generated
     */
    private Byte status;

    /**
     * 小头像
     * @mbg.generated
     */
    private String smallIcon;

    /**
     * 大头像
     * @mbg.generated
     */
    private String bigIcon;

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
     * This field corresponds to the database table user_info
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column user_info.id
     * @return the value of user_info.id
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method sets the value of the database column user_info.id
     * @param id the value for user_info.id
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column user_info.nick_name
     * @return the value of user_info.nick_name
     * @mbg.generated
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * This method sets the value of the database column user_info.nick_name
     * @param nickName the value for user_info.nick_name
     * @mbg.generated
     */
    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    /**
     * This method returns the value of the database column user_info.real_name
     * @return the value of user_info.real_name
     * @mbg.generated
     */
    public String getRealName() {
        return realName;
    }

    /**
     * This method sets the value of the database column user_info.real_name
     * @param realName the value for user_info.real_name
     * @mbg.generated
     */
    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    /**
     * This method returns the value of the database column user_info.mobile
     * @return the value of user_info.mobile
     * @mbg.generated
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * This method sets the value of the database column user_info.mobile
     * @param mobile the value for user_info.mobile
     * @mbg.generated
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     * This method returns the value of the database column user_info.email
     * @return the value of user_info.email
     * @mbg.generated
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method sets the value of the database column user_info.email
     * @param email the value for user_info.email
     * @mbg.generated
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method returns the value of the database column user_info.endorser_id
     * @return the value of user_info.endorser_id
     * @mbg.generated
     */
    public Long getEndorserId() {
        return endorserId;
    }

    /**
     * This method sets the value of the database column user_info.endorser_id
     * @param endorserId the value for user_info.endorser_id
     * @mbg.generated
     */
    public void setEndorserId(Long endorserId) {
        this.endorserId = endorserId;
    }

    /**
     * This method returns the value of the database column user_info.password
     * @return the value of user_info.password
     * @mbg.generated
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method sets the value of the database column user_info.password
     * @param password the value for user_info.password
     * @mbg.generated
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method returns the value of the database column user_info.status
     * @return the value of user_info.status
     * @mbg.generated
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * This method sets the value of the database column user_info.status
     * @param status the value for user_info.status
     * @mbg.generated
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * This method returns the value of the database column user_info.small_icon
     * @return the value of user_info.small_icon
     * @mbg.generated
     */
    public String getSmallIcon() {
        return smallIcon;
    }

    /**
     * This method sets the value of the database column user_info.small_icon
     * @param smallIcon the value for user_info.small_icon
     * @mbg.generated
     */
    public void setSmallIcon(String smallIcon) {
        this.smallIcon = smallIcon == null ? null : smallIcon.trim();
    }

    /**
     * This method returns the value of the database column user_info.big_icon
     * @return the value of user_info.big_icon
     * @mbg.generated
     */
    public String getBigIcon() {
        return bigIcon;
    }

    /**
     * This method sets the value of the database column user_info.big_icon
     * @param bigIcon the value for user_info.big_icon
     * @mbg.generated
     */
    public void setBigIcon(String bigIcon) {
        this.bigIcon = bigIcon == null ? null : bigIcon.trim();
    }

    /**
     * This method returns the value of the database column user_info.version
     * @return the value of user_info.version
     * @mbg.generated
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * This method sets the value of the database column user_info.version
     * @param version the value for user_info.version
     * @mbg.generated
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * This method returns the value of the database column user_info.gmt_create
     * @return the value of user_info.gmt_create
     * @mbg.generated
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method sets the value of the database column user_info.gmt_create
     * @param gmtCreate the value for user_info.gmt_create
     * @mbg.generated
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method returns the value of the database column user_info.gmt_modified
     * @return the value of user_info.gmt_modified
     * @mbg.generated
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * This method sets the value of the database column user_info.gmt_modified
     * @param gmtModified the value for user_info.gmt_modified
     * @mbg.generated
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * This method corresponds to the database table user_info
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", nickName=").append(nickName);
        sb.append(", realName=").append(realName);
        sb.append(", mobile=").append(mobile);
        sb.append(", email=").append(email);
        sb.append(", endorserId=").append(endorserId);
        sb.append(", password=").append(password);
        sb.append(", status=").append(status);
        sb.append(", smallIcon=").append(smallIcon);
        sb.append(", bigIcon=").append(bigIcon);
        sb.append(", version=").append(version);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}