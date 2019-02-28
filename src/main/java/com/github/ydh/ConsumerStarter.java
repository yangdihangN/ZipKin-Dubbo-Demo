package com.github.ydh;

import com.github.ydh.api.GreetingService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConsumerStarter {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        context.start();
        // 获取远程代理并发起调用
        GreetingService greetingService = (GreetingService) context.getBean("greetingService");
        System.out.println(greetingService.greeting("world"));
    }
}
