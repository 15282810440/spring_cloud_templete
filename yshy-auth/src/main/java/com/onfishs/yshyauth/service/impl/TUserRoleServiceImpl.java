package com.onfishs.yshyauth.service.impl;

import com.onfishs.yshyapi.service.auth.ITUserRoleService;
import com.onfishs.yshyauth.mapper.TUserRoleMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.onfishs.yshycore.auth.entity.TUserRole;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author yshy
 * @since 2019-10-17
 */
@Service
public class TUserRoleServiceImpl extends ServiceImpl<TUserRoleMapper, TUserRole> implements ITUserRoleService {

}
