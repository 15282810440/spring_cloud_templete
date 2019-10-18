package com.onfishs.yshycore.auth.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.onfishs.yshycore.auth.entity.base.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

/**
 * <p>
 *
 * </p>
 *
 * @author yshy
 * @since 2019-10-17
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("t_user")
public class TUser extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private String username;

    private String loginAccount;

    private String password;

    private String address;

    private LocalDateTime loginTime;

    private String loginIp;

    /**
     * 1:启用 0:禁用
     */
    private Integer dataState;

    private LocalDateTime createTime;

    private String creatorId;

    private String mail;

    private String phone;

    private String userDesc;

    private String qq;

    private String wx;

    /**
     * 格式：124.251.57.65-124.251.57.70,183.84.4.1-183.84.4.6,183.84.4.11-183.84.4.63
     */
    private String bindIp;

    /**
     * 0:无验证 1:邮箱 2:手机验证码 3:图片验证码 4:微信验证
     */
    private Integer securityCertType;

    private String syssTag;

    private Integer sortIndex;

    /**
     * 1:系统内置账户 0:用户自定义账户
     */
    private Integer dataType;


}
