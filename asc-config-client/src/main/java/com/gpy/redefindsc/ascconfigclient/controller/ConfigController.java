package com.gpy.redefindsc.ascconfigclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @author: guopy
 * @Date: 2020/7/25 17:00
 * @version: v1.0.0
 */
@RestController
@RequestMapping("/api")
public class ConfigController {

    @Value("${info.profile}")
    private String profileValue;

    @RequestMapping("/profile")
    public String returnValue(){
        return profileValue;
    }

}