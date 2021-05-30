package com.roger.springcloud.providerdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.roger.springcloud.providerdemo.dao")
//@ComponentScan(basePackages = {"com.roger.springcloud.providerdemo.*"})
// @EnableDiscoveryClient
public class ProviderDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderDemoApplication.class, args);
    }

}
