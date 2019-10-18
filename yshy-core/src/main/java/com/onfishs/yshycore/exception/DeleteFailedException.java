package com.onfishs.yshycore.exception;


/**
 *  删除失败异常
 */
public class DeleteFailedException extends RuntimeException {

    public DeleteFailedException(){
        super("删除失败");
    }

    public DeleteFailedException(String message){
        super(message);
    }
}
