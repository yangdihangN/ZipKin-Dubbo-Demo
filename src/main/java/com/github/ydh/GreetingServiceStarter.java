package com.github.ydh;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class GreetingServiceStarter {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("greeting.xml");
        context.start();

        System.out.println("Greeting service started");
        // press any key to exit
        System.in.read();
    }
}
