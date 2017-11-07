package com.takefree.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

@Data
public class ShareLbsDO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 分享id, 主键
     * share_lbs.share_id
     */
    private Long shareId;

    /**
     * 经度
     * share_lbs.longitude
     */
    private java.math.BigDecimal longitude;

    /**
     * 维度
     * share_lbs.latitude
     */
    private java.math.BigDecimal latitude;

    /**
     * 地址详情
     * share_lbs.lbs_description
     */
    private String lbsDescription;

}
