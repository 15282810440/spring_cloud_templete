package com.onfishs.yshyservice.auth.fallback;

import com.onfishs.yshyservice.auth.service.IZuulAuthClientService;
import com.onfishs.yshyservice.auth.service.impl.DefaultZuulAuthClientServiceImpl;
import feign.hystrix.FallbackFactory;

/**
 * 失败返回策略 和 熔断返回策略
 */
public class ZuulAuthClientServiceBackFactory implements FallbackFactory<IZuulAuthClientService> {

    @Override
    public IZuulAuthClientService create(Throwable throwable) {
        return new DefaultZuulAuthClientServiceImpl();
    }
}
