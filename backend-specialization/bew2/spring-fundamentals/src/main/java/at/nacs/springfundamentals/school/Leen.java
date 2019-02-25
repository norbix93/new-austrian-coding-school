package at.nacs.springfundamentals.school;

import org.springframework.stereotype.Component;

@Component
public class Leen implements Child{
    
    @Override
    public String getName() {
        return "Leen";
    }
}
