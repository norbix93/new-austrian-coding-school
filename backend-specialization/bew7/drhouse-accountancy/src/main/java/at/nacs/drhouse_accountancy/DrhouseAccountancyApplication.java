package at.nacs.drhouse_accountancy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("at.nacs.drhouse_accountancy")
public class DrhouseAccountancyApplication {

    public static void main(String[] args) {
        SpringApplication.run(DrhouseAccountancyApplication.class, args);
    }

}
