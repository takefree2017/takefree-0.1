package com.takefree.dto.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class ShareLikeDTO implements Serializable {
    /**
     * 主键
     */
    private Long id;

    /**
     * 被like的分享id
     */
    private Long shareId;

    private String shareTitle;

    /**
     * 首页图片url
     */
    private String sharePicHomepage;

    /**
     * 分享状态
     */
    private Integer shareStatus;

    /**
     * 分享人id
     */
    private Long ownerId;

    /**
     * 分享者昵称
     */
    private String ownerNickName;

    /**
     * 分享者小图像
     */
    private String ownerSmallIcon;

    /**
     * 发起like的用户id
     */
    private Long userId;

    /**
     * 昵称
     */
    private String userNickName;

    /**
     * 小图像
     */
    private String userSmallIcon;

    /**
     * 记录插入时间
     */
    private Date gmtCreate;

    /**
     * 最后修改时间
     
     */
    private Date gmtModified;

    /**
     * 记录版本号
     */
    private Integer version;

    /**
     * This field corresponds to the database table share_like
     */
    private static final long serialVersionUID = 1L;

}
