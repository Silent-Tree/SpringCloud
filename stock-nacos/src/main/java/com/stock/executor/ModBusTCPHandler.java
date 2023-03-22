package com.stock.executor;

import com.xxl.job.core.handler.annotation.XxlJob;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ModBusTCPHandler {

    @Value("${server.port}")
    private String port;

    @XxlJob("ModBusTCP")
    public void ModBusTcp(){
        System.out.println("定时器"+port);
    }
}
