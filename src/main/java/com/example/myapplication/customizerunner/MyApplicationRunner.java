package com.example.myapplication.customizerunner;

import org.springframework.beans.factory.config.YamlPropertiesFactoryBean;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class MyApplicationRunner implements ApplicationRunner
{
    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("ApplicationRunner start");
    }
}
