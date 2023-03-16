package com.nacos.config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NacosConfigController {
    @Value("${user.name}")
    private String userName;

    @RequestMapping("name")
    public String getUserName(){
        return userName;
    }
}
