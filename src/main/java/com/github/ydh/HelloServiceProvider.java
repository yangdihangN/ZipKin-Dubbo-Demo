package com.github.ydh;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class HelloServiceProvider {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("hello.xml");
        context.start();

        System.out.println("Hello service started");
        // press any key to exit
        System.in.read();
    }
}
