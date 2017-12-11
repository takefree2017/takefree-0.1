package com.takefree.dto.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class TakeApplicationDTO implements Serializable {
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
     * 首页图片url
     */
    private String sharePicHomepage;

    /**
     * 分享人id
     * @mbg.generated
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
     * @mbg.generated
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
     * 申请时间
     * @mbg.generated
     */
    private Date applyTime;

    /**
     * 交易类型, 10邮寄到付; 20见面交易; 30支持两种
     * @mbg.generated
     */
    private Byte applyType;

    /**
     * 申请者邮寄地址id
     * @mbg.generated
     */
    private Long addressId;

    /**
     * 10未成交初始状态, 20被申请人take
     * @mbg.generated
     */
    private Integer status;

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
     * This field corresponds to the database table take_order
     */
    private static final long serialVersionUID = 1L;

}
