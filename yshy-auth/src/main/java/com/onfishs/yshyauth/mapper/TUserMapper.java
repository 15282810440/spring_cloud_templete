package com.onfishs.yshyauth.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.onfishs.yshycore.auth.entity.TUser;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author yshy
 * @since 2019-10-17
 */
public interface TUserMapper extends BaseMapper<TUser> {

    /**
     * 选择性更新数据
     * @param tUser
     * @return
     */
    int updateSelective(TUser tUser);
}
