package com.example.myapplication.customizerunner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(0)
public class MyCommandLineRunner implements CommandLineRunner {
    //called just before SpringApplication.run(…) completes
    @Override
    public void run(String... args) throws Exception {
        System.out.println("CommandLineRunner start");
    }
}
