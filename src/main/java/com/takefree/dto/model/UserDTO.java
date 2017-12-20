package com.takefree.dto.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonView;
import com.takefree.common.entry.ResultView;
import lombok.Data;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;

@Data
public class UserDTO implements Serializable {

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
    @NotBlank(message="昵称不能为空")
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
    @NotBlank(message="手机号不能为空")
    @Pattern(regexp="^((13[0-9])|(15[0-9])|(18[0-9])|(17[0-8])|(14[0-9]))\\d{8}$",message="手机号格式不正确")
    private String mobile;

    /**
     * 邮箱
     * user_info.email
     */
    @JsonView(ResultView.DetailView.class)
    @Email(message="邮箱格式不正确")
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
//    @NotBlank(message="密码不能为空")
//    @Size(min=6, max=12,message="密码最小长度6，最大长度12")
    private String password;

    /**
     * im密码
     * user_info.password
     */
    @JsonView(ResultView.DetailView.class)
    private String imPassword;

    /**
     * 用户状态:10未激活/20已激活
     * user_info.status
     */
    @JsonView(ResultView.DetailView.class)
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
    @JsonView(ResultView.DetailView.class)
    private Date gmtCreate;

    /**
     * 是否被我like，用于查看like我的人
     */
    @JsonView(ResultView.UserFollowerView.class)
    private Boolean isFollowee;

    /**
     * 最后修改时间
     * user_info.gmt_modified
     */
    @JsonView(ResultView.AllView.class)
    private Date gmtModified;

    /**
     * 用户简介
     * user_description.description
     */
    @JsonView(ResultView.BriefView.class)
    private String description;

    /**
     * 最后登录时间
     * user_time.lastlogin_time
     */
    @JsonView(ResultView.DetailView.class)
    private Date lastloginTime;

    /**
     * @mbg.generated
     */
    @JsonView(ResultView.BriefView.class)
    private Integer sex;

    /**
     * @mbg.generated
     */
    @JsonView(ResultView.DetailView.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date birthday;

}
