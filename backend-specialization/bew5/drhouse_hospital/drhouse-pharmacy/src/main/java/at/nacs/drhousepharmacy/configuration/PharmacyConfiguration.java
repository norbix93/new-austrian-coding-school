package at.nacs.drhousepharmacy.configuration;

import at.nacs.drhousepharmacy.persistence.Disease;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@ConfigurationProperties("dataset")
public class PharmacyConfiguration {
    @Setter
    @Getter
    List<Disease> diseases;

    @Bean
    List<Disease> diseases() {
        return diseases;
    }
}
