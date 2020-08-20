package com.example.demo.manage;

import com.example.demo.service.FunService;
import org.springframework.util.StringUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 工厂模式 策略模式
 */
public class FunFactory {
    private final static Map<String, FunService> map = new HashMap<>();


    public static FunService getService(String str) {
        return map.get(str);
    }

    public static void register(String str, FunService service) {
        if (StringUtils.isEmpty(str) || Objects.isNull(service)) return;
        map.put(str, service);
    }
}
