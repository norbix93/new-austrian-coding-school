package at.nacs.exercise9insurance_messages.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan
public class Exercise9InsuranceMessagesApplication {

    public static void main(String[] args) {
        SpringApplication.run(Exercise9InsuranceMessagesApplication.class, args);
    }

}
