package com.logistics.transfer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.logistics.transfer")
public class CheapestTransferRouteApplication {
    public static void main(String[] args) {
        SpringApplication.run(CheapestTransferRouteApplication.class, args);
    }
}
