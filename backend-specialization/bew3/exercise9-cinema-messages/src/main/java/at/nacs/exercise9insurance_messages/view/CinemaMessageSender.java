package at.nacs.exercise9insurance_messages.view;

import at.nacs.exercise9insurance_messages.controller.TextMessageSender;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CinemaMessageSender {

    @Bean
    ApplicationRunner send(TextMessageSender sender){
        return args -> {
            sender.display();
        };
    }
}
