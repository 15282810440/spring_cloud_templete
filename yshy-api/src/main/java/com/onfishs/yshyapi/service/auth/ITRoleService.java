package com.onfishs.yshyapi.service.auth;

import com.baomidou.mybatisplus.extension.service.IService;
import com.onfishs.yshycore.auth.entity.TRole;
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
public interface ITRoleService extends IService<TRole> {

    /**
     * 根据id更新数据
     * @param id
     * @param tRole
     * @return
     */
    ResultBean update(String id, TRole tRole);

    /**
     * 分页查询数据
     * @param layuiPageModel
     * @param condition
     * @return
     */
    ResultBean page(LayuiPageModel<List<TRole>> layuiPageModel, TRole condition);
}
