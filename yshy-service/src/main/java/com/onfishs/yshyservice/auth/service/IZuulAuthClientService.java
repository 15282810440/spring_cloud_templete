package com.onfishs.yshyservice.auth.service;

import com.onfishs.yshyservice.auth.fallback.ZuulAuthClientServiceBackFactory;
import com.onfishs.yshyservice.config.FeignClientConfig;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * 验证项目客户端远程调用服务
 */
@FeignClient(name="yshy-zuul-gateway", configuration = FeignClientConfig.class, fallbackFactory = ZuulAuthClientServiceBackFactory.class)
public interface IZuulAuthClientService {



}
