package com.test.start2;

import com.test.BeanService;
import com.test.HelloWorldTemplate;
import com.test.Service2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * @Author hzjiaoguangcai
 * @Date 2022/3/14
 */
@Service
public class TestService {
    @Autowired
    BeanService beanService;
    @Autowired
    Service2 service2;
    @Autowired
    private HelloWorldTemplate helloWorldTemplate;
    @PostConstruct
    public void init() {
        String helloWorldName = helloWorldTemplate.sayHello();
        System.out.println(helloWorldName);
        String aa = beanService.a;
        System.out.println(aa);
    }
}
