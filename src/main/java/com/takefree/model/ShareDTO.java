package com.takefree.model;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class ShareDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     * share.id
     */
    private Long id;

    /**
     * 分享者id
     * share.owner_id
     */
    private Long ownerId;

    /**
     * 首页图片url
     * share.pic_homepage
     */
    private String picHomepage;

    /**
     * 分享标题
     * share.title
     */
    private String title;

    /**
     * 分享缩略描述
     * share.share_desc_preview
     */
    private String shareDescPreview;

    /**
     * 10草稿; 20发布中; 30已送出; 40发布人收回
     * share.status
     */
    private Integer status;

    /**
     * 发布时间
     * share.publish_time
     */
    private LocalDateTime publishTime;

    /**
     * 获得该分享的用户id
     * share.taker_id
     */
    private Long takerId;

    /**
     * 记录插入时间
     * share.gmt_create
     */
    private LocalDateTime gmtCreate;

    /**
     * 最后修改时间
     * share.gmt_modified
     */
    private LocalDateTime gmtModified;

    /**
     * 记录版本号
     * share.version
     */
    private Integer version;

}
