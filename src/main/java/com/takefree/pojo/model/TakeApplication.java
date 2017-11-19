package com.takefree.pojo.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * This class corresponds to the database table take_application
 * @mbg.generated do_not_delete_during_merge
 */
@Data
public class TakeApplication implements Serializable {
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
     * This field corresponds to the database table take_application
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method corresponds to the database table take_application
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
        sb.append(", applyTime=").append(applyTime);
        sb.append(", applyType=").append(applyType);
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
