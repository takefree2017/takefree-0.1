package com.takefree.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

@Data
public class ShowCounterDO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 分享id
     * show_counter.show_id
     */
    private Long showId;

    /**
     * 打开次数
     * show_counter.view_count
     */
    private Integer viewCount;

    /**
     * 被like次数
     * show_counter.like_count
     */
    private Integer likeCount;

    /**
     * 评论次数
     * show_counter.comment_count
     */
    private Integer commentCount;

    /**
     * 记录插入时间
     * show_counter.gmt_create
     */
    private LocalDateTime gmtCreate;

    /**
     * 最后修改时间
     * show_counter.gmt_modified
     */
    private LocalDateTime gmtModified;

    /**
     * 记录版本号
     * show_counter.version
     */
    private Integer version;

}
