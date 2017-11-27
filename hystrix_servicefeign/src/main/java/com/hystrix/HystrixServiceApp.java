package com.hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * Created by test on 8/2/17.
 */

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class HystrixServiceApp {

    public static void main(String[] args) {
        SpringApplication.run(HystrixServiceApp.class, args);
    }
}
