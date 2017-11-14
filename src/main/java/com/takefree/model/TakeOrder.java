package com.takefree.model;

import java.io.Serializable;
import java.util.Date;

/**
 * This class corresponds to the database table take_order
 * @mbg.generated do_not_delete_during_merge
 */
public class TakeOrder implements Serializable {
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
     * 申请单id
     * @mbg.generated
     */
    private Long applicationId;

    /**
     * 分享送出时间
     * @mbg.generated
     */
    private Date takeTime;

    /**
     * 交易类型, 10邮寄到付; 20见面交易
     * @mbg.generated
     */
    private Byte takeType;

    /**
     * 申请者邮寄地址id
     * @mbg.generated
     */
    private Long addressId;

    /**
     * 物品或分享当前状态, 10初始状态; 20发布者已填运单号; 30申请人已评价; 40申请人已显摆; 40已评价并已显摆
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
     * This field corresponds to the database table take_order
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column take_order.id
     * @return the value of take_order.id
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method sets the value of the database column take_order.id
     * @param id the value for take_order.id
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column take_order.share_id
     * @return the value of take_order.share_id
     * @mbg.generated
     */
    public Long getShareId() {
        return shareId;
    }

    /**
     * This method sets the value of the database column take_order.share_id
     * @param shareId the value for take_order.share_id
     * @mbg.generated
     */
    public void setShareId(Long shareId) {
        this.shareId = shareId;
    }

    /**
     * This method returns the value of the database column take_order.owner_id
     * @return the value of take_order.owner_id
     * @mbg.generated
     */
    public Long getOwnerId() {
        return ownerId;
    }

    /**
     * This method sets the value of the database column take_order.owner_id
     * @param ownerId the value for take_order.owner_id
     * @mbg.generated
     */
    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * This method returns the value of the database column take_order.applicant_id
     * @return the value of take_order.applicant_id
     * @mbg.generated
     */
    public Long getApplicantId() {
        return applicantId;
    }

    /**
     * This method sets the value of the database column take_order.applicant_id
     * @param applicantId the value for take_order.applicant_id
     * @mbg.generated
     */
    public void setApplicantId(Long applicantId) {
        this.applicantId = applicantId;
    }

    /**
     * This method returns the value of the database column take_order.application_id
     * @return the value of take_order.application_id
     * @mbg.generated
     */
    public Long getApplicationId() {
        return applicationId;
    }

    /**
     * This method sets the value of the database column take_order.application_id
     * @param applicationId the value for take_order.application_id
     * @mbg.generated
     */
    public void setApplicationId(Long applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * This method returns the value of the database column take_order.take_time
     * @return the value of take_order.take_time
     * @mbg.generated
     */
    public Date getTakeTime() {
        return takeTime;
    }

    /**
     * This method sets the value of the database column take_order.take_time
     * @param takeTime the value for take_order.take_time
     * @mbg.generated
     */
    public void setTakeTime(Date takeTime) {
        this.takeTime = takeTime;
    }

    /**
     * This method returns the value of the database column take_order.take_type
     * @return the value of take_order.take_type
     * @mbg.generated
     */
    public Byte getTakeType() {
        return takeType;
    }

    /**
     * This method sets the value of the database column take_order.take_type
     * @param takeType the value for take_order.take_type
     * @mbg.generated
     */
    public void setTakeType(Byte takeType) {
        this.takeType = takeType;
    }

    /**
     * This method returns the value of the database column take_order.address_id
     * @return the value of take_order.address_id
     * @mbg.generated
     */
    public Long getAddressId() {
        return addressId;
    }

    /**
     * This method sets the value of the database column take_order.address_id
     * @param addressId the value for take_order.address_id
     * @mbg.generated
     */
    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }

    /**
     * This method returns the value of the database column take_order.status
     * @return the value of take_order.status
     * @mbg.generated
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * This method sets the value of the database column take_order.status
     * @param status the value for take_order.status
     * @mbg.generated
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * This method returns the value of the database column take_order.gmt_create
     * @return the value of take_order.gmt_create
     * @mbg.generated
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method sets the value of the database column take_order.gmt_create
     * @param gmtCreate the value for take_order.gmt_create
     * @mbg.generated
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method returns the value of the database column take_order.gmt_modified
     * @return the value of take_order.gmt_modified
     * @mbg.generated
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * This method sets the value of the database column take_order.gmt_modified
     * @param gmtModified the value for take_order.gmt_modified
     * @mbg.generated
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * This method returns the value of the database column take_order.version
     * @return the value of take_order.version
     * @mbg.generated
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * This method sets the value of the database column take_order.version
     * @param version the value for take_order.version
     * @mbg.generated
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * This method corresponds to the database table take_order
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
        sb.append(", applicationId=").append(applicationId);
        sb.append(", takeTime=").append(takeTime);
        sb.append(", takeType=").append(takeType);
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