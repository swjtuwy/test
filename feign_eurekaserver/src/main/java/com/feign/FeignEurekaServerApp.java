package com.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by test on 8/2/17.
 */
@EnableEurekaServer
@SpringBootApplication
public class FeignEurekaServerApp {

    public static void main(String[] args) {
        SpringApplication.run(FeignEurekaServerApp.class, args);
    }
}
