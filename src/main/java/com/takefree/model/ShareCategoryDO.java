package com.takefree.model;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class ShareCategoryDO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     * share_category.id
     */
    private Long id;

    /**
     * 被like的分享id
     * share_category.share_id
     */
    private Long shareId;

    /**
     * 类目id
     * share_category.category_id
     */
    private Long categoryId;

}
