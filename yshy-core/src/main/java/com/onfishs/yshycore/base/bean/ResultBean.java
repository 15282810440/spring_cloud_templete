package com.onfishs.yshycore.base.bean;



import lombok.Data;

import java.io.Serializable;

@Data
public class ResultBean<T> implements Serializable {
    public ResultBean(){

    }
    private boolean success = false;
    private long code = 0;
    private String msg = "ok";
    private T data;
}
