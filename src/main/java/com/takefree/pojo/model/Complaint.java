package com.takefree.pojo.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * This class corresponds to the database table complaint
 * @mbg.generated do_not_delete_during_merge
 */
@Data
public class Complaint implements Serializable {
    /**
     * 主键
     * @mbg.generated
     */
    private Long id;

    /**
     * 被投诉的分享id
     * @mbg.generated
     */
    private Long shareId;

    /**
     * 发起投诉的用户id
     * @mbg.generated
     */
    private Long submitterId;

    /**
     * 被投诉的用户id
     * @mbg.generated
     */
    private Long receiverId;

    /**
     * 投诉类型, 10对分享投诉, 20对用户投诉
     * @mbg.generated
     */
    private Integer type;

    /**
     * 投诉内容
     * @mbg.generated
     */
    private String content;

    /**
     * 投诉状态, 0待处理; 1已处理
     * @mbg.generated
     */
    private Integer status;

    /**
     * 处理结果
     * @mbg.generated
     */
    private String complaintResult;

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
     * This field corresponds to the database table complaint
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method corresponds to the database table complaint
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
        sb.append(", submitterId=").append(submitterId);
        sb.append(", receiverId=").append(receiverId);
        sb.append(", type=").append(type);
        sb.append(", content=").append(content);
        sb.append(", status=").append(status);
        sb.append(", complaintResult=").append(complaintResult);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append(", version=").append(version);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
