package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @BelongsProject: SpringCloudStudy
 * @BelongsPackage: com.example
 * @Author: SXF
 * @CreateTime: 2023-05-07  11:26
 * @Description: TODO
 * @Version: 1.0
 */
@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashboardApplication {
    public static void main(String[] args) {
        SpringApplication.run(HystrixDashboardApplication.class, args);
    }
}
