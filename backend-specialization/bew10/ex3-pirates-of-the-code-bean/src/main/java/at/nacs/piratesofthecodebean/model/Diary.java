package at.nacs.piratesofthecodebean.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
public class Diary {

    @Getter
    @Setter
    private boolean decipher;
}
