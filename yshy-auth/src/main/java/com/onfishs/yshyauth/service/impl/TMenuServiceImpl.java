package com.onfishs.yshyauth.service.impl;

import com.onfishs.yshyapi.service.auth.ITMenuService;
import com.onfishs.yshyauth.mapper.TMenuMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.onfishs.yshycore.auth.entity.TMenu;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 菜单标识中隐含着上下级关系。 服务实现类
 * </p>
 *
 * @author yshy
 * @since 2019-10-17
 */
@Service
public class TMenuServiceImpl extends ServiceImpl<TMenuMapper, TMenu> implements ITMenuService {

}
