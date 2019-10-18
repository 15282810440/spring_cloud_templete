package com.onfishs.yshyauth.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//将core包里的组件全部引入进来
@ComponentScan({"com.onfishs.yshycore"})
public class GlobalConfig {
}
