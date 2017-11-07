package com.takefree.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

@Data
public class OrderShowContentDO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 显摆id, 主键
     * order_show_content.order_show_id
     */
    private Long orderShowId;

    /**
     * 显摆详情
     * order_show_content.content
     */
    private String content;

}
