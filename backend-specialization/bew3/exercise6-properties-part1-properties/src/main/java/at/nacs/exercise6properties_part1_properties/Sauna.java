package at.nacs.exercise6properties_part1_properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("sauna")
@Setter
@Getter
public class Sauna {

    private Integer temperature;
    private Integer availableSeats;


}
