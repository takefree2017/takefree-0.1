package com.takefree.model;

import java.io.Serializable;
import java.util.Date;

/**
 * This class corresponds to the database table logistics
 * @mbg.generated do_not_delete_during_merge
 */
public class Logistics implements Serializable {
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
     * 物流单号
     * @mbg.generated
     */
    private String logisticsNumber;

    /**
     * 物流状态, 10送货中; 20妥投
     * @mbg.generated
     */
    private Byte status;

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
     * This field corresponds to the database table logistics
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column logistics.id
     * @return the value of logistics.id
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method sets the value of the database column logistics.id
     * @param id the value for logistics.id
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column logistics.order_id
     * @return the value of logistics.order_id
     * @mbg.generated
     */
    public Long getOrderId() {
        return orderId;
    }

    /**
     * This method sets the value of the database column logistics.order_id
     * @param orderId the value for logistics.order_id
     * @mbg.generated
     */
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    /**
     * This method returns the value of the database column logistics.logistics_number
     * @return the value of logistics.logistics_number
     * @mbg.generated
     */
    public String getLogisticsNumber() {
        return logisticsNumber;
    }

    /**
     * This method sets the value of the database column logistics.logistics_number
     * @param logisticsNumber the value for logistics.logistics_number
     * @mbg.generated
     */
    public void setLogisticsNumber(String logisticsNumber) {
        this.logisticsNumber = logisticsNumber == null ? null : logisticsNumber.trim();
    }

    /**
     * This method returns the value of the database column logistics.status
     * @return the value of logistics.status
     * @mbg.generated
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * This method sets the value of the database column logistics.status
     * @param status the value for logistics.status
     * @mbg.generated
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * This method returns the value of the database column logistics.gmt_create
     * @return the value of logistics.gmt_create
     * @mbg.generated
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method sets the value of the database column logistics.gmt_create
     * @param gmtCreate the value for logistics.gmt_create
     * @mbg.generated
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method returns the value of the database column logistics.gmt_modified
     * @return the value of logistics.gmt_modified
     * @mbg.generated
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * This method sets the value of the database column logistics.gmt_modified
     * @param gmtModified the value for logistics.gmt_modified
     * @mbg.generated
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * This method returns the value of the database column logistics.version
     * @return the value of logistics.version
     * @mbg.generated
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * This method sets the value of the database column logistics.version
     * @param version the value for logistics.version
     * @mbg.generated
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * This method corresponds to the database table logistics
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
        sb.append(", logisticsNumber=").append(logisticsNumber);
        sb.append(", status=").append(status);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append(", version=").append(version);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}