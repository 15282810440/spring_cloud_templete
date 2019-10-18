package com.onfishs.yshycore.util;

import com.onfishs.yshycore.base.bean.FailureResultBean;
import com.onfishs.yshycore.base.bean.ResultBean;
import com.onfishs.yshycore.base.bean.SuccessResultBean;

/**
 * 返回工具类 封装过于重复的代码
 */
public class ReturnUtils {

    public static ResultBean returnUpdateResult(int updateSize){
        if(updateSize < 1){
            return new FailureResultBean("更新失败");
        }
        return new SuccessResultBean("更新成功");
    }
}
