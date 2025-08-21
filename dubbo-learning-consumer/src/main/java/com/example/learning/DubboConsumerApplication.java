package com.example.learning;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@ImportResource("classpath:dubbo-consumer.xml")
@EnableDubbo
@SpringBootApplication
public class DubboConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(DubboConsumerApplication.class, args);
        System.out.println("DubboConsumerApplication已启动");
    }
}
