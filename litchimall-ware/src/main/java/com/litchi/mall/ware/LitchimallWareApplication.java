package com.litchi.mall.ware;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class LitchimallWareApplication {

    public static void main(String[] args) {
        SpringApplication.run(LitchimallWareApplication.class, args);
    }

}
