package com.takefree.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class MoodInfoDO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     * mood_info.id
     */
    private Integer id;

    /**
     * 心情名称
     * mood_info.mood_name
     */
    private String moodName;

    /**
     * 图标url
     * mood_info.icon_url
     */
    private String iconUrl;

}
