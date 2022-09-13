package com.litchi.mall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@MapperScan("com.litchi.mall.product.dao")
@EnableDiscoveryClient
public class LitchimallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(LitchimallProductApplication.class, args);
    }

}
