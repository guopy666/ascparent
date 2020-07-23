package com.gpy.redefindsc.asceurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class AscEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(AscEurekaServerApplication.class, args);
    }

}
