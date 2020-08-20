package com.example.demo.service.impl;

import com.example.demo.manage.FunFactory;
import com.example.demo.service.FunService;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class AService extends FunService {

    @Override
    public void fun1() {
        System.out.println("A的方法1");
    }

    @Override
    public void fun2() {
        System.out.println("A的方法2");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        FunFactory.register("A", this);

    }
}
