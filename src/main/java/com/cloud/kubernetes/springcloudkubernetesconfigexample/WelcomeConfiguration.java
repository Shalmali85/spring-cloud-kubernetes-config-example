package com.cloud.kubernetes.springcloudkubernetesconfigexample;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@ConfigurationProperties(prefix = "welcome")
@Configuration
public class WelcomeConfiguration {

    private String message = "Welcome to TechPrimers";

    public String getMessage() {
        return message;
    }
    @Value("${endPointMessage:Welcome to Youtube}")
    private String endPointMessage;

    public String getEndPointMessage() {
        return endPointMessage;
    }

    public void setEndPointMessage(String endPointMessage) {
        this.endPointMessage = endPointMessage;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
