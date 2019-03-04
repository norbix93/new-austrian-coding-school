package at.nacs.ex6properties_p2;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Week {
    @Getter
    @Value("${week.days}")
    private List<String> days;
}
