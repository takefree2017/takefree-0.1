package com.takefree.pojo.model;

import lombok.Data;

import java.io.Serializable;

/**
 * This class corresponds to the database table share_pic
 * @mbg.generated do_not_delete_during_merge
 */
@Data
public class SharePic implements Serializable {
    /**
     * 主键
     * @mbg.generated
     */
    private Long id;

    /**
     * 分享id
     * @mbg.generated
     */
    private Long shareId;

    /**
     * 同一分享中一组图片的顺序
     * @mbg.generated
     */
    private Byte sequence;

    /**
     * 图片url
     * @mbg.generated
     */
    private String picUrl;

    /**
     * This field corresponds to the database table share_pic
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method corresponds to the database table share_pic
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
        sb.append(", sequence=").append(sequence);
        sb.append(", picUrl=").append(picUrl);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
