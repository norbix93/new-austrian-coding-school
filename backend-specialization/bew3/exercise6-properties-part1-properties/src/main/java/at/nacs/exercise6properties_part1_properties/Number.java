package at.nacs.exercise6properties_part1_properties;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Getter
public class Number {
    @Value("${number.value}")
    private Integer value;
}
