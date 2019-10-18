package com.onfishs.yshyauth.controller;


import com.onfishs.yshyapi.service.auth.ITRoleService;
import com.onfishs.yshycore.auth.entity.TRole;
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
@RequestMapping("//t-role")
public class TRoleController extends BaseController<TRole, ITRoleService> {

    @Autowired
    @Override
    protected void setService(ITRoleService service) {
        this.service = service;
    }

    /**
     * 分页查询数据
     * @param condition
     * @return
     */
    @GetMapping("/page")
    public ResultBean page(LayuiPageModel<List<TRole>> layuiPageModel, TRole condition){
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
    public ResultBean updateById(@PathVariable("id") String id, TRole tRole){
        return service.update(id, tRole);
    }
}
