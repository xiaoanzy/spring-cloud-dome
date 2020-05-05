package com.jhxaa.clent2.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
@FeignClient(value = "client-1", fallback = TestFeignServiceImpl.class)
public interface TestFeignService {


    @GetMapping("test")
    Object test();
}
