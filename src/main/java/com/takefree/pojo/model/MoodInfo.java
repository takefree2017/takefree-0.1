package com.takefree.pojo.model;

import lombok.Data;

import java.io.Serializable;

/**
 * This class corresponds to the database table mood_info
 * @mbg.generated do_not_delete_during_merge
 */
@Data
public class MoodInfo implements Serializable {
    /**
     * 主键
     * @mbg.generated
     */
    private Integer id;

    /**
     * 心情名称
     * @mbg.generated
     */
    private String moodName;

    /**
     * 图标url
     * @mbg.generated
     */
    private String iconUrl;

    /**
     * This field corresponds to the database table mood_info
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method corresponds to the database table mood_info
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", moodName=").append(moodName);
        sb.append(", iconUrl=").append(iconUrl);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
