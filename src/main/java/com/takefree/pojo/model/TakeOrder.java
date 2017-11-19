package com.takefree.pojo.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * This class corresponds to the database table take_order
 * @mbg.generated do_not_delete_during_merge
 */
@Data
public class TakeOrder implements Serializable {
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
     * 分享人id
     * @mbg.generated
     */
    private Long ownerId;

    /**
     * 申请人id
     * @mbg.generated
     */
    private Long applicantId;

    /**
     * 申请单id
     * @mbg.generated
     */
    private Long applicationId;

    /**
     * 分享送出时间
     * @mbg.generated
     */
    private Date takeTime;

    /**
     * 交易类型, 10邮寄到付; 20见面交易
     * @mbg.generated
     */
    private Byte takeType;

    /**
     * 申请者邮寄地址id
     * @mbg.generated
     */
    private Long addressId;

    /**
     * 物品或分享当前状态, 10初始状态; 20发布者已填运单号; 30申请人已评价; 40申请人已显摆; 40已评价并已显摆
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
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method corresponds to the database table take_order
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
        sb.append(", ownerId=").append(ownerId);
        sb.append(", applicantId=").append(applicantId);
        sb.append(", applicationId=").append(applicationId);
        sb.append(", takeTime=").append(takeTime);
        sb.append(", takeType=").append(takeType);
        sb.append(", addressId=").append(addressId);
        sb.append(", status=").append(status);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append(", version=").append(version);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
