package com.takefree.dto.model;

import com.fasterxml.jackson.annotation.JsonView;
import com.takefree.common.entry.ResultView;
import com.takefree.pojo.model.ShareCategory;
import com.takefree.pojo.model.SharePic;
import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
public class ShareDTO implements Serializable {
    /**
     * This field corresponds to the database table share
     */
    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @JsonView(ResultView.BriefView.class)
    private Long id;

    /**
     * 分享者id
     */
    @JsonView(ResultView.BriefView.class)
    private Long ownerId;

    /**
     * 分享者昵称
     */
    @JsonView(ResultView.BriefView.class)
    private String ownerNickName;

    /**
     * 分享者小图像
     */
    @JsonView(ResultView.BriefView.class)
    private String ownerSmallIcon;

    /**
     * 首页图片url
     */
    @JsonView(ResultView.BriefView.class)
    @NotBlank(message="首页图不能为空")
    private String picHomepage;

    /**
     * 分享标题
     */
    @JsonView(ResultView.BriefView.class)
    @NotBlank(message="标题不能为空")
    private String title;

    /**
     * 分享缩略描述
     */
    @JsonView(ResultView.BriefView.class)
    private String shareDescPreview;

    /**
     * 10草稿; 20发布中; 30已送出; 40发布人收回
     */
    @JsonView(ResultView.BriefView.class)
    private Integer status;

    /**
     * 发布时间
     */
    @JsonView(ResultView.BriefView.class)
    private Date publishTime;

    /**
     * 获得该分享的用户id
     */
    @JsonView(ResultView.BriefView.class)
    private Long takerId;

//    /**
//     * taker昵称
//     */
//    @JsonView(ResultView.BriefView.class)
//    private String takerNickName;

    /**
     * 记录插入时间
     */
    @JsonView(ResultView.AllView.class)
    private Date gmtCreate;

    /**
     * 最后修改时间
     */
    @JsonView(ResultView.AllView.class)
    private Date gmtModified;

    /**
     */
    @JsonView(ResultView.BriefView.class)
    private Integer shareModeId;

    /**
     */
    @JsonView(ResultView.BriefView.class)
    private Integer transferable;

    /**
     * 10,物流;20,见面交易;30,支持两种
     */
    @JsonView(ResultView.BriefView.class)
    private Integer transferType;

    /**
     */
    @JsonView(ResultView.BriefView.class)
    private Integer participatory;

    /**
     * 记录版本号
     */
    @JsonView(ResultView.BriefView.class)
    private Integer version;

    /**
     * 分享描述
     */
    @JsonView(ResultView.BriefView.class)
    private String description;

    /**
     * 数量
     */
    @JsonView(ResultView.BriefView.class)
    @NotNull
    private Integer number;

    /**
     * 送出数量
     */
    @JsonView(ResultView.BriefView.class)
    private Integer takeNumber;

    /**
     * 打开次数
     */
    @JsonView(ResultView.BriefView.class)
    private Integer viewCount;

    /**
     * 被like次数
     */
    @JsonView(ResultView.BriefView.class)
    private Integer likeCount;

    /**
     * 被申请次数
     */
    @JsonView(ResultView.BriefView.class)
    private Integer applyCount;

    /**
     * 新申请次数
     */
    @JsonView(ResultView.BriefView.class)
    private Integer newApplyCount;

    /**
     * 评论
     */
    @JsonView(ResultView.BriefView.class)
    private Integer commentCount;

    /**
     * 新评论
     */
    @JsonView(ResultView.BriefView.class)
    private Integer newCommentCount;

//    /**
//     * 最后评论时间
//     */
//    @JsonView(ResultView.AllView.class)
//    private Date lastCommnetTime;
//
//    /**
//     * 最后查看评论时间
//     */
//    @JsonView(ResultView.AllView.class)
//    private Date lastCommnetViewTime;

    /**
     * 经度
     */
    @JsonView(ResultView.DetailView.class)
    private BigDecimal longitude;

    /**
     * 维度
     */
    @JsonView(ResultView.DetailView.class)
    private BigDecimal latitude;

    /**
     * 地址详情
     */
    @JsonView(ResultView.DetailView.class)
    private String lbsDescription;

    /**
     * 图片
     */
    @JsonView(ResultView.DetailView.class)
    private List<SharePic> sharePics;

    /**
     * 分类
     */
    @JsonView(ResultView.DetailView.class)
    private List<ShareCategory> categories;

    /**
     * 订单
     */
    @JsonView(ResultView.AllView.class)
    private List<TakeOrderDTO> takeOrderDTOS;

    /**
     * 当前用户是否like
     */
    private Boolean isCurrentUserLike;

    /**
     * 当前用户是否apply
     */
    private Boolean isCurrentUserApply;

}
