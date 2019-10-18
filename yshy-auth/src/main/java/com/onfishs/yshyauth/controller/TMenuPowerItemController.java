package com.onfishs.yshyauth.controller;


import com.onfishs.yshyapi.service.auth.ITMenuPowerItemService;
import com.onfishs.yshycore.auth.entity.TMenuPowerItem;
import com.onfishs.yshycore.auth.entity.base.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 菜单下有哪些权限项，比如一个菜单页里面有新增、删除、查询、导出、修改等权限项 前端控制器
 * </p>
 *
 * @author yshy
 * @since 2019-10-17
 */
@RestController
@RequestMapping("//t-menu-power-item")
public class TMenuPowerItemController extends BaseController<TMenuPowerItem, ITMenuPowerItemService> {

    @Autowired
    @Override
    protected void setService(ITMenuPowerItemService service) {
        this.service = service;
    }
}
