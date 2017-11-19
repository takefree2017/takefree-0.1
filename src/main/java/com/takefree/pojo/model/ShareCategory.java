package com.takefree.pojo.model;

import lombok.Data;

import java.io.Serializable;

/**
 * This class corresponds to the database table share_category
 * @mbg.generated do_not_delete_during_merge
 */
@Data
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
