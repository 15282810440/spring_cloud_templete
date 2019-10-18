package com.onfishs.yshycore.exception;


/**
 *  更新失败异常
 */
public class UpdateFailedException extends RuntimeException {

    public UpdateFailedException(){
        super("更新失败");
    }

    public UpdateFailedException(String message){
        super(message);
    }
}
