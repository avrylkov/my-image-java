package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.properties")
public class MyConfiguration {

    @Value("${version.app}")
    private String versionapp;

    public String getVersionapp() {
        return versionapp;
    }
}
