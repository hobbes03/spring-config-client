package com.atc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
public class ConfigClient {

    public static void main(String[] arguments) {
        SpringApplication.run(ConfigClient.class, arguments);
    }
}
