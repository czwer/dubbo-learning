package com.example.learning;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

@ImportResource("classpath:dubbo-consumer.xml")
@EnableDubbo
@SpringBootApplication
public class DubboConsumerApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DubboConsumerApplication.class, args);
        ConfigurableListableBeanFactory beanFactory = context.getBeanFactory();
        System.out.println("DubboConsumerApplication已启动");
    }
}
