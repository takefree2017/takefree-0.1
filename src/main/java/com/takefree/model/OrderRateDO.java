package com.takefree.model;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class OrderRateDO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     * order_rate.id
     */
    private Long id;

    /**
     * take成交单号
     * order_rate.order_id
     */
    private Long orderId;

    /**
     * 被赠者id
     * order_rate.receiver_id
     */
    private Long receiverId;

    /**
     * 评价, 1好评 0差评
     * order_rate.rate
     */
    private Integer rate;

    /**
     * 评价内容
     * order_rate.rate_comment
     */
    private String rateComment;

}
