package com.takefree.model;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * This class corresponds to the database table share_lbs
 * @mbg.generated do_not_delete_during_merge
 */
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
     * This method returns the value of the database column share_lbs.share_id
     * @return the value of share_lbs.share_id
     * @mbg.generated
     */
    public Long getShareId() {
        return shareId;
    }

    /**
     * This method sets the value of the database column share_lbs.share_id
     * @param shareId the value for share_lbs.share_id
     * @mbg.generated
     */
    public void setShareId(Long shareId) {
        this.shareId = shareId;
    }

    /**
     * This method returns the value of the database column share_lbs.longitude
     * @return the value of share_lbs.longitude
     * @mbg.generated
     */
    public BigDecimal getLongitude() {
        return longitude;
    }

    /**
     * This method sets the value of the database column share_lbs.longitude
     * @param longitude the value for share_lbs.longitude
     * @mbg.generated
     */
    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    /**
     * This method returns the value of the database column share_lbs.latitude
     * @return the value of share_lbs.latitude
     * @mbg.generated
     */
    public BigDecimal getLatitude() {
        return latitude;
    }

    /**
     * This method sets the value of the database column share_lbs.latitude
     * @param latitude the value for share_lbs.latitude
     * @mbg.generated
     */
    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    /**
     * This method returns the value of the database column share_lbs.lbs_description
     * @return the value of share_lbs.lbs_description
     * @mbg.generated
     */
    public String getLbsDescription() {
        return lbsDescription;
    }

    /**
     * This method sets the value of the database column share_lbs.lbs_description
     * @param lbsDescription the value for share_lbs.lbs_description
     * @mbg.generated
     */
    public void setLbsDescription(String lbsDescription) {
        this.lbsDescription = lbsDescription == null ? null : lbsDescription.trim();
    }

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