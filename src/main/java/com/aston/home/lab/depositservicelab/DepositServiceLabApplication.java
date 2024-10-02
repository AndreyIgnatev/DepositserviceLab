package com.aston.home.lab.depositservicelab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class DepositServiceLabApplication {

    public static void main(String[] args) {
        SpringApplication.run(DepositServiceLabApplication.class, args);
    }

}
