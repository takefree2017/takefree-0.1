package com.takefree.model;

import java.io.Serializable;

/**
 * This class corresponds to the database table share_category
 * @mbg.generated do_not_delete_during_merge
 */
public class ShareCategory implements Serializable {
    /**
     * 主键
     * @mbg.generated
     */
    private Long id;

    /**
     * 被like的分享id
     * @mbg.generated
     */
    private Long shareId;

    /**
     * 类目id
     * @mbg.generated
     */
    private Long categoryId;

    /**
     * This field corresponds to the database table share_category
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column share_category.id
     * @return the value of share_category.id
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method sets the value of the database column share_category.id
     * @param id the value for share_category.id
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column share_category.share_id
     * @return the value of share_category.share_id
     * @mbg.generated
     */
    public Long getShareId() {
        return shareId;
    }

    /**
     * This method sets the value of the database column share_category.share_id
     * @param shareId the value for share_category.share_id
     * @mbg.generated
     */
    public void setShareId(Long shareId) {
        this.shareId = shareId;
    }

    /**
     * This method returns the value of the database column share_category.category_id
     * @return the value of share_category.category_id
     * @mbg.generated
     */
    public Long getCategoryId() {
        return categoryId;
    }

    /**
     * This method sets the value of the database column share_category.category_id
     * @param categoryId the value for share_category.category_id
     * @mbg.generated
     */
    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * This method corresponds to the database table share_category
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", shareId=").append(shareId);
        sb.append(", categoryId=").append(categoryId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}