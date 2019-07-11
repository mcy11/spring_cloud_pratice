package com.example.mcy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class McyApplication {

    public static void main(String[] args) {
        SpringApplication.run(McyApplication.class, args);
    }

}
