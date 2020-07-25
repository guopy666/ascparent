package com.gpy.redefindsc.ascconfigclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AscConfigClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(AscConfigClientApplication.class, args);
    }

}
