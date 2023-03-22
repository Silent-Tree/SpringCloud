package com.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("order")
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("purchase")
    public String add(){
        String msg = restTemplate.getForObject("http://stock-service/stock/reduce", String.class);
        return "purchase over:"+msg;
    }
}
