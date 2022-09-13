package com.litchi.mall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class LitchimallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(LitchimallMemberApplication.class, args);
    }

}
