package com.takefree.model;

import java.io.Serializable;
import java.util.Date;

/**
 * This class corresponds to the database table user_address
 * @mbg.generated do_not_delete_during_merge
 */
public class UserAddress implements Serializable {
    /**
     * 主键
     * @mbg.generated
     */
    private Long id;

    /**
     * 用户id
     * @mbg.generated
     */
    private Long userId;

    /**
     * 省份id
     * @mbg.generated
     */
    private Integer provinceId;

    /**
     * 城市id
     * @mbg.generated
     */
    private Integer cityId;

    /**
     * 邮政编码
     * @mbg.generated
     */
    private String postcode;

    /**
     * 邮寄地址
     * @mbg.generated
     */
    private String address;

    /**
     * 是否默认地址, 0不是默认1默认地址
     * @mbg.generated
     */
    private Byte isDefault;

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
     * This field corresponds to the database table user_address
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column user_address.id
     * @return the value of user_address.id
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method sets the value of the database column user_address.id
     * @param id the value for user_address.id
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column user_address.user_id
     * @return the value of user_address.user_id
     * @mbg.generated
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method sets the value of the database column user_address.user_id
     * @param userId the value for user_address.user_id
     * @mbg.generated
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method returns the value of the database column user_address.province_id
     * @return the value of user_address.province_id
     * @mbg.generated
     */
    public Integer getProvinceId() {
        return provinceId;
    }

    /**
     * This method sets the value of the database column user_address.province_id
     * @param provinceId the value for user_address.province_id
     * @mbg.generated
     */
    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    /**
     * This method returns the value of the database column user_address.city_id
     * @return the value of user_address.city_id
     * @mbg.generated
     */
    public Integer getCityId() {
        return cityId;
    }

    /**
     * This method sets the value of the database column user_address.city_id
     * @param cityId the value for user_address.city_id
     * @mbg.generated
     */
    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    /**
     * This method returns the value of the database column user_address.postcode
     * @return the value of user_address.postcode
     * @mbg.generated
     */
    public String getPostcode() {
        return postcode;
    }

    /**
     * This method sets the value of the database column user_address.postcode
     * @param postcode the value for user_address.postcode
     * @mbg.generated
     */
    public void setPostcode(String postcode) {
        this.postcode = postcode == null ? null : postcode.trim();
    }

    /**
     * This method returns the value of the database column user_address.address
     * @return the value of user_address.address
     * @mbg.generated
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method sets the value of the database column user_address.address
     * @param address the value for user_address.address
     * @mbg.generated
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * This method returns the value of the database column user_address.is_default
     * @return the value of user_address.is_default
     * @mbg.generated
     */
    public Byte getIsDefault() {
        return isDefault;
    }

    /**
     * This method sets the value of the database column user_address.is_default
     * @param isDefault the value for user_address.is_default
     * @mbg.generated
     */
    public void setIsDefault(Byte isDefault) {
        this.isDefault = isDefault;
    }

    /**
     * This method returns the value of the database column user_address.gmt_create
     * @return the value of user_address.gmt_create
     * @mbg.generated
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method sets the value of the database column user_address.gmt_create
     * @param gmtCreate the value for user_address.gmt_create
     * @mbg.generated
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method returns the value of the database column user_address.gmt_modified
     * @return the value of user_address.gmt_modified
     * @mbg.generated
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * This method sets the value of the database column user_address.gmt_modified
     * @param gmtModified the value for user_address.gmt_modified
     * @mbg.generated
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * This method returns the value of the database column user_address.version
     * @return the value of user_address.version
     * @mbg.generated
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * This method sets the value of the database column user_address.version
     * @param version the value for user_address.version
     * @mbg.generated
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * This method corresponds to the database table user_address
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", provinceId=").append(provinceId);
        sb.append(", cityId=").append(cityId);
        sb.append(", postcode=").append(postcode);
        sb.append(", address=").append(address);
        sb.append(", isDefault=").append(isDefault);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append(", version=").append(version);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}