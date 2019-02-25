package at.nacs.springfundamentals;

import org.springframework.stereotype.Component;

@Component
public class Student {

    public String wantsToHaveABreak() {
        return "Plis, a break.";
    }

}
