package com.takefree.dto.model;

import com.fasterxml.jackson.annotation.JsonView;
import com.takefree.common.entry.ResultView;
import com.takefree.pojo.model.ShareCategory;
import com.takefree.pojo.model.SharePic;
import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * This class corresponds to the database table share
 * @mbg.generated do_not_delete_during_merge
 */
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

    /**t
     * 获得该分享的用户id
     */
    @JsonView(ResultView.BriefView.class)
    private Long takerId;

    /**
     * taker昵称
     */
    @JsonView(ResultView.BriefView.class)
    private String takerNickName;

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
     * 记录版本号
     */
    @JsonView(ResultView.BriefView.class)
    private Integer version;

    /**
     * 分享描述
     */
    @JsonView(ResultView.DetailView.class)
    private String description;

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
     * 最后申请时间
     */
    @JsonView(ResultView.AllView.class)
    private Date lastApplyTime;

    /**
     * 最后查看申请时间
     */
    @JsonView(ResultView.AllView.class)
    private Date lastApplyViewTime;

    /**
     * 评论
     */
    @JsonView(ResultView.BriefView.class)
    private Integer commnetCount;

    /**
     * 最后评论时间
     */
    @JsonView(ResultView.AllView.class)
    private Date lastCommnetTime;

    /**
     * 最后查看评论时间
     */
    @JsonView(ResultView.AllView.class)
    private Date lastCommnetViewTime;

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

}
