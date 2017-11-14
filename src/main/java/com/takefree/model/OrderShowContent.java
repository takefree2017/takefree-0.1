package com.takefree.model;

import java.io.Serializable;

/**
 * This class corresponds to the database table order_show_content
 * @mbg.generated do_not_delete_during_merge
 */
public class OrderShowContent implements Serializable {
    /**
     * 显摆id, 主键
     * @mbg.generated
     */
    private Long orderShowId;

    /**
     * 显摆详情
     * @mbg.generated
     */
    private String content;

    /**
     * This field corresponds to the database table order_show_content
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column order_show_content.order_show_id
     * @return the value of order_show_content.order_show_id
     * @mbg.generated
     */
    public Long getOrderShowId() {
        return orderShowId;
    }

    /**
     * This method sets the value of the database column order_show_content.order_show_id
     * @param orderShowId the value for order_show_content.order_show_id
     * @mbg.generated
     */
    public void setOrderShowId(Long orderShowId) {
        this.orderShowId = orderShowId;
    }

    /**
     * This method returns the value of the database column order_show_content.content
     * @return the value of order_show_content.content
     * @mbg.generated
     */
    public String getContent() {
        return content;
    }

    /**
     * This method sets the value of the database column order_show_content.content
     * @param content the value for order_show_content.content
     * @mbg.generated
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method corresponds to the database table order_show_content
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", orderShowId=").append(orderShowId);
        sb.append(", content=").append(content);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}