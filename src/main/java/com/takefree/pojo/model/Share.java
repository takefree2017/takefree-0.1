package com.takefree.pojo.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * This class corresponds to the database table share
 * @mbg.generated do_not_delete_during_merge
 */
@Data
public class Share implements Serializable {
    /**
     * 主键
     * @mbg.generated
     */
    private Long id;

    /**
     * 分享者id
     * @mbg.generated
     */
    private Long ownerId;

    /**
     * 首页图片url
     * @mbg.generated
     */
    private String picHomepage;

    /**
     * 分享标题
     * @mbg.generated
     */
    private String title;

    /**
     * 分享缩略描述
     * @mbg.generated
     */
    private String shareDescPreview;

    /**
     * 10草稿; 20发布中; 30已送出; 40发布人收回
     * @mbg.generated
     */
    private Integer status;

    /**
     * 发布时间
     * @mbg.generated
     */
    private Date publishTime;

//    /**
//     * 获得该分享的用户id
//     * @mbg.generated
//     */
//    private Long takerId;

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
     * @mbg.generated
     */
    private Integer shareModeId;

    /**
     * @mbg.generated
     */
    private Integer transferable;

    /**
     * @mbg.generated
     */
    private Integer participatory;

    /**
     * This field corresponds to the database table share
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method corresponds to the database table share
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", ownerId=").append(ownerId);
        sb.append(", picHomepage=").append(picHomepage);
        sb.append(", title=").append(title);
        sb.append(", shareDescPreview=").append(shareDescPreview);
        sb.append(", status=").append(status);
        sb.append(", publishTime=").append(publishTime);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append(", version=").append(version);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
