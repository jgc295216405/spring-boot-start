package com.test;

import org.springframework.beans.factory.annotation.Value;

import javax.annotation.PostConstruct;

/**
 * @Author hzjiaoguangcai
 * @Date 2022/3/14
 */
public class BeanService {
    public BeanService() {
        System.out.println("BeanService 构造函数");
    }

    @Value("${helloworld.a}")
    public String a;
    @PostConstruct
    public  void init() {
        System.out.println("this is bean serivce.");
    }

    public String getA() {
        System.out.println("geta");
        return a;
    }

    public void setA(String a) {
        System.out.println("seta");
        this.a = a;
    }
}
