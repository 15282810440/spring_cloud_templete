package com.onfishs.yshycore.base.bean;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LayuiPageModel<T> extends SuccessResultBean<T> implements Serializable {
    //默认成功
    private long code = 0;
    //查询记录数
    private long count = 0;
    //每页多少条数据
    private long limit = 10;
    //第几页
    private long page = 1;
}
