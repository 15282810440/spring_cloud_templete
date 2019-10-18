package com.onfishs.yshyauth.service.impl;

import com.onfishs.yshyapi.service.auth.ITMenuPowerItemService;
import com.onfishs.yshyauth.mapper.TMenuPowerItemMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.onfishs.yshycore.auth.entity.TMenuPowerItem;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 菜单下有哪些权限项，比如一个菜单页里面有新增、删除、查询、导出、修改等权限项 服务实现类
 * </p>
 *
 * @author yshy
 * @since 2019-10-17
 */
@Service
public class TMenuPowerItemServiceImpl extends ServiceImpl<TMenuPowerItemMapper, TMenuPowerItem> implements ITMenuPowerItemService {

}
