package com.onfishs.yshyauth.service.impl;

import com.onfishs.yshyapi.service.auth.ITUserExtendService;
import com.onfishs.yshyauth.mapper.TUserExtendMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.onfishs.yshycore.auth.entity.TUserExtend;
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
public class TUserExtendServiceImpl extends ServiceImpl<TUserExtendMapper, TUserExtend> implements ITUserExtendService {

}
