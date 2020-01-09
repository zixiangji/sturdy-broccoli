package com.web.web.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ConfigurationTest {

    @Value("${event.baseUrl}")
    private String baseUrl; // ${}是从环境变量中获得，#{SpEL}可以使用表达式计算，

    @Override
    public String toString() {
        return "ConfigurationTest{" +
                "baseUrl='" + baseUrl + '\'' +
                '}';
    }
}
