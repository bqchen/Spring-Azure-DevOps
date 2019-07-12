package com.demo.appservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.serviceregistry.Registration;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RequestMapping("home")
@RefreshScope
@RestController
public class AppServiceController {

    @RequestMapping("/info")
    public String homeInfo() {
        return "Welcome to the Spring Cloud Azure DevOps World!";
    }

//    @Autowired
//    @Qualifier("eurekaRegistration")
//    private Registration registration;
//
//    @Autowired
//    private DiscoveryClient client;
//
//    @Value("${msg:unknown}")
//    private String msg;
//
//    @GetMapping(value = "/")
//    public String printServiceB() {
//        ServiceInstance serviceInstance = serviceInstance();
//        return serviceInstance.getServiceId() + " (" + serviceInstance.getHost() + ":" + serviceInstance.getPort() + ")" + "===> Say " + msg;
//    }
//
//    public ServiceInstance serviceInstance() {
//        List<ServiceInstance> list = client.getInstances(registration.getServiceId());
//        if (list != null && list.size() > 0) {
//            for (ServiceInstance item : list) {
//                return item;
//            }
//        }
//        return null;
//    }
//
//
//    @GetMapping(path = "/current")
//    public Principal getCurrentAccount(Principal principal) {
//        return principal;
//    }

//    @Value("${server.port}")
//    String port;
//
//    @RequestMapping("/")
//    public String home() {
//        return "Welcome! This is a demo for Spring Cloud Azure DevOps";
//    }
}
