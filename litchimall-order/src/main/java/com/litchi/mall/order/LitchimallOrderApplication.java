package com.litchi.mall.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class LitchimallOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(LitchimallOrderApplication.class, args);
    }

}
