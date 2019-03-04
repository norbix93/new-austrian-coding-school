package at.nacs.ex6properties_part_1properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
@ConfigurationProperties
public class Ballerina {

    private Integer performanceQuality1;
    private Integer performanceQuality2;
    private Integer performanceQuality3;

}
