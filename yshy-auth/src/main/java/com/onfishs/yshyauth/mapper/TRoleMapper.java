package com.onfishs.yshyauth.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.onfishs.yshycore.auth.entity.TRole;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author yshy
 * @since 2019-10-17
 */
public interface TRoleMapper extends BaseMapper<TRole> {

    /**
     * 选择性更新数据
     * @param tRole
     * @return
     */
    int updateSelective(TRole tRole);
}
