package com.test;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Author hzjiaoguangcai
 * @Date 2022/3/14
 */
@ConfigurationProperties(prefix = "helloworld")
public class HelloWorldProperties {
    public static final String PREFIX= "helloworld";
    /**
     * 姓名，表示谁将会说这句话
     * */
    private String username;

    public static String getPREFIX() {
        return PREFIX;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
