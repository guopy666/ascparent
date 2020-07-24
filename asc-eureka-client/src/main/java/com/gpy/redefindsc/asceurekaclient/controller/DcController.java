package com.gpy.redefindsc.asceurekaclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @author: guopy
 * @Date: 2020/7/24 13:56
 * @version: v1.0.0
 */
@RestController
public class DcController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/dc")
    public String dc(){
        String services = "Services: "+ discoveryClient.getServices();
        System.out.println(services);
        return services;
    }

}