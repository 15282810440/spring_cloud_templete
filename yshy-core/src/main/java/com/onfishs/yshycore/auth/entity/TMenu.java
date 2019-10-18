package com.onfishs.yshycore.auth.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.onfishs.yshycore.auth.entity.base.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

/**
 * <p>
 * 菜单标识中隐含着上下级关系。
 * </p>
 *
 * @author yshy
 * @since 2019-10-17
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("t_menu")
public class TMenu extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 格式：YSChargeSystem.YSOrderManagePal.Menu.001（系统集标识.系统标识.Menu.XXX）
     */
    private String menuCode;

    /**
     * 格式 ：YSChargeSystem.YSOrderManagePal.Menu
     */
    private String parentMenuCode;

    private String link;

    private String name;

    private Integer dataState;

    private String menuDesc;

    private Integer sortIndex;

    /**
     * 如：YSChargeSystem
     */
    private String syssTag;

    /**
     * 如：YSOrderManagePal
     */
    private String sysTag;

    /**
     * 如：UserManager
     */
    private String menuTag;

    /**
     * 1:系统内置账户 0:用户自定义账户
     */
    private Integer dataType;

    private String iconUrl;

    private LocalDateTime createTime;

    private String creatorId;


}
