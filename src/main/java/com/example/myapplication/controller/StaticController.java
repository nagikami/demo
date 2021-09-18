package com.example.myapplication.controller;

import com.example.myapplication.customizebean.MyProperties;
import com.example.myapplication.stateManager.MyLocalCacheVerifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StaticController {
    private final MyLocalCacheVerifier myLocalCacheVerifier;

    private final MyProperties myProperties;

    public StaticController(MyLocalCacheVerifier myLocalCacheVerifier, MyProperties myProperties) {
        this.myLocalCacheVerifier = myLocalCacheVerifier;
        this.myProperties = myProperties;
    }

    @RequestMapping("/hello")
    public String sayHello() {
        return "hello";
    }

    @RequestMapping("/state")
    public void getState() {
        myLocalCacheVerifier.checkLocalCache();
    }

    @GetMapping("/user")
    public String getUserInfo() {
        StringBuilder result = new StringBuilder();
        result.append("user")
                .append(myProperties.getSecurity().getUsername())
                .append("password")
                .append(myProperties.getSecurity().getPassword())
                .append(myProperties.getSecurity().getRoles());
        return String.valueOf(result);
    }
}
