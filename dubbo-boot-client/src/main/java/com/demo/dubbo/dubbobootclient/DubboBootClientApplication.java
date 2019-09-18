package com.demo.dubbo.dubbobootclient;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo
@SpringBootApplication
public class DubboBootClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboBootClientApplication.class, args);
    }

}
