package com.takefree.model;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class CategoryInfoDO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     * category_info.id
     */
    private Long id;

    /**
     * 类目名称
     * category_info.category_name
     */
    private String categoryName;

    /**
     * 层级, 10第一层; 20第二层
     * category_info.layer
     */
    private Integer layer;

    /**
     * 父层级的category_id
     * category_info.parent_category_id
     */
    private Long parentCategoryId;

    /**
     * 记录插入时间
     * category_info.gmt_create
     */
    private LocalDateTime gmtCreate;

    /**
     * 最后修改时间
     * category_info.gmt_update
     */
    private LocalDateTime gmtModified;

    /**
     * 记录版本号
     * category_info.version
     */
    private Integer version;

}
