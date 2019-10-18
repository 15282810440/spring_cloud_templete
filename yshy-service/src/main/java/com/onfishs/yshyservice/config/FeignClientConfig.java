package com.onfishs.yshyservice.config;

import feign.Logger;
import feign.auth.BasicAuthRequestInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * fegin客户端配置
 */
@Configuration
public class FeignClientConfig {

    /**
     * 发起基本请求认证拦截器注入  这个拦截器会拦截请求  每个请求的头部认证信息都会加入当前账号密码
     * @return
     */
    @Bean
    public BasicAuthRequestInterceptor getBasicAuthRequestInterceptor() {
        return new BasicAuthRequestInterceptor("admin", "enjoy");
    }

    /**
     * 注入日志级别 让当前项目输入日志 fegin默认是不打印日志的  FULL 完整的日志
     */
    @Bean
    public Logger.Level getFeignLoggerLevel() {
        return feign.Logger.Level.FULL ;
    }
}
