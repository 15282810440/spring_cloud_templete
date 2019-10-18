package com.onfishs.yshyauth;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@MapperScan("com.onfishs.yshyauth.mapper")
@EnableEurekaClient
public class YshyAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(YshyAuthApplication.class, args);
    }

}
