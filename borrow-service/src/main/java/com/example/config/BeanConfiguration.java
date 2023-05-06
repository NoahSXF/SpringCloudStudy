//package com.example.config;
//
//import org.springframework.cloud.client.loadbalancer.LoadBalanced;
//import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.client.RestTemplate;
//
///**
// * @BelongsProject: SpringCloundStudy
// * @BelongsPackage: com.example.config
// * @Author: SXF
// * @CreateTime: 2023-05-05  18:51
// * @Description: TODO
// * @Version: 1.0
// */
//@Configuration
//@LoadBalancerClient(value = "userService", configuration = LoadBalancerConfig.class)
//public class BeanConfiguration {
//
//    @Bean
//    @LoadBalanced
//    public RestTemplate restTemplate() {
//        return new RestTemplate();
//    }
//}
