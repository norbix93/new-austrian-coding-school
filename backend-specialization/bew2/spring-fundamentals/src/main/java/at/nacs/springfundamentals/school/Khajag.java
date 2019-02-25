package at.nacs.springfundamentals.school;

import org.springframework.stereotype.Component;

@Component
public class Khajag implements Child {

    @Override
    public String getName() {
        return "Khajag";
    }
}
