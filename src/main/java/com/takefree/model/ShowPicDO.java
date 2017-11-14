package com.takefree.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class ShowPicDO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     * show_pic.id
     */
    private Long id;

    /**
     * 显摆id
     * show_pic.show_id
     */
    private Long showId;

    /**
     * 同一显摆中一组图片的顺序
     * show_pic.sequence
     */
    private Integer sequence;

    /**
     * 图片url
     * show_pic.pic_url
     */
    private String picUrl;

}
