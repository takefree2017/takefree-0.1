package com.takefree.model;

import java.io.Serializable;
import java.util.Date;

/**
 * This class corresponds to the database table complaint
 * @mbg.generated do_not_delete_during_merge
 */
public class Complaint implements Serializable {
    /**
     * 主键
     * @mbg.generated
     */
    private Long id;

    /**
     * 被投诉的分享id
     * @mbg.generated
     */
    private Long shareId;

    /**
     * 发起投诉的用户id
     * @mbg.generated
     */
    private Long submitterId;

    /**
     * 被投诉的用户id
     * @mbg.generated
     */
    private Long receiverId;

    /**
     * 投诉类型, 10对分享投诉, 20对用户投诉
     * @mbg.generated
     */
    private Byte type;

    /**
     * 投诉内容
     * @mbg.generated
     */
    private String content;

    /**
     * 投诉状态, 0待处理; 1已处理
     * @mbg.generated
     */
    private Byte status;

    /**
     * 处理结果
     * @mbg.generated
     */
    private String complaintResult;

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
     * This field corresponds to the database table complaint
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column complaint.id
     * @return the value of complaint.id
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method sets the value of the database column complaint.id
     * @param id the value for complaint.id
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column complaint.share_id
     * @return the value of complaint.share_id
     * @mbg.generated
     */
    public Long getShareId() {
        return shareId;
    }

    /**
     * This method sets the value of the database column complaint.share_id
     * @param shareId the value for complaint.share_id
     * @mbg.generated
     */
    public void setShareId(Long shareId) {
        this.shareId = shareId;
    }

    /**
     * This method returns the value of the database column complaint.submitter_id
     * @return the value of complaint.submitter_id
     * @mbg.generated
     */
    public Long getSubmitterId() {
        return submitterId;
    }

    /**
     * This method sets the value of the database column complaint.submitter_id
     * @param submitterId the value for complaint.submitter_id
     * @mbg.generated
     */
    public void setSubmitterId(Long submitterId) {
        this.submitterId = submitterId;
    }

    /**
     * This method returns the value of the database column complaint.receiver_id
     * @return the value of complaint.receiver_id
     * @mbg.generated
     */
    public Long getReceiverId() {
        return receiverId;
    }

    /**
     * This method sets the value of the database column complaint.receiver_id
     * @param receiverId the value for complaint.receiver_id
     * @mbg.generated
     */
    public void setReceiverId(Long receiverId) {
        this.receiverId = receiverId;
    }

    /**
     * This method returns the value of the database column complaint.type
     * @return the value of complaint.type
     * @mbg.generated
     */
    public Byte getType() {
        return type;
    }

    /**
     * This method sets the value of the database column complaint.type
     * @param type the value for complaint.type
     * @mbg.generated
     */
    public void setType(Byte type) {
        this.type = type;
    }

    /**
     * This method returns the value of the database column complaint.content
     * @return the value of complaint.content
     * @mbg.generated
     */
    public String getContent() {
        return content;
    }

    /**
     * This method sets the value of the database column complaint.content
     * @param content the value for complaint.content
     * @mbg.generated
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method returns the value of the database column complaint.status
     * @return the value of complaint.status
     * @mbg.generated
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * This method sets the value of the database column complaint.status
     * @param status the value for complaint.status
     * @mbg.generated
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * This method returns the value of the database column complaint.complaint_result
     * @return the value of complaint.complaint_result
     * @mbg.generated
     */
    public String getComplaintResult() {
        return complaintResult;
    }

    /**
     * This method sets the value of the database column complaint.complaint_result
     * @param complaintResult the value for complaint.complaint_result
     * @mbg.generated
     */
    public void setComplaintResult(String complaintResult) {
        this.complaintResult = complaintResult == null ? null : complaintResult.trim();
    }

    /**
     * This method returns the value of the database column complaint.gmt_create
     * @return the value of complaint.gmt_create
     * @mbg.generated
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method sets the value of the database column complaint.gmt_create
     * @param gmtCreate the value for complaint.gmt_create
     * @mbg.generated
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method returns the value of the database column complaint.gmt_modified
     * @return the value of complaint.gmt_modified
     * @mbg.generated
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * This method sets the value of the database column complaint.gmt_modified
     * @param gmtModified the value for complaint.gmt_modified
     * @mbg.generated
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * This method returns the value of the database column complaint.version
     * @return the value of complaint.version
     * @mbg.generated
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * This method sets the value of the database column complaint.version
     * @param version the value for complaint.version
     * @mbg.generated
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * This method corresponds to the database table complaint
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
        sb.append(", submitterId=").append(submitterId);
        sb.append(", receiverId=").append(receiverId);
        sb.append(", type=").append(type);
        sb.append(", content=").append(content);
        sb.append(", status=").append(status);
        sb.append(", complaintResult=").append(complaintResult);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append(", version=").append(version);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}