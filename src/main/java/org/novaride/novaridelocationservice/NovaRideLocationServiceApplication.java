package org.novaride.novaridelocationservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class NovaRideLocationServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(NovaRideLocationServiceApplication.class, args);
    }

}
