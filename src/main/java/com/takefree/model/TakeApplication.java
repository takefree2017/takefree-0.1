package com.takefree.model;

import java.io.Serializable;
import java.util.Date;

/**
 * This class corresponds to the database table take_application
 * @mbg.generated do_not_delete_during_merge
 */
public class TakeApplication implements Serializable {
    /**
     * 主键
     * @mbg.generated
     */
    private Long id;

    /**
     * 分享id
     * @mbg.generated
     */
    private Long shareId;

    /**
     * 分享人id
     * @mbg.generated
     */
    private Long ownerId;

    /**
     * 申请人id
     * @mbg.generated
     */
    private Long applicantId;

    /**
     * 申请时间
     * @mbg.generated
     */
    private Date applyTime;

    /**
     * 交易类型, 10邮寄到付; 20见面交易; 30支持两种
     * @mbg.generated
     */
    private Byte applyType;

    /**
     * 申请者邮寄地址id
     * @mbg.generated
     */
    private Long addressId;

    /**
     * 10未成交初始状态, 20被申请人take
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
     * This field corresponds to the database table take_application
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column take_application.id
     * @return the value of take_application.id
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method sets the value of the database column take_application.id
     * @param id the value for take_application.id
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column take_application.share_id
     * @return the value of take_application.share_id
     * @mbg.generated
     */
    public Long getShareId() {
        return shareId;
    }

    /**
     * This method sets the value of the database column take_application.share_id
     * @param shareId the value for take_application.share_id
     * @mbg.generated
     */
    public void setShareId(Long shareId) {
        this.shareId = shareId;
    }

    /**
     * This method returns the value of the database column take_application.owner_id
     * @return the value of take_application.owner_id
     * @mbg.generated
     */
    public Long getOwnerId() {
        return ownerId;
    }

    /**
     * This method sets the value of the database column take_application.owner_id
     * @param ownerId the value for take_application.owner_id
     * @mbg.generated
     */
    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * This method returns the value of the database column take_application.applicant_id
     * @return the value of take_application.applicant_id
     * @mbg.generated
     */
    public Long getApplicantId() {
        return applicantId;
    }

    /**
     * This method sets the value of the database column take_application.applicant_id
     * @param applicantId the value for take_application.applicant_id
     * @mbg.generated
     */
    public void setApplicantId(Long applicantId) {
        this.applicantId = applicantId;
    }

    /**
     * This method returns the value of the database column take_application.apply_time
     * @return the value of take_application.apply_time
     * @mbg.generated
     */
    public Date getApplyTime() {
        return applyTime;
    }

    /**
     * This method sets the value of the database column take_application.apply_time
     * @param applyTime the value for take_application.apply_time
     * @mbg.generated
     */
    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }

    /**
     * This method returns the value of the database column take_application.apply_type
     * @return the value of take_application.apply_type
     * @mbg.generated
     */
    public Byte getApplyType() {
        return applyType;
    }

    /**
     * This method sets the value of the database column take_application.apply_type
     * @param applyType the value for take_application.apply_type
     * @mbg.generated
     */
    public void setApplyType(Byte applyType) {
        this.applyType = applyType;
    }

    /**
     * This method returns the value of the database column take_application.address_id
     * @return the value of take_application.address_id
     * @mbg.generated
     */
    public Long getAddressId() {
        return addressId;
    }

    /**
     * This method sets the value of the database column take_application.address_id
     * @param addressId the value for take_application.address_id
     * @mbg.generated
     */
    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }

    /**
     * This method returns the value of the database column take_application.status
     * @return the value of take_application.status
     * @mbg.generated
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * This method sets the value of the database column take_application.status
     * @param status the value for take_application.status
     * @mbg.generated
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * This method returns the value of the database column take_application.gmt_create
     * @return the value of take_application.gmt_create
     * @mbg.generated
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method sets the value of the database column take_application.gmt_create
     * @param gmtCreate the value for take_application.gmt_create
     * @mbg.generated
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method returns the value of the database column take_application.gmt_modified
     * @return the value of take_application.gmt_modified
     * @mbg.generated
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * This method sets the value of the database column take_application.gmt_modified
     * @param gmtModified the value for take_application.gmt_modified
     * @mbg.generated
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * This method returns the value of the database column take_application.version
     * @return the value of take_application.version
     * @mbg.generated
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * This method sets the value of the database column take_application.version
     * @param version the value for take_application.version
     * @mbg.generated
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * This method corresponds to the database table take_application
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
        sb.append(", ownerId=").append(ownerId);
        sb.append(", applicantId=").append(applicantId);
        sb.append(", applyTime=").append(applyTime);
        sb.append(", applyType=").append(applyType);
        sb.append(", addressId=").append(addressId);
        sb.append(", status=").append(status);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append(", version=").append(version);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}