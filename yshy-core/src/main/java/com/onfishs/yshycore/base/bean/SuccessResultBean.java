package com.onfishs.yshycore.base.bean;



import lombok.Data;


@Data
public class SuccessResultBean<T> extends ResultBean<T> {
    public SuccessResultBean(){

    }
    public SuccessResultBean(T data){
        this.data = data;
    }
    public SuccessResultBean(String msg){
        this.msg = msg;
    }
    private boolean success = true;
    private long code = 200;
    private String msg = "ok";
    private T data;

}
