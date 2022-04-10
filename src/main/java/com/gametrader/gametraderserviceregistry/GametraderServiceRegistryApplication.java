package com.gametrader.gametraderserviceregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class GametraderServiceRegistryApplication {

    public static void main(String[] args) {
        SpringApplication.run(GametraderServiceRegistryApplication.class, args);
    }

}
