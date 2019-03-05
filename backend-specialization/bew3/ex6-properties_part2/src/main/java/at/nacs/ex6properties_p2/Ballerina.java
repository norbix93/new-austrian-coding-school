package at.nacs.ex6properties_p2;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
@ConfigurationProperties("ballerina")
public class Ballerina {

    private Integer performanceQuality1;
    private Integer performanceQuality2;
    private Integer performanceQuality3;

}
