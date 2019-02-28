package com.github.ydh.impl;

import com.github.ydh.api.GreetingService;
import com.github.ydh.api.HelloService;

public class HelloServiceImpl implements HelloService {

    public String hello(String message) {
        return "hello, "+message;
    }
}
