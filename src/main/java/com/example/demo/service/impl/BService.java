package com.example.demo.service.impl;

import com.example.demo.manage.FunFactory;
import com.example.demo.service.FunService;

public class BService extends FunService {
    @Override
    public void fun1() {
        System.out.println("B fun 1");
    }


    @Override
    public void afterPropertiesSet() throws Exception {
        FunFactory.register("B", this);
    }
}
