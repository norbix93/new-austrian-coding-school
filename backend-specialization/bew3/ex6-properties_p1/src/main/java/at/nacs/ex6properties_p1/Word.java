package at.nacs.ex6properties_p1;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Getter
public class Word {
    @Value("${word.meaning}")
    private String meaning;
}
