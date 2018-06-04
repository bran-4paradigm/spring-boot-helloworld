package com._4paradigm.ee.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Constants {

    public static String name;
    public static String url;

    @Value("${app.name}")
    public void setName(String name){
        Constants.name = name;
    }

    @Value("${app.url}")
    public void setUrl(String url){
        Constants.url = url;
    }
}
