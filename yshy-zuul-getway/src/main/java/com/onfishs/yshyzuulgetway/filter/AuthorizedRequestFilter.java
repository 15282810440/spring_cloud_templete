package com.onfishs.yshyzuulgetway.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;

import java.nio.charset.Charset;
import java.util.Base64;

/**
 * 转发拦截器
 */
public class AuthorizedRequestFilter extends ZuulFilter {
    //	pre：在请求发出之前执行过滤，如果要进行访问，肯定在请求前设置头信息
    //	route：在进行路由请求的时候被调用；
    //	post：在路由之后发送请求信息的时候被调用；
    //	error：出现错误之后进行调用
    //拦截级别
    @Override
    public String filterType() {
        return FilterConstants.PRE_TYPE;
    }
    //拦截顺序
    @Override
    public int filterOrder() {
        return 0;
    }
    //是否拦截
    @Override
    public boolean shouldFilter() {
        return true;
    }
    //运行  需要自己做得事情
    @Override
    public Object run() throws ZuulException {
        RequestContext currentContext = RequestContext.getCurrentContext() ; // 获取当前请求的上下文
        String auth = "admin:enjoy"; // 认 证的原始信息
        byte[] encodedAuth = Base64.getEncoder()
                .encode(auth.getBytes(Charset.forName("US-ASCII"))); // 进行一个加密的处理
        String authHeader = "Basic " + new String(encodedAuth);
        currentContext.addZuulRequestHeader("Authorization", authHeader);
        return null;

    }
}
