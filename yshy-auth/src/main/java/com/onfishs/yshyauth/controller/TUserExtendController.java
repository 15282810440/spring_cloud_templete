package com.onfishs.yshyauth.controller;


import com.onfishs.yshyapi.service.auth.ITUserExtendService;
import com.onfishs.yshycore.auth.entity.TUserExtend;
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
@RequestMapping("//t-user-extend")
public class TUserExtendController extends BaseController<TUserExtend, ITUserExtendService> {

    @Autowired
    @Override
    protected void setService(ITUserExtendService service) {
        this.service = service;
    }



}
