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
@TableName("t_role")
public class TRole extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private String roleName;

    /**
     * 1:正常 0:禁用
     */
    private Integer dataState;

    private String roleDesc;

    private String syssTag;

    private Integer sortIndex;

    /**
     * 1:系统内置账户 0:用户自定义账户
     */
    private Integer dataType;

    private LocalDateTime createTime;

    private String creatorId;


}
