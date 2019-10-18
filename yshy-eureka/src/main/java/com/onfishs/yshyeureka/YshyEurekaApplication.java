package com.onfishs.yshyeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class YshyEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(YshyEurekaApplication.class, args);
    }

}
