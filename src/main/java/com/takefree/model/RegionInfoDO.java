package com.takefree.model;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class RegionInfoDO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     * region_info.id
     */
    private Long id;

    /**
     * 地区名称
     * region_info.region_name
     */
    private String regionName;

    /**
     * 层级, 10第一层; 20第二层
     * region_info.layer
     */
    private Integer layer;

    /**
     * 父层级的region_id
     * region_info.parent_region_id
     */
    private Long parentRegionId;

    /**
     * 记录插入时间
     * region_info.gmt_create
     */
    private LocalDateTime gmtCreate;

    /**
     * 最后修改时间
     * region_info.gmt_update
     */
    private LocalDateTime gmtModified;

    /**
     * 记录版本号
     * region_info.version
     */
    private Integer version;

}
