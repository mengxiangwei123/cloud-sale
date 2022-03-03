package com.jk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@EnableFeignClients// 开启feign注解
public class SaleConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SaleConsumerApplication.class, args);
    }

}
