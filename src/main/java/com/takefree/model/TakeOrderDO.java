package com.takefree.model;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class TakeOrderDO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     * take_order.id
     */
    private Long id;

    /**
     * 分享id
     * take_order.share_id
     */
    private Long shareId;

    /**
     * 分享人id
     * take_order.owner_id
     */
    private Long ownerId;

    /**
     * 申请人id
     * take_order.applicant_id
     */
    private Long applicantId;

    /**
     * 申请单id
     * take_order.application_id
     */
    private Long applicationId;

    /**
     * 分享送出时间
     * take_order.take_time
     */
    private LocalDateTime takeTime;

    /**
     * 交易类型, 10邮寄到付; 20见面交易
     * take_order.take_type
     */
    private Integer takeType;

    /**
     * 申请者邮寄地址id
     * take_order.address_id
     */
    private Long addressId;

    /**
     * 物品或分享当前状态, 10初始状态; 20发布者已填运单号; 30申请人已评价; 40申请人已显摆; 40已评价并已显摆
     * take_order.status
     */
    private Integer status;

    /**
     * 记录插入时间
     * take_order.gmt_create
     */
    private LocalDateTime gmtCreate;

    /**
     * 最后修改时间
     * take_order.gmt_update
     */
    private LocalDateTime gmtModified;

    /**
     * 记录版本号
     * take_order.version
     */
    private Integer version;

}
