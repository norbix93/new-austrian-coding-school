package at.nacs.ex6properties_p1;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@Data
@ConfigurationProperties("ballerina")
//@Setter
public class Ballerina {

    private Integer performanceQuality1;
    private Integer performanceQuality2;
    private Integer performanceQuality3;

}
