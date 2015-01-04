package com.objectpartners.wackyraces.registration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories
@EnableAutoConfiguration
public class RegistrationApp {

    public static void main(String[] args) {
        SpringApplication.run(RegistrationApp.class, args);
    }
}
