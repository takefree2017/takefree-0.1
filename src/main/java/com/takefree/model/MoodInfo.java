package com.takefree.model;

import java.io.Serializable;

/**
 * This class corresponds to the database table mood_info
 * @mbg.generated do_not_delete_during_merge
 */
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
     * This method returns the value of the database column mood_info.id
     * @return the value of mood_info.id
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method sets the value of the database column mood_info.id
     * @param id the value for mood_info.id
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column mood_info.mood_name
     * @return the value of mood_info.mood_name
     * @mbg.generated
     */
    public String getMoodName() {
        return moodName;
    }

    /**
     * This method sets the value of the database column mood_info.mood_name
     * @param moodName the value for mood_info.mood_name
     * @mbg.generated
     */
    public void setMoodName(String moodName) {
        this.moodName = moodName == null ? null : moodName.trim();
    }

    /**
     * This method returns the value of the database column mood_info.icon_url
     * @return the value of mood_info.icon_url
     * @mbg.generated
     */
    public String getIconUrl() {
        return iconUrl;
    }

    /**
     * This method sets the value of the database column mood_info.icon_url
     * @param iconUrl the value for mood_info.icon_url
     * @mbg.generated
     */
    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl == null ? null : iconUrl.trim();
    }

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