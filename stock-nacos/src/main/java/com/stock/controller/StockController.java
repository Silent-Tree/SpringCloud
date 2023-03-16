package com.stock.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("stock")
public class StockController {

    @Value("${server.port}")
    private String port;

    @RequestMapping("reduce")
    public String reduce(){
        System.out.println("reduce stock!"+port);
        return "Hello"+port;
    }
}
