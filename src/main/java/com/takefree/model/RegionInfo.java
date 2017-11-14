package com.takefree.model;

import java.io.Serializable;
import java.util.Date;

/**
 * This class corresponds to the database table region_info
 * @mbg.generated do_not_delete_during_merge
 */
public class RegionInfo implements Serializable {
    /**
     * 主键
     * @mbg.generated
     */
    private Long id;

    /**
     * 地区名称
     * @mbg.generated
     */
    private String regionName;

    /**
     * 层级, 10第一层; 20第二层
     * @mbg.generated
     */
    private Byte layer;

    /**
     * 父层级的region_id
     * @mbg.generated
     */
    private Long parentRegionId;

    /**
     * 记录插入时间
     * @mbg.generated
     */
    private Date gmtCreate;

    /**
     * 最后修改时间
     * @mbg.generated
     */
    private Date gmtModified;

    /**
     * 记录版本号
     * @mbg.generated
     */
    private Integer version;

    /**
     * This field corresponds to the database table region_info
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column region_info.id
     * @return the value of region_info.id
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method sets the value of the database column region_info.id
     * @param id the value for region_info.id
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column region_info.region_name
     * @return the value of region_info.region_name
     * @mbg.generated
     */
    public String getRegionName() {
        return regionName;
    }

    /**
     * This method sets the value of the database column region_info.region_name
     * @param regionName the value for region_info.region_name
     * @mbg.generated
     */
    public void setRegionName(String regionName) {
        this.regionName = regionName == null ? null : regionName.trim();
    }

    /**
     * This method returns the value of the database column region_info.layer
     * @return the value of region_info.layer
     * @mbg.generated
     */
    public Byte getLayer() {
        return layer;
    }

    /**
     * This method sets the value of the database column region_info.layer
     * @param layer the value for region_info.layer
     * @mbg.generated
     */
    public void setLayer(Byte layer) {
        this.layer = layer;
    }

    /**
     * This method returns the value of the database column region_info.parent_region_id
     * @return the value of region_info.parent_region_id
     * @mbg.generated
     */
    public Long getParentRegionId() {
        return parentRegionId;
    }

    /**
     * This method sets the value of the database column region_info.parent_region_id
     * @param parentRegionId the value for region_info.parent_region_id
     * @mbg.generated
     */
    public void setParentRegionId(Long parentRegionId) {
        this.parentRegionId = parentRegionId;
    }

    /**
     * This method returns the value of the database column region_info.gmt_create
     * @return the value of region_info.gmt_create
     * @mbg.generated
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method sets the value of the database column region_info.gmt_create
     * @param gmtCreate the value for region_info.gmt_create
     * @mbg.generated
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method returns the value of the database column region_info.gmt_modified
     * @return the value of region_info.gmt_modified
     * @mbg.generated
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * This method sets the value of the database column region_info.gmt_modified
     * @param gmtModified the value for region_info.gmt_modified
     * @mbg.generated
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * This method returns the value of the database column region_info.version
     * @return the value of region_info.version
     * @mbg.generated
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * This method sets the value of the database column region_info.version
     * @param version the value for region_info.version
     * @mbg.generated
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * This method corresponds to the database table region_info
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", regionName=").append(regionName);
        sb.append(", layer=").append(layer);
        sb.append(", parentRegionId=").append(parentRegionId);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append(", version=").append(version);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}