package com.takefree.dto.model;

import com.fasterxml.jackson.annotation.JsonView;
import com.takefree.common.entry.ResultView;
import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

import java.io.Serializable;
import java.util.Date;

@Data
public class TakeOrderDTO implements Serializable {
    /**
     * 主键
     */
    private Long id;

    /**
     * 分享id
     */
    private Long shareId;

    /**
     * 首页图片url
     */
    private String sharePicHomepage;

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
     * 申请人id
     */
    private Long applicantId;

    /**
     * 分享者昵称
     */
    private String applicantNickName;

    /**
     * 分享者小图像
     */
    private String applicantSmallIcon;

    /**
     * 申请单id

     */
    private Long applicationId;

    /**
     * 分享送出时间
     */
    private Date takeTime;

    /**
     * 交易类型, 10邮寄到付; 20见面交易

     */
    private Byte takeType;

    /**
     * 申请者邮寄地址id

     */
    private Long addressId;

    /**
     * 物品或分享当前状态, 10初始状态; 20 完成

     */
    private Integer status;

    /**
     * 10,无物流单；20，有物流单
     */
    private Integer logisticsStatus;

    /**
     * 订单评价状态 10未评价，20已评价
     */
    private Integer rateStatus;

    /**
     * 显摆状态 10:未显摆 20:已显摆
     */
    private Integer showStatus;

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
     * This field corresponds to the database table take_order
     */
    private static final long serialVersionUID = 1L;

}
