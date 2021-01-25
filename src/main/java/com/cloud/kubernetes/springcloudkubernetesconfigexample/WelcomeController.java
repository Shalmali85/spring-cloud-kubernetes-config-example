package com.cloud.kubernetes.springcloudkubernetesconfigexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.core.env.Environment;
@RequestMapping("/api")
@RestController
public class WelcomeController {

    @Autowired
    WelcomeConfiguration config;

    @Autowired
    Environment environment;

    @GetMapping("/message")
    public String welcome() {
        System.out.println(config.getEndPointMessage());
        return config.getEndPointMessage();
    }
    @GetMapping("/url")
    public String getFromEnvironment() {
        System.out.println(environment.getProperty(WelcomeConstant.URL));
        return environment.getProperty(WelcomeConstant.URL);
    }
}
