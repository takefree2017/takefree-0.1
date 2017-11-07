package com.takefree.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

@Data
public class SharePicDO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     * share_pic.id
     */
    private Long id;

    /**
     * 分享id
     * share_pic.share_id
     */
    private Long shareId;

    /**
     * 同一分享中一组图片的顺序
     * share_pic.sequence
     */
    private Integer sequence;

    /**
     * 图片url
     * share_pic.pic_url
     */
    private String picUrl;

}
