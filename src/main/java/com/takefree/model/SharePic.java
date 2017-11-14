package com.takefree.model;

import java.io.Serializable;

/**
 * This class corresponds to the database table share_pic
 * @mbg.generated do_not_delete_during_merge
 */
public class SharePic implements Serializable {
    /**
     * 主键
     * @mbg.generated
     */
    private Long id;

    /**
     * 分享id
     * @mbg.generated
     */
    private Long shareId;

    /**
     * 同一分享中一组图片的顺序
     * @mbg.generated
     */
    private Byte sequence;

    /**
     * 图片url
     * @mbg.generated
     */
    private String picUrl;

    /**
     * This field corresponds to the database table share_pic
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column share_pic.id
     * @return the value of share_pic.id
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method sets the value of the database column share_pic.id
     * @param id the value for share_pic.id
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column share_pic.share_id
     * @return the value of share_pic.share_id
     * @mbg.generated
     */
    public Long getShareId() {
        return shareId;
    }

    /**
     * This method sets the value of the database column share_pic.share_id
     * @param shareId the value for share_pic.share_id
     * @mbg.generated
     */
    public void setShareId(Long shareId) {
        this.shareId = shareId;
    }

    /**
     * This method returns the value of the database column share_pic.sequence
     * @return the value of share_pic.sequence
     * @mbg.generated
     */
    public Byte getSequence() {
        return sequence;
    }

    /**
     * This method sets the value of the database column share_pic.sequence
     * @param sequence the value for share_pic.sequence
     * @mbg.generated
     */
    public void setSequence(Byte sequence) {
        this.sequence = sequence;
    }

    /**
     * This method returns the value of the database column share_pic.pic_url
     * @return the value of share_pic.pic_url
     * @mbg.generated
     */
    public String getPicUrl() {
        return picUrl;
    }

    /**
     * This method sets the value of the database column share_pic.pic_url
     * @param picUrl the value for share_pic.pic_url
     * @mbg.generated
     */
    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl == null ? null : picUrl.trim();
    }

    /**
     * This method corresponds to the database table share_pic
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", shareId=").append(shareId);
        sb.append(", sequence=").append(sequence);
        sb.append(", picUrl=").append(picUrl);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}