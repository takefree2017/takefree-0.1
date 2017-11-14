package com.takefree.model;

import java.io.Serializable;
import java.util.Date;

/**
 * This class corresponds to the database table order_show
 * @mbg.generated do_not_delete_during_merge
 */
public class OrderShow implements Serializable {
    /**
     * 主键
     * @mbg.generated
     */
    private Long id;

    /**
     * take成交单号
     * @mbg.generated
     */
    private Long orderId;

    /**
     * 被赠者id
     * @mbg.generated
     */
    private Long receiverId;

    /**
     * 赠送者id
     * @mbg.generated
     */
    private Long giverId;

    /**
     * 心情图标id
     * @mbg.generated
     */
    private Integer moodId;

    /**
     * 显摆缩略描述
     * @mbg.generated
     */
    private String showContentPreview;

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
     * This field corresponds to the database table order_show
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column order_show.id
     * @return the value of order_show.id
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method sets the value of the database column order_show.id
     * @param id the value for order_show.id
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column order_show.order_id
     * @return the value of order_show.order_id
     * @mbg.generated
     */
    public Long getOrderId() {
        return orderId;
    }

    /**
     * This method sets the value of the database column order_show.order_id
     * @param orderId the value for order_show.order_id
     * @mbg.generated
     */
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    /**
     * This method returns the value of the database column order_show.receiver_id
     * @return the value of order_show.receiver_id
     * @mbg.generated
     */
    public Long getReceiverId() {
        return receiverId;
    }

    /**
     * This method sets the value of the database column order_show.receiver_id
     * @param receiverId the value for order_show.receiver_id
     * @mbg.generated
     */
    public void setReceiverId(Long receiverId) {
        this.receiverId = receiverId;
    }

    /**
     * This method returns the value of the database column order_show.giver_id
     * @return the value of order_show.giver_id
     * @mbg.generated
     */
    public Long getGiverId() {
        return giverId;
    }

    /**
     * This method sets the value of the database column order_show.giver_id
     * @param giverId the value for order_show.giver_id
     * @mbg.generated
     */
    public void setGiverId(Long giverId) {
        this.giverId = giverId;
    }

    /**
     * This method returns the value of the database column order_show.mood_id
     * @return the value of order_show.mood_id
     * @mbg.generated
     */
    public Integer getMoodId() {
        return moodId;
    }

    /**
     * This method sets the value of the database column order_show.mood_id
     * @param moodId the value for order_show.mood_id
     * @mbg.generated
     */
    public void setMoodId(Integer moodId) {
        this.moodId = moodId;
    }

    /**
     * This method returns the value of the database column order_show.show_content_preview
     * @return the value of order_show.show_content_preview
     * @mbg.generated
     */
    public String getShowContentPreview() {
        return showContentPreview;
    }

    /**
     * This method sets the value of the database column order_show.show_content_preview
     * @param showContentPreview the value for order_show.show_content_preview
     * @mbg.generated
     */
    public void setShowContentPreview(String showContentPreview) {
        this.showContentPreview = showContentPreview == null ? null : showContentPreview.trim();
    }

    /**
     * This method returns the value of the database column order_show.gmt_create
     * @return the value of order_show.gmt_create
     * @mbg.generated
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method sets the value of the database column order_show.gmt_create
     * @param gmtCreate the value for order_show.gmt_create
     * @mbg.generated
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method returns the value of the database column order_show.gmt_modified
     * @return the value of order_show.gmt_modified
     * @mbg.generated
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * This method sets the value of the database column order_show.gmt_modified
     * @param gmtModified the value for order_show.gmt_modified
     * @mbg.generated
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * This method returns the value of the database column order_show.version
     * @return the value of order_show.version
     * @mbg.generated
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * This method sets the value of the database column order_show.version
     * @param version the value for order_show.version
     * @mbg.generated
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * This method corresponds to the database table order_show
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", orderId=").append(orderId);
        sb.append(", receiverId=").append(receiverId);
        sb.append(", giverId=").append(giverId);
        sb.append(", moodId=").append(moodId);
        sb.append(", showContentPreview=").append(showContentPreview);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append(", version=").append(version);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}