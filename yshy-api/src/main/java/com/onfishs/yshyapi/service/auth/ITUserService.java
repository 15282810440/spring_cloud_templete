package com.onfishs.yshyapi.service.auth;

import com.baomidou.mybatisplus.extension.service.IService;
import com.onfishs.yshycore.auth.entity.TUser;
import com.onfishs.yshycore.base.bean.LayuiPageModel;
import com.onfishs.yshycore.base.bean.ResultBean;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author yshy
 * @since 2019-10-17
 */
public interface ITUserService extends IService<TUser> {

    /**
     * 分页查询数据
     * @param layuiPageModel
     * @param condition
     * @return
     */
    ResultBean page(LayuiPageModel<List<TUser>> layuiPageModel, TUser condition);

    /**
     * 更新用户数据
     * @param id
     * @param tUser
     * @return
     */
    ResultBean update(String id, TUser tUser);
}
