package at.nacs.ex6properties_p2;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
@ConfigurationProperties("sauna")
public class Sauna {

    private Integer availableSeats;
    private Integer temperature;
}


