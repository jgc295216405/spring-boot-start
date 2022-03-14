package com.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author hzjiaoguangcai
 * @Date 2022/3/14
 */
@Configuration
@EnableConfigurationProperties(HelloWorldProperties.class)
public class HelloWorldAutoConfiguration {

    @Autowired
    HelloWorldProperties helloWorldProperties;
    @Bean
    @ConditionalOnMissingBean(HelloWorldTemplate.class)
    public HelloWorldTemplate helloWorldTemplate(){
        HelloWorldTemplate helloWorldTemplate = new HelloWorldTemplate();
        helloWorldTemplate.setUsername(helloWorldProperties.getUsername());
        return helloWorldTemplate;
    }
    @Bean
    @ConditionalOnMissingBean(BeanService.class)
    public BeanService beanService(){
        return new BeanService();
    }
}
