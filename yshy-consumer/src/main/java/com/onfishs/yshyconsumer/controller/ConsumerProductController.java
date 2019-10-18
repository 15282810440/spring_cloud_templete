package com.onfishs.yshyconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author 何欣
 * @date 2019/10/15 18:12
 */
@RestController
@RequestMapping("/consumer")
public class ConsumerProductController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private HttpHeaders httpHeaders;
//
//    @RequestMapping("/product/get")
//    public Object getProduct(Long id){
//        restTemplate
//    }

}
