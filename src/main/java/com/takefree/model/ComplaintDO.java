package com.takefree.model;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class ComplaintDO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     * complaint.id
     */
    private Long id;

    /**
     * 被投诉的分享id
     * complaint.share_id
     */
    private Long shareId;

    /**
     * 发起投诉的用户id
     * complaint.submitter_id
     */
    private Long submitterId;

    /**
     * 被投诉的用户id
     * complaint.receiver_id
     */
    private Long receiverId;

    /**
     * 投诉类型, 10对分享投诉, 20对用户投诉
     * complaint.type
     */
    private Integer type;

    /**
     * 投诉内容
     * complaint.content
     */
    private String content;

    /**
     * 投诉状态, 0待处理; 1已处理
     * complaint.status
     */
    private Integer status;

    /**
     * 处理结果
     * complaint.complaint_result
     */
    private String complaintResult;

    /**
     * 记录插入时间
     * complaint.gmt_create
     */
    private LocalDateTime gmtCreate;

    /**
     * 最后修改时间
     * complaint.gmt_update
     */
    private LocalDateTime gmtModified;

    /**
     * 记录版本号
     * complaint.version
     */
    private Integer version;
}
