package com.takefree.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

@Data
public class CategoryLikeDO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     * category_like.id
     */
    private Long id;

    /**
     * 被like的类目id
     * category_like.category_id
     */
    private Long categoryId;

    /**
     * 发起like的用户id
     * category_like.user_id
     */
    private Long userId;

    /**
     * 记录插入时间
     * category_like.gmt_create
     */
    private LocalDateTime gmtCreate;

    /**
     * 最后修改时间
     * category_like.gmt_modified
     */
    private LocalDateTime gmtModified;

    /**
     * 记录版本号
     * category_like.version
     */
    private Integer version;

}
