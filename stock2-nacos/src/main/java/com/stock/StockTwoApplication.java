package com.stock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
public class StockTwoApplication {
    public static void main(String[] args) {
        SpringApplication.run(StockTwoApplication.class,args);
    }
}
