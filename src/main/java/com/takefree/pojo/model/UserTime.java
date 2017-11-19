package com.takefree.pojo.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * This class corresponds to the database table user_time
 * @mbg.generated do_not_delete_during_merge
 */
@Data
public class UserTime implements Serializable {
    /**
     * 用户id, 主键
     * @mbg.generated
     */
    private Long userId;

    /**
     * 用户创建时间
     * @mbg.generated
     */
    private Date createTime;

    /**
     * 最后登录时间
     * @mbg.generated
     */
    private Date lastloginTime;

    /**
     * 记录版本号
     * @mbg.generated
     */
    private Integer version;

    /**
     * This field corresponds to the database table user_time
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method corresponds to the database table user_time
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", createTime=").append(createTime);
        sb.append(", lastloginTime=").append(lastloginTime);
        sb.append(", version=").append(version);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
