package com.onfishs.yshyauth.controller;


import com.onfishs.yshyapi.service.auth.ITMenuService;
import com.onfishs.yshycore.auth.entity.TMenu;
import com.onfishs.yshycore.auth.entity.base.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 菜单标识中隐含着上下级关系。 前端控制器
 * </p>
 *
 * @author yshy
 * @since 2019-10-17
 */
@RestController
@RequestMapping("//t-menu")
public class TMenuController extends BaseController<TMenu, ITMenuService> {

    @Autowired
    @Override
    protected void setService(ITMenuService service) {
        this.service = service;
    }
}
