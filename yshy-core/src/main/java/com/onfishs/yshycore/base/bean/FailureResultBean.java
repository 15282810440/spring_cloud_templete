package com.onfishs.yshycore.base.bean;



import lombok.Data;


@Data
public class FailureResultBean extends ResultBean {
    public FailureResultBean(){

    }
    public FailureResultBean(String msg){
        this.msg = msg;
    }
    private boolean success = false;
    private long code = 400;
    private String msg = "failure";
}
