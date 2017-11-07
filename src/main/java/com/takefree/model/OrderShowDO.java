package com.takefree.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

@Data
public class OrderShowDO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     * order_show.id
     */
    private Long id;

    /**
     * take成交单号
     * order_show.order_id
     */
    private Long orderId;

    /**
     * 被赠者id
     * order_show.receiver_id
     */
    private Long receiverId;

    /**
     * 赠送者id
     * order_show.giver_id
     */
    private Long giverId;

    /**
     * 心情图标id
     * order_show.mood_id
     */
    private Integer moodId;

    /**
     * 显摆缩略描述
     * order_show.show_content_preview
     */
    private String showContentPreview;

    /**
     * 记录插入时间
     * order_show.gmt_create
     */
    private LocalDateTime gmtCreate;

    /**
     * 最后修改时间
     * order_show.gmt_modified
     */
    private LocalDateTime gmtModified;

    /**
     * 记录版本号
     * order_show.version
     */
    private Integer version;

}
