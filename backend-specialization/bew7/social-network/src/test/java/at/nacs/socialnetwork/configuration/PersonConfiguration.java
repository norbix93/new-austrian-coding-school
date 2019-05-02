package at.nacs.socialnetwork.configuration;

import at.nacs.socialnetwork.persistence.Person;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("dataset")
public class PersonConfiguration {

    @Getter
    @Setter
    Person testPerson1;
    @Getter
    @Setter
    Person testPerson2;
    @Getter
    @Setter
    Person testPersonWithFriend;
    @Getter
    @Setter
    Person testPersonWithTwoFriends;

    @Bean
    Person testPerson1() {
        return testPerson1;
    }

    @Bean
    Person testPerson2() {
        return testPerson2;
    }

    @Bean
    Person testPersonWithFriend() {
        return testPersonWithFriend;
    }

    @Bean
    Person testPersonWithTwoFriends() {
        return testPersonWithTwoFriends;
    }
}

