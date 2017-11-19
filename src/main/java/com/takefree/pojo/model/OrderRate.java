package com.takefree.pojo.model;

import lombok.Data;

import java.io.Serializable;

/**
 * This class corresponds to the database table order_rate
 * @mbg.generated do_not_delete_during_merge
 */
@Data
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
