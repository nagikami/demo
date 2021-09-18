package com.example.myapplication;

import org.springframework.boot.SpringApplication;

public class MySpringBootApplication extends SpringApplication {
    @Override
    protected void logStartupInfo(boolean isRoot) {
        super.logStartupInfo(isRoot);
        getApplicationLog().info("My name is nagi");
    }
}
