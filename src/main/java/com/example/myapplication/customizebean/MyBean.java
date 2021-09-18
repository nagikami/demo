package com.example.myapplication.customizebean;

import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

import java.util.List;

//@Component
public class MyBean {
    public MyBean(ApplicationArguments args) {
        List<String> files = args.getNonOptionArgs();
        System.out.println(files);
    }
}
