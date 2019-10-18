package com.onfishs.yshyconsumer.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;

/**
 * @author 何欣
 * @date 2019/10/16 9:15
 */
public class RibbonConfig {

    @Bean
    public IRule ribbonRule(){
        return new RandomRule();
    }

}
