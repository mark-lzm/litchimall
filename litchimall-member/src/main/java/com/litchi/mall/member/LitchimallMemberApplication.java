package com.litchi.mall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.litchi.mall.member.feign")
public class LitchimallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(LitchimallMemberApplication.class, args);
    }

}
