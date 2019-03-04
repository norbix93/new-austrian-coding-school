package at.nacs.ex6properties_part_1properties;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Word {

    @Getter
    @Value("${word.meaning}")
    private String meaning;




}
