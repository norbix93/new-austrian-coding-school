package at.nacs.twitter_board.configuration;

import at.nacs.twitter_board.model.Tweet;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@ConfigurationProperties("dataset")
public class TweetConfiguration {

    @Setter
    List<Tweet> tweets;

    @Setter
    Tweet tweet;

    @Bean
    List<Tweet> tweets() {
        return tweets;
    }

    @Bean
    Tweet tweet() {
        return tweet;
    }

}
