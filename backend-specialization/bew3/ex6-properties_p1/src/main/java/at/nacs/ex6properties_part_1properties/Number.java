package at.nacs.ex6properties_part_1properties;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Number {
    @Getter
    @Value("${number.value}")
    private Integer value;
}
