package com.royce.servicey;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ServiceYApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceYApplication.class, args);
    }

}
