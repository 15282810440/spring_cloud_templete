package com.onfishs.yshycore.base.bean;



import lombok.Data;


@Data
public class ErrorResultBean extends ResultBean {
    public ErrorResultBean(){

    }
    public ErrorResultBean(String msg){
        this.msg = msg;
    }
    private boolean success = false;
    private long code = 500;
    private String msg = "error";
}
