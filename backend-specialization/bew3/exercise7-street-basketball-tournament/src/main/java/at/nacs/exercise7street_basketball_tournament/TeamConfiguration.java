package at.nacs.exercise7street_basketball_tournament;

import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TeamConfiguration {

    @Bean
    ApplicationRunner teamPlay(Court court) {
        return args -> {
            court.play();
        };
    }
}
