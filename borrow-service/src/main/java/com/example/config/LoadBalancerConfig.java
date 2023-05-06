//package com.example.config;
//
//import org.springframework.cloud.client.ServiceInstance;
//import org.springframework.cloud.loadbalancer.core.RandomLoadBalancer;
//import org.springframework.cloud.loadbalancer.core.ReactorLoadBalancer;
//import org.springframework.cloud.loadbalancer.core.ServiceInstanceListSupplier;
//import org.springframework.cloud.loadbalancer.support.LoadBalancerClientFactory;
//import org.springframework.context.annotation.Bean;
//import org.springframework.core.env.Environment;
//
///**
// * @BelongsProject: SpringCloudStudy
// * @BelongsPackage: com.example.controller
// * @Author: SXF
// * @CreateTime: 2023-05-06  21:09
// * @Description: TODO
// * @Version: 1.0
// */
//public class LoadBalancerConfig {
//    @Bean
//    public ReactorLoadBalancer<ServiceInstance> randomLoadBalancer(Environment environment, LoadBalancerClientFactory loadBalancerClientFactory) {
//        String property = environment.getProperty(LoadBalancerClientFactory.PROPERTY_NAME);
//        return new RandomLoadBalancer(loadBalancerClientFactory.getLazyProvider(property, ServiceInstanceListSupplier.class), property);
//    }
//}
