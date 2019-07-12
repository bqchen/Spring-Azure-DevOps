package com.demo.appservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;

@EnableDiscoveryClient
@EnableOAuth2Client
@SpringBootApplication
public class AppServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(AppServiceApplication.class, args);
    }

}
