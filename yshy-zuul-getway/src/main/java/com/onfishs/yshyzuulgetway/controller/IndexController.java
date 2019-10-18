package com.onfishs.yshyzuulgetway.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 何欣
 * @date 2019/10/18 13:34
 */
@RestController
@RequestMapping("/index")
public class IndexController {

    @RequestMapping
    public String index(){
        return "index";
    }
}
