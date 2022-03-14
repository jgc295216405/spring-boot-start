package com.test;

import javax.annotation.PostConstruct;

/**
 * @Author hzjiaoguangcai
 * @Date 2022/3/14
 */
public class Service2 {
    @PostConstruct
    public  void inti() {
        System.out.println("post Service2");
    }

}
