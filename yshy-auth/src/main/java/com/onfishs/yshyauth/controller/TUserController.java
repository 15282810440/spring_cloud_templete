package com.onfishs.yshyauth.controller;


import com.onfishs.yshyapi.service.auth.ITUserService;
import com.onfishs.yshycore.auth.entity.TUser;
import com.onfishs.yshycore.auth.entity.base.BaseController;
import com.onfishs.yshycore.base.bean.LayuiPageModel;
import com.onfishs.yshycore.base.bean.ResultBean;
import com.onfishs.yshycore.util.ReflexUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author yshy
 * @since 2019-10-17
 */
@RestController
@RequestMapping("//t-user")
public class TUserController extends BaseController<TUser, ITUserService> {

    @Autowired
    @Override
    protected void setService(ITUserService service) {
        this.service = service;
    }

    /**
     * 分页查询数据
     * @param condition
     * @return
     */
    @GetMapping("/page")
    public ResultBean page(LayuiPageModel<List<TUser>> layuiPageModel, TUser condition){
        ReflexUtils.checkEmptyIntoNull(condition);
        ResultBean resultBean = service.page(layuiPageModel, condition);
        return resultBean;
    }

    /**
     * 更新数据
     * @param id
     * @return
     */
    @PutMapping("/update/{id}")
    public ResultBean updateById(@PathVariable("id") String id, TUser tUser){
        return service.update(id, tUser);
    }


}
