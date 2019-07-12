package com.demo.appservice.controller;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RefreshScope
@RestController
public class AppServiceController {

    @RequestMapping("/home")
    public String home() {
        return "Welcome to the Spring Cloud Azure DevOps World!";
    }

}
