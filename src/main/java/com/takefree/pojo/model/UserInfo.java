package com.takefree.pojo.model;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

/**
 * This class corresponds to the database table user_info
 * @mbg.generated do_not_delete_during_merge
 */
@Data
public class UserInfo implements Serializable {
    /**
     * 用户id, 主键
     * @mbg.generated
     */
    private Long id;

    /**
     * 昵称
     * @mbg.generated
     */
    private String nickName;

    /**
     * 真名
     * @mbg.generated
     */
    private String realName;

    /**
     * 手机
     * @mbg.generated
     */
    private String mobile;

    /**
     * 邮箱
     * @mbg.generated
     */
    private String email;

    /**
     * 推荐人id
     * @mbg.generated
     */
    private Long endorserId;

    /**
     * 密码
     * @mbg.generated
     */
    private String password;

    /**
     * im密码
     * @mbg.generated
     */
    private String imPassword;

    /**
     * 用户状态:10未激活/20已激活
     * @mbg.generated
     */
    private Integer status;

    /**
     * 小头像
     * @mbg.generated
     */
    private String smallIcon;

    /**
     * 大头像
     * @mbg.generated
     */
    private String bigIcon;

    /**
     * 记录版本号
     * @mbg.generated
     */
    private Integer version;

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
     * 站内信uuid
     * @mbg.generated
     */
    private String imUuid;

    /**
     * @mbg.generated
     */
    private Integer sex;

    /**
     * @mbg.generated
     */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date birthday;

    /**
     * This field corresponds to the database table user_info
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method corresponds to the database table user_info
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", nickName=").append(nickName);
        sb.append(", realName=").append(realName);
        sb.append(", mobile=").append(mobile);
        sb.append(", email=").append(email);
        sb.append(", endorserId=").append(endorserId);
        sb.append(", password=").append(password);
        sb.append(", status=").append(status);
        sb.append(", smallIcon=").append(smallIcon);
        sb.append(", bigIcon=").append(bigIcon);
        sb.append(", version=").append(version);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append(", imUuid=").append(imUuid);
        sb.append(", sex=").append(sex);
        sb.append(", birthday=").append(birthday);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
