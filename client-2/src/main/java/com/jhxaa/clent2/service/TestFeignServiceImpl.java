package com.jhxaa.clent2.service;

import com.jhxaa.clent2.util.ResultUtil;
import org.springframework.stereotype.Service;

@Service
public class TestFeignServiceImpl implements TestFeignService {
    @Override
    public Object test() {
        return ResultUtil.resultError(1000, "调用失败服务：client-1");

    }
}
