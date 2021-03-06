package com.jhxaa.clent2.controller;

import com.jhxaa.clent2.util.ResultUtil;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ErrorController {

    @RequestMapping("error_{code}")
    public Object error(@PathVariable int code) {
        String message = "";
        if (code == 404) {
            message = "client-2提示：找不到页面";
        }
        return ResultUtil.resultError(code, message);
    }
}
