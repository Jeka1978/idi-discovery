package com.idi.ididiscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableEurekaServer
public class IdiDiscoveryApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(IdiDiscoveryApplication.class, args);
        System.out.println();
    }

}
