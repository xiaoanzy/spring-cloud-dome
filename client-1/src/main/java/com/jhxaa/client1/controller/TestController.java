package com.jhxaa.client1.controller;

import com.jhxaa.client1.util.ResultUtil;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Random;

@RestController
public class TestController {

    @Autowired
    RestTemplate restTemplate;

    public Object error() {
        return ResultUtil.resultError(1000, "调用失败服务：client-2");
    }

    @GetMapping("test")
    public Object test() {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new Random().nextInt());
        }
        return ResultUtil.resultData(1001, list, "我是client-1");
    }

    @HystrixCommand(fallbackMethod = "error")
    @GetMapping("service")
    public Object service() {
        Object forObject = restTemplate.getForObject("http://client-2/test", Object.class);
        return forObject;
    }
}
