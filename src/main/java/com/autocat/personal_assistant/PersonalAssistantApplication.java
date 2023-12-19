package com.autocat.personal_assistant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class PersonalAssistantApplication {

    public static void main(String[] args) {
        SpringApplication.run(PersonalAssistantApplication.class, args);
    }

}
