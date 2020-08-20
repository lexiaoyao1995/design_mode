package com.example.demo.service;

import org.springframework.beans.factory.InitializingBean;

/**
 * 模版方法设计模式
 */
public abstract class FunService implements InitializingBean {
    public void fun1() {
        throw new UnsupportedOperationException();
    }

    public void fun2() {
        throw new UnsupportedOperationException();
    }
}
