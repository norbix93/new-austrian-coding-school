package at.nacs.ex6properties_p2;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Word {

    @Getter
    @Value("${word.meaning}")
    private String meaning;




}
