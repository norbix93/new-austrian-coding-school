package at.nacs.ex6properties_p1;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Component
public class Sauna {

    @Value("${sauna.temperature}")
    private Integer temperature;

    @Value("${sauna.availableSeats}")
    private Integer availableSeats;
}
