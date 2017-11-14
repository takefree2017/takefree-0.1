package com.takefree.model;

import com.fasterxml.jackson.annotation.JsonView;
import com.takefree.common.entry.ResultView;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class UserInfoDO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户id, 主键
     * user_info.id
     */
    @JsonView(ResultView.BriefView.class)
    private Long id;

    /**
     * 昵称
     * user_info.nick_name
     */
    @JsonView(ResultView.BriefView.class)
    private String nickName;

    /**
     * 真名
     * user_info.real_name
     */
    @JsonView(ResultView.BriefView.class)
    private String realName;

    /**
     * 手机
     * user_info.mobile
     */
    @JsonView(ResultView.DetailView.class)
    private String mobile;

    /**
     * 邮箱
     * user_info.email
     */
    @JsonView(ResultView.DetailView.class)
    private String email;

    /**
     * 推荐人id
     * user_info.endorser_id
     */
    @JsonView(ResultView.DetailView.class)
    private Long endorserId;

    /**
     * 密码
     * user_info.password
     */
    @JsonView(ResultView.AllView.class)
    private String password;

    /**
     * 用户状态:10未激活/20已激活
     * user_info.status
     */
    @JsonView(ResultView.AllView.class)
    private Integer status;

    /**
     * 小头像
     * user_info.small_icon
     */
    @JsonView(ResultView.BriefView.class)
    private String smallIcon;

    /**
     * 大头像
     * user_info.big_icon
     */
    @JsonView(ResultView.BriefView.class)
    private String bigIcon;

    /**
     * 记录版本号
     * user_info.version
     */
    @JsonView(ResultView.AllView.class)
    private Integer version;

    /**
     * 记录插入时间
     * user_info.gmt_create
     */
    @JsonView(ResultView.AllView.class)
    private LocalDateTime gmtCreate;

    /**
     * 最后修改时间
     * user_info.gmt_modified
     */
    @JsonView(ResultView.AllView.class)
    private LocalDateTime gmtModified;

}
