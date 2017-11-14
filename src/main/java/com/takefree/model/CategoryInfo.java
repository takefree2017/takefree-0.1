package com.takefree.model;

import java.io.Serializable;
import java.util.Date;

/**
 * This class corresponds to the database table category_info
 * @mbg.generated do_not_delete_during_merge
 */
public class CategoryInfo implements Serializable {
    /**
     * 主键
     * @mbg.generated
     */
    private Long id;

    /**
     * 类目名称
     * @mbg.generated
     */
    private String categoryName;

    /**
     * 层级, 10第一层; 20第二层
     * @mbg.generated
     */
    private Byte layer;

    /**
     * 父层级的category_id
     * @mbg.generated
     */
    private Long parentCategoryId;

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
     * This field corresponds to the database table category_info
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column category_info.id
     * @return the value of category_info.id
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method sets the value of the database column category_info.id
     * @param id the value for category_info.id
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column category_info.category_name
     * @return the value of category_info.category_name
     * @mbg.generated
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * This method sets the value of the database column category_info.category_name
     * @param categoryName the value for category_info.category_name
     * @mbg.generated
     */
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName == null ? null : categoryName.trim();
    }

    /**
     * This method returns the value of the database column category_info.layer
     * @return the value of category_info.layer
     * @mbg.generated
     */
    public Byte getLayer() {
        return layer;
    }

    /**
     * This method sets the value of the database column category_info.layer
     * @param layer the value for category_info.layer
     * @mbg.generated
     */
    public void setLayer(Byte layer) {
        this.layer = layer;
    }

    /**
     * This method returns the value of the database column category_info.parent_category_id
     * @return the value of category_info.parent_category_id
     * @mbg.generated
     */
    public Long getParentCategoryId() {
        return parentCategoryId;
    }

    /**
     * This method sets the value of the database column category_info.parent_category_id
     * @param parentCategoryId the value for category_info.parent_category_id
     * @mbg.generated
     */
    public void setParentCategoryId(Long parentCategoryId) {
        this.parentCategoryId = parentCategoryId;
    }

    /**
     * This method returns the value of the database column category_info.gmt_create
     * @return the value of category_info.gmt_create
     * @mbg.generated
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method sets the value of the database column category_info.gmt_create
     * @param gmtCreate the value for category_info.gmt_create
     * @mbg.generated
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method returns the value of the database column category_info.gmt_modified
     * @return the value of category_info.gmt_modified
     * @mbg.generated
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * This method sets the value of the database column category_info.gmt_modified
     * @param gmtModified the value for category_info.gmt_modified
     * @mbg.generated
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * This method returns the value of the database column category_info.version
     * @return the value of category_info.version
     * @mbg.generated
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * This method sets the value of the database column category_info.version
     * @param version the value for category_info.version
     * @mbg.generated
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * This method corresponds to the database table category_info
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", categoryName=").append(categoryName);
        sb.append(", layer=").append(layer);
        sb.append(", parentCategoryId=").append(parentCategoryId);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append(", version=").append(version);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}