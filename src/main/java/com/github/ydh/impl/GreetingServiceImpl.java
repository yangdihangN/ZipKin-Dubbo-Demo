package com.github.ydh.impl;

import com.github.ydh.api.GreetingService;
import com.github.ydh.api.HelloService;

import java.util.Random;

public class GreetingServiceImpl implements GreetingService {
    private HelloService helloService;

    public void setHelloService(HelloService helloService) {
        this.helloService = helloService;
    }

    public String greeting(String message) {
        try {
            // 通过 sleep 模拟业务逻辑处理时间
            Thread.sleep(new Random(System.currentTimeMillis()).nextInt(1000));
        } catch (InterruptedException e) {
            // no op
        }
        return "greeting, " + helloService.hello(message);
    }
}
