package com.stock;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.stock.dao")
public class StockOneApplication {
    public static void main(String[] args) {
        SpringApplication.run(StockOneApplication.class,args);
    }
}
