package com.order.controller;

import com.order.feign.StockFeginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("order")
public class OrderController {

    @Autowired
    StockFeginService stockFeginService;

    @RequestMapping("add")
    public String add(){
        String msg = stockFeginService.reduce();
        return "over:"+msg;
    }
}
