package com.gpy.redefindsc.ascconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class AscConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(AscConfigServerApplication.class, args);
    }

}
