package com.takefree.dto.model;

import com.takefree.pojo.model.ShowPic;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
public class OrderShowDTO implements Serializable {
    /**
     * 主键
     */
    private Long id;

    /**
     * take成交单号
     */
    @NotNull(message="订单不能为空")
    private Long orderId;

    /**
     * 分享送出时间,order表
     */
    private Date takeTime;

    /**
     * 分享id,order表
     */
    private Long shareId;

    /**
     * 分享id,share表
     */
    private String shareTitle;

    /**
     * 首页图片url,share表
     */
    private String sharePicHomepage;

    /**
     * 被赠者id,order表
     */
    private Long receiverId;

    /**
     * 被赠者昵称,user表
     */
    private String receiverNickName;

    /**
     * 被赠者小图像,user表
     */
    private String receiverSmallIcon;

    /**
     * 赠送者id,order表
     */
    private Long giverId;

    /**
     * 分享者昵称,user表
     */
    private String giverNickName;

    /**
     * 分享者小图像,user表
     */
    private String giverSmallIcon;

    /**
     * 心情图标id
     */
    private Integer moodId;

    /**
     * 心情名称，mood表
     */
    private String moodName;

    /**
     * 图标url，mood表
     */
    private String moodIconUrl;

    /**
     * 显摆缩略描述
     */
    private String showContentPreview;

    /**
     * 显摆内容，show_content表
     */
    private String content;

    /**
     * 打开次数,show_counter表
     */
    private Integer viewCount;

    /**
     * 被like次数,show_counter表
     */
    private Integer likeCount;

    /**
     * 评论次数,show_counter表
     */
    private Integer commentCount;

    /**
     * 图片,show_pic表
     */
    private List<ShowPic> showPics;

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

    private static final long serialVersionUID = 1L;

}
