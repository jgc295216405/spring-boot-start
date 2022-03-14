package com.test;

/**
 * @Author hzjiaoguangcai
 * @Date 2022/3/14
 */
public class HelloWorldTemplate {
    private String username;

    public String sayHello() {
        return username + ":HelloWorld";
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
