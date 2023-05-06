package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @BelongsProject: SpringCloudStudy
 * @BelongsPackage: com.example
 * @Author: SXF
 * @CreateTime: 2023-05-04  18:30
 * @Description: TODO
 * @Version: 1.0
 */
@SpringBootApplication
@EnableFeignClients
@EnableHystrix
public class BorrowApplication {
    public static void main(String[] args) {
        SpringApplication.run(BorrowApplication.class, args);
    }
}