package com.takefree.dto.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * This class corresponds to the database table show_like
 * @mbg.generated do_not_delete_during_merge
 */
@Data
public class ShowLikeDTO implements Serializable {
    /**
     * 主键
     */
    private Long id;

    /**
     * 被like的显摆id
     */
    private Long showId;

    /**
     * 发起like的用户id
     */
    private Long userId;

    /**
     * 昵称
     */
    private String userNickName;

    /**
     * 小图像
     */
    private String userSmallIcon;

    /**
     * 记录插入时间
     */
    private Date gmtCreate;

    /**
     * 最后修改时间
     */
    private Date gmtModified;

    /**
     * 记录版本号
     */
    private Integer version;

    /**
     * This field corresponds to the database table show_like
     */
    private static final long serialVersionUID = 1L;


}
