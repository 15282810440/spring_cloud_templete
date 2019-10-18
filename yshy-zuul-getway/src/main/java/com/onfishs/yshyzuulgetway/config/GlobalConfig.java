package com.onfishs.yshyzuulgetway.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//将core包里的组件全部引入进来
@ComponentScan({"com.onfishs.security.config"})
public class GlobalConfig {
}
