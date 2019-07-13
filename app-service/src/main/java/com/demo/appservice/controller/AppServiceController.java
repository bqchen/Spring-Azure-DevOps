package com.demo.appservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RefreshScope
@RestController
public class AppServiceController {

    @Value("${server.port}")
    String port;

    @RequestMapping("/home")
    public String home() {
        return "Welcome to the Spring Cloud Azure DevOps World! Greetings from port " + port ;
    }

}
