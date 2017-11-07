package com.takefree.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

@Data
public class TakeApplicationDO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     * take_application.id
     */
    private Long id;

    /**
     * 分享id
     * take_application.share_id
     */
    private Long shareId;

    /**
     * 分享人id
     * take_application.owner_id
     */
    private Long ownerId;

    /**
     * 申请人id
     * take_application.applicant_id
     */
    private Long applicantId;

    /**
     * 申请时间
     * take_application.apply_time
     */
    private LocalDateTime applyTime;

    /**
     * 交易类型, 10邮寄到付; 20见面交易; 30支持两种
     * take_application.apply_type
     */
    private Integer applyType;

    /**
     * 申请者邮寄地址id
     * take_application.address_id
     */
    private Long addressId;

    /**
     * 10未成交初始状态, 20被申请人take
     * take_application.status
     */
    private Integer status;

    /**
     * 记录插入时间
     * take_application.gmt_create
     */
    private LocalDateTime gmtCreate;

    /**
     * 最后修改时间
     * take_application.gmt_modified
     */
    private LocalDateTime gmtModified;

    /**
     * 记录版本号
     * take_application.version
     */
    private Integer version;

}
