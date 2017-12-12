package com.takefree.pojo.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * This class corresponds to the database table order_show
 * @mbg.generated do_not_delete_during_merge
 */
@Data
public class OrderShow implements Serializable {
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
     * 被赠者id
     * @mbg.generated
     */
    private Long receiverId;

    /**
     * 赠送者id
     * @mbg.generated
     */
    private Long giverId;

    /**
     * 心情图标id
     * @mbg.generated
     */
    private Integer moodId;

    /**
     * 首页图片
     */
    private String picHomepage;

    /**
     * 显摆缩略描述
     * @mbg.generated
     */
    private String showContentPreview;

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
     * This field corresponds to the database table order_show
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method corresponds to the database table order_show
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
        sb.append(", receiverId=").append(receiverId);
        sb.append(", giverId=").append(giverId);
        sb.append(", moodId=").append(moodId);
        sb.append(", showContentPreview=").append(showContentPreview);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append(", version=").append(version);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
