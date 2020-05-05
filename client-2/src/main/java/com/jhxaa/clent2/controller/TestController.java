package com.jhxaa.clent2.controller;

import com.jhxaa.clent2.service.TestFeignService;
import com.jhxaa.clent2.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Random;

@RestController
public class TestController {


    @Autowired
    TestFeignService testFeignService;

    @GetMapping("test")
    public Object test() {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new Random().nextInt());
        }
        return ResultUtil.resultData(1002, list, "我是client-2");
    }


    @GetMapping("service")
    public Object service() {
        Object test = testFeignService.test();
//        Object forObject = restTemplate.getForObject("http://client-2/test", Object.class);
//        return forObject;
        return test;
    }

}
