package com.jhxaa.clent2.util;


import java.util.HashMap;

public class ResultUtil {

    public static Object resultError(Integer code, String message) {
        return new HashMap<String, Object>() {
            {
                put("code", code);
                put("message", message);
            }
        };
    }

    public static Object resultData(Integer code, Object data, String message) {
        return new HashMap<String, Object>() {
            {
                put("code", code);
                put("data", data);
                put("message", message);
            }
        };
    }
}
