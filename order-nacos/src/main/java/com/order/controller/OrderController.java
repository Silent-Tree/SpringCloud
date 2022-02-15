package com.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("order")
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("add")
    public String add(){
        String msg = restTemplate.getForObject("http://stockNacos/stock/reduce", String.class);
        return "over:"+msg;
    }
}
