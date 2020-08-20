package com.example.demo;

import com.example.demo.manage.FunFactory;
import com.example.demo.service.FunService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.StringUtils;

import java.util.UUID;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {

    }

    @Test
    void test() {
        String str = "A";
        FunService service = FunFactory.getService(str);
        service.fun1();
    }

}
