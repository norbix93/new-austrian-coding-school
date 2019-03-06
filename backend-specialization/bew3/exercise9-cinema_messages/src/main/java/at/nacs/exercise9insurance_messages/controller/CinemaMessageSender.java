package at.nacs.exercise9insurance_messages.controller;

import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CinemaMessageSender {

    @Bean
    ApplicationRunner applicationRunner(TextMessageSender textMessageSender ){
        return args -> {
            textMessageSender.display();
        };
    }
}
