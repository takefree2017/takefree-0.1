package com.takefree.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

@Data
public class ShareCounterDO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 分享id
     * share_counter.share_id
     */
    private Long shareId;

    /**
     * 打开次数
     * share_counter.view_count
     */
    private Integer viewCount;

    /**
     * 被like次数
     * share_counter.like_count
     */
    private Integer likeCount;

    /**
     * 被申请次数
     * share_counter.apply_count
     */
    private Integer applyCount;

    /**
     * 记录插入时间
     * share_counter.gmt_create
     */
    private LocalDateTime gmtCreate;

    /**
     * 最后修改时间
     * share_counter.gmt_modified
     */
    private LocalDateTime gmtModified;

    /**
     * 记录版本号
     * share_counter.version
     */
    private Integer version;

}
