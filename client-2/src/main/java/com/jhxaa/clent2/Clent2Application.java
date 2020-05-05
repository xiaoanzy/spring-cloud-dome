package com.jhxaa.clent2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableEurekaClient//开启一个服务端
@EnableFeignClients//开启服务调用与负载均衡，默认实现@EnableCircuitBreaker的断路器功能
@SpringBootApplication
public class Clent2Application {

    public static void main(String[] args) {
        SpringApplication.run(Clent2Application.class, args);
    }

}
