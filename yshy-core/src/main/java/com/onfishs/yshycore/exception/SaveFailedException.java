package com.onfishs.yshycore.exception;


/**
 *  保存失败异常
 */
public class SaveFailedException extends RuntimeException {

    public SaveFailedException(){
        super("保存失败");
    }

    public SaveFailedException(String message){
        super(message);
    }
}
