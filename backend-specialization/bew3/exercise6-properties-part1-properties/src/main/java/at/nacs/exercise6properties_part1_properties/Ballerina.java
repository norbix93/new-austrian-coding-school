package at.nacs.exercise6properties_part1_properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("ballerina")
@Setter
@Getter
public class Ballerina {

    private Integer performanceQuality1;
    private Integer performanceQuality2;
    private Integer performanceQuality3;
}
