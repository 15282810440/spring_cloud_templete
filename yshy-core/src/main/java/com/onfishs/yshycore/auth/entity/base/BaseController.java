package com.onfishs.yshycore.auth.entity.base;

import com.baomidou.mybatisplus.extension.service.IService;
import com.onfishs.yshycore.auth.entity.TUser;
import com.onfishs.yshycore.base.bean.FailureResultBean;
import com.onfishs.yshycore.base.bean.ResultBean;
import com.onfishs.yshycore.base.bean.SuccessResultBean;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.*;


public abstract class BaseController<T extends BaseEntity, S extends IService<T>> {
    protected S service;

    protected abstract void setService(S service);


    /**
     * 保存用户信息
     * @param entity
     * @return
     */
    @PostMapping("save")
    public ResultBean save(T entity){
        if(service.save(entity)){
            return new SuccessResultBean("保存成功");
        }
        return new FailureResultBean("保存失败");
    }

    /**
     * 根据id获取用户信息
     * @param id
     * @return
     */
    @GetMapping("/get/{id}")
    public ResultBean get(@PathVariable("id") String id){
        if(StringUtils.isBlank(id)){
            return new FailureResultBean("id不能为空");
        }
        T entity = service.getById(id);
        return new SuccessResultBean(entity);
    }


    /**
     * 根据id删除数据
     * @param id
     * @return
     */
    @DeleteMapping("/delete/{id}")
    public ResultBean delete(@PathVariable("id") String id){
        if(StringUtils.isBlank(id)){
            return new FailureResultBean("id不能为空");
        }
        if(!service.removeById(id)){
            return new FailureResultBean("删除失败");
        }
        return new SuccessResultBean("删除成功");
    }


    /**
     * 更新数据
     * @param
     * @return
     */
    @PutMapping("/update")
    public ResultBean update(T entity){
        if(!service.updateById(entity)){
            return new FailureResultBean("更新失败");
        }
        return new SuccessResultBean("更新成功");
    }
}
