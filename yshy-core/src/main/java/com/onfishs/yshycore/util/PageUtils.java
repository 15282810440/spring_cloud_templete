package com.onfishs.yshycore.util;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.onfishs.yshycore.base.bean.LayuiPageModel;

/**
 * 分页工具类  重复代码包装
 */
public class PageUtils {

    public static Page getPage(LayuiPageModel layuiPageModel){
        Page page = new Page();
        page.setCurrent(layuiPageModel.getPage());
        page.setSize(layuiPageModel.getLimit());
        return page;
    }
}
