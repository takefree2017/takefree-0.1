package com.takefree.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

@Data
public class LogisticsDO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     * logistics.id
     */
    private Long id;

    /**
     * take成交单号
     * logistics.order_id
     */
    private Long orderId;

    /**
     * 物流单号
     * logistics.logistics_number
     */
    private String logisticsNumber;

    /**
     * 物流状态, 10送货中; 20妥投
     * logistics.status
     */
    private Integer status;

    /**
     * 记录插入时间
     * logistics.gmt_create
     */
    private LocalDateTime gmtCreate;

    /**
     * 最后修改时间
     * logistics.gmt_modified
     */
    private LocalDateTime gmtModified;

    /**
     * 记录版本号
     * logistics.version
     */
    private Integer version;

}
