package com.onfishs.yshycore.auth.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.onfishs.yshycore.auth.entity.base.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

/**
 * <p>
 * 菜单下有哪些权限项，比如一个菜单页里面有新增、删除、查询、导出、修改等权限项
 * </p>
 *
 * @author yshy
 * @since 2019-10-17
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("t_menu_power_item")
public class TMenuPowerItem extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private String menuCode;

    /**
     * 格式：1访问 2新增 4修改 8删除 16查询明细 32查询
     */
    private Integer itemValue;

    /**
     * 如：页面访问权限
     */
    private String itemName;

    /**
     * 如：Visit
     */
    private String itemMethod;

    /**
     * 1:系统内置账户 0:用户自定义账户
     */
    private Integer dataType;

    private LocalDateTime createTime;

    private String creatorId;


}
