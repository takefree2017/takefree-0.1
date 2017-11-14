package com.takefree.model;

import java.io.Serializable;
import java.util.Date;

/**
 * This class corresponds to the database table share
 * @mbg.generated do_not_delete_during_merge
 */
public class Share implements Serializable {
    /**
     * 主键
     * @mbg.generated
     */
    private Long id;

    /**
     * 分享者id
     * @mbg.generated
     */
    private Long ownerId;

    /**
     * 首页图片url
     * @mbg.generated
     */
    private String picHomepage;

    /**
     * 分享标题
     * @mbg.generated
     */
    private String title;

    /**
     * 分享缩略描述
     * @mbg.generated
     */
    private String shareDescPreview;

    /**
     * 10草稿; 20发布中; 30已送出; 40发布人收回
     * @mbg.generated
     */
    private Byte status;

    /**
     * 发布时间
     * @mbg.generated
     */
    private Date publishTime;

    /**
     * 获得该分享的用户id
     * @mbg.generated
     */
    private Long takerId;

    /**
     * 记录插入时间
     * @mbg.generated
     */
    private Date gmtCreate;

    /**
     * 最后修改时间
     * @mbg.generated
     */
    private Date gmtModified;

    /**
     * 记录版本号
     * @mbg.generated
     */
    private Integer version;

    /**
     * This field corresponds to the database table share
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column share.id
     * @return the value of share.id
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method sets the value of the database column share.id
     * @param id the value for share.id
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column share.owner_id
     * @return the value of share.owner_id
     * @mbg.generated
     */
    public Long getOwnerId() {
        return ownerId;
    }

    /**
     * This method sets the value of the database column share.owner_id
     * @param ownerId the value for share.owner_id
     * @mbg.generated
     */
    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * This method returns the value of the database column share.pic_homepage
     * @return the value of share.pic_homepage
     * @mbg.generated
     */
    public String getPicHomepage() {
        return picHomepage;
    }

    /**
     * This method sets the value of the database column share.pic_homepage
     * @param picHomepage the value for share.pic_homepage
     * @mbg.generated
     */
    public void setPicHomepage(String picHomepage) {
        this.picHomepage = picHomepage == null ? null : picHomepage.trim();
    }

    /**
     * This method returns the value of the database column share.title
     * @return the value of share.title
     * @mbg.generated
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method sets the value of the database column share.title
     * @param title the value for share.title
     * @mbg.generated
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method returns the value of the database column share.share_desc_preview
     * @return the value of share.share_desc_preview
     * @mbg.generated
     */
    public String getShareDescPreview() {
        return shareDescPreview;
    }

    /**
     * This method sets the value of the database column share.share_desc_preview
     * @param shareDescPreview the value for share.share_desc_preview
     * @mbg.generated
     */
    public void setShareDescPreview(String shareDescPreview) {
        this.shareDescPreview = shareDescPreview == null ? null : shareDescPreview.trim();
    }

    /**
     * This method returns the value of the database column share.status
     * @return the value of share.status
     * @mbg.generated
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * This method sets the value of the database column share.status
     * @param status the value for share.status
     * @mbg.generated
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * This method returns the value of the database column share.publish_time
     * @return the value of share.publish_time
     * @mbg.generated
     */
    public Date getPublishTime() {
        return publishTime;
    }

    /**
     * This method sets the value of the database column share.publish_time
     * @param publishTime the value for share.publish_time
     * @mbg.generated
     */
    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }

    /**
     * This method returns the value of the database column share.taker_id
     * @return the value of share.taker_id
     * @mbg.generated
     */
    public Long getTakerId() {
        return takerId;
    }

    /**
     * This method sets the value of the database column share.taker_id
     * @param takerId the value for share.taker_id
     * @mbg.generated
     */
    public void setTakerId(Long takerId) {
        this.takerId = takerId;
    }

    /**
     * This method returns the value of the database column share.gmt_create
     * @return the value of share.gmt_create
     * @mbg.generated
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method sets the value of the database column share.gmt_create
     * @param gmtCreate the value for share.gmt_create
     * @mbg.generated
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method returns the value of the database column share.gmt_modified
     * @return the value of share.gmt_modified
     * @mbg.generated
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * This method sets the value of the database column share.gmt_modified
     * @param gmtModified the value for share.gmt_modified
     * @mbg.generated
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * This method returns the value of the database column share.version
     * @return the value of share.version
     * @mbg.generated
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * This method sets the value of the database column share.version
     * @param version the value for share.version
     * @mbg.generated
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * This method corresponds to the database table share
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", ownerId=").append(ownerId);
        sb.append(", picHomepage=").append(picHomepage);
        sb.append(", title=").append(title);
        sb.append(", shareDescPreview=").append(shareDescPreview);
        sb.append(", status=").append(status);
        sb.append(", publishTime=").append(publishTime);
        sb.append(", takerId=").append(takerId);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append(", version=").append(version);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}