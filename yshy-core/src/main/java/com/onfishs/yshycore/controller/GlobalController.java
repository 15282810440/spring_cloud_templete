package com.onfishs.yshycore.controller;

import com.onfishs.yshycore.base.bean.ErrorResultBean;
import com.onfishs.yshycore.base.bean.ResultBean;
import com.onfishs.yshycore.exception.DeleteFailedException;
import com.onfishs.yshycore.exception.SaveFailedException;
import com.onfishs.yshycore.exception.UpdateFailedException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 全局控制器
 */
@ControllerAdvice
@ResponseBody
@Slf4j
public class GlobalController {

    /**
     * 保存失败异常
     * @param e
     * @return
     */
    @ExceptionHandler(SaveFailedException.class)
    public ResultBean handSaveFailedException(SaveFailedException e){
        log.error("GlobalController handSaveFailedException error;", e);
        return new ErrorResultBean("保存失败");
    }

    /**
     * 更新失败异常
     * @param e
     * @return
     */
    @ExceptionHandler(UpdateFailedException.class)
    public ResultBean handUpdateFailedException(UpdateFailedException e){
        log.error("GlobalController handUpdateFailedException error;", e);
        return new ErrorResultBean("更新失败");
    }

    /**
     * 删除失败异常
     * @param e
     * @return
     */
    @ExceptionHandler(DeleteFailedException.class)
    public ResultBean handDeleteFailedException(DeleteFailedException e){
        log.error("GlobalController handDeleteFailedException error;", e);
        return new ErrorResultBean("删除失败");
    }

    /**
     * 全局异常
     * @param e
     * @return
     */
    @ExceptionHandler(Exception.class)
    public ResultBean handAllException(Exception e){
        log.error("GlobalController handAllException error;", e);
        return new ErrorResultBean("服务器异常");
    }

}
