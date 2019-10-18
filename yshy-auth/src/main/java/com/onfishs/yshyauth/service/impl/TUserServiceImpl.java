package com.onfishs.yshyauth.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.onfishs.yshyapi.service.auth.ITUserService;
import com.onfishs.yshyauth.mapper.TUserMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.onfishs.yshycore.auth.entity.TUser;
import com.onfishs.yshycore.base.bean.FailureResultBean;
import com.onfishs.yshycore.base.bean.LayuiPageModel;
import com.onfishs.yshycore.base.bean.ResultBean;
import com.onfishs.yshycore.base.bean.SuccessResultBean;
import com.onfishs.yshycore.util.PageUtils;
import com.onfishs.yshycore.util.ReturnUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author yshy
 * @since 2019-10-17
 */
@Service
public class TUserServiceImpl extends ServiceImpl<TUserMapper, TUser> implements ITUserService {

    @Override
    public ResultBean page(LayuiPageModel<List<TUser>> layuiPageModel, TUser condition) {
        IPage<TUser> page = PageUtils.getPage(layuiPageModel);
        QueryWrapper<TUser> queryWrapper = new QueryWrapper(condition);
        IPage<TUser> iPage = page(page, queryWrapper);
        layuiPageModel.setData(iPage.getRecords());
        layuiPageModel.setCount(iPage.getTotal());
        return layuiPageModel;
    }

    @Override
    public ResultBean update(String id, TUser tUser) {
        if(StringUtils.isBlank(id)){
            return new FailureResultBean("id不能为空");
        }
        tUser.setId(id);
        int updateSize = getBaseMapper().updateSelective(tUser);
        return ReturnUtils.returnUpdateResult(updateSize);
    }
}
