package com.onfishs.yshyauth.controller;


import com.onfishs.yshyapi.service.auth.ITRolePowerItemService;
import com.onfishs.yshycore.auth.entity.TRolePowerItem;
import com.onfishs.yshycore.auth.entity.base.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author yshy
 * @since 2019-10-17
 */
@RestController
@RequestMapping("//t-role-power-item")
public class TRolePowerItemController extends BaseController<TRolePowerItem, ITRolePowerItemService> {

    @Autowired
    @Override
    protected void setService(ITRolePowerItemService service) {
        this.service = service;
    }
}
