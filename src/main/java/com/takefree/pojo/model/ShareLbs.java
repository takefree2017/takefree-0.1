package com.takefree.pojo.model;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * This class corresponds to the database table share_lbs
 * @mbg.generated do_not_delete_during_merge
 */
@Data
public class ShareLbs implements Serializable {
    /**
     * 分享id, 主键
     * @mbg.generated
     */
    private Long shareId;

    /**
     * 经度
     * @mbg.generated
     */
    private BigDecimal longitude;

    /**
     * 维度
     * @mbg.generated
     */
    private BigDecimal latitude;

    /**
     * 地址详情
     * @mbg.generated
     */
    private String lbsDescription;

    /**
     * This field corresponds to the database table share_lbs
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method corresponds to the database table share_lbs
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", shareId=").append(shareId);
        sb.append(", longitude=").append(longitude);
        sb.append(", latitude=").append(latitude);
        sb.append(", lbsDescription=").append(lbsDescription);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
