package com.example.learning;

import org.apache.dubbo.config.spring.beans.factory.annotation.ServiceAnnotationPostProcessor;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

@ImportResource("classpath:dubbo-provider.xml")
@EnableDubbo
@SpringBootApplication
public class DubboProviderApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DubboProviderApplication.class, args);
        ConfigurableListableBeanFactory beanFactory = context.getBeanFactory();
        ServiceAnnotationPostProcessor bean = beanFactory.getBean(ServiceAnnotationPostProcessor.class);
        System.out.println(bean);
        System.out.println("DubboProviderApplication已启动");
    }
}
