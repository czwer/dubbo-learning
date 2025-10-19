package com.example.learning;

import com.alibaba.fastjson.JSON;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ArrayListMultimap;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

@ImportResource({"classpath:dubbo-provider.xml","classpath:spring-beans.xml"})
@EnableDubbo
@SpringBootApplication
public class DubboProviderApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DubboProviderApplication.class, args);
        ConfigurableListableBeanFactory beanFactory = context.getBeanFactory();
        String[] beanDefinitionNames = beanFactory.getBeanDefinitionNames();
        ArrayListMultimap arrayListMultimap = ArrayListMultimap.create();
        for (String beanDefinitionName : beanDefinitionNames){
            BeanDefinition beanDefinition = beanFactory.getBeanDefinition(beanDefinitionName);
            String name = beanDefinition.getClass().getName();
            arrayListMultimap.put(name, MoreObjects.firstNonNull(beanDefinition.getBeanClassName(),"bean名称："+beanDefinitionName));
        }
        System.out.println(JSON.toJSONString(arrayListMultimap));
        System.out.println("DubboProviderApplication已启动");
    }
}
