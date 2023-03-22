package com.nacos.config.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RefreshScope
public class NacosConfigController {
    @Value("${user.name}")
    private String userName;

    @Autowired
    private Environment environment;

    @RequestMapping("name")
    public String getUserName(){
        String name = environment.getProperty("user.name");
        System.out.println(name);
        return userName;
    }
}
