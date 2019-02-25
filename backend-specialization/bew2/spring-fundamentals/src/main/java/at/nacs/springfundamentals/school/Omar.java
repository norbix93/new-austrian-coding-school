package at.nacs.springfundamentals.school;

import org.springframework.stereotype.Component;

@Component
public class Omar implements Child {

    @Override
    public String getName() {
        return "Omar";
    }
}
