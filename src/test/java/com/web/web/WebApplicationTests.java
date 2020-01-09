package com.web.web;

import com.web.web.config.ConfigurationTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class WebApplicationTests {

    @Autowired
    public ConfigurationTest configurationTest;

    @Test
    void contextLoads() {
        System.out.println(configurationTest);
    }

}
