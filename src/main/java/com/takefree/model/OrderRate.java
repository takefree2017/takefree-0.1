package com.takefree.model;

import java.io.Serializable;

/**
 * This class corresponds to the database table order_rate
 * @mbg.generated do_not_delete_during_merge
 */
public class OrderRate implements Serializable {
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
     * 评价, 1好评 0差评
     * @mbg.generated
     */
    private Byte rate;

    /**
     * 评价内容
     * @mbg.generated
     */
    private String rateComment;

    /**
     * This field corresponds to the database table order_rate
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column order_rate.id
     * @return the value of order_rate.id
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method sets the value of the database column order_rate.id
     * @param id the value for order_rate.id
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column order_rate.order_id
     * @return the value of order_rate.order_id
     * @mbg.generated
     */
    public Long getOrderId() {
        return orderId;
    }

    /**
     * This method sets the value of the database column order_rate.order_id
     * @param orderId the value for order_rate.order_id
     * @mbg.generated
     */
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    /**
     * This method returns the value of the database column order_rate.receiver_id
     * @return the value of order_rate.receiver_id
     * @mbg.generated
     */
    public Long getReceiverId() {
        return receiverId;
    }

    /**
     * This method sets the value of the database column order_rate.receiver_id
     * @param receiverId the value for order_rate.receiver_id
     * @mbg.generated
     */
    public void setReceiverId(Long receiverId) {
        this.receiverId = receiverId;
    }

    /**
     * This method returns the value of the database column order_rate.rate
     * @return the value of order_rate.rate
     * @mbg.generated
     */
    public Byte getRate() {
        return rate;
    }

    /**
     * This method sets the value of the database column order_rate.rate
     * @param rate the value for order_rate.rate
     * @mbg.generated
     */
    public void setRate(Byte rate) {
        this.rate = rate;
    }

    /**
     * This method returns the value of the database column order_rate.rate_comment
     * @return the value of order_rate.rate_comment
     * @mbg.generated
     */
    public String getRateComment() {
        return rateComment;
    }

    /**
     * This method sets the value of the database column order_rate.rate_comment
     * @param rateComment the value for order_rate.rate_comment
     * @mbg.generated
     */
    public void setRateComment(String rateComment) {
        this.rateComment = rateComment == null ? null : rateComment.trim();
    }

    /**
     * This method corresponds to the database table order_rate
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
        sb.append(", rate=").append(rate);
        sb.append(", rateComment=").append(rateComment);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}