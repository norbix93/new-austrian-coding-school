package at.nacs.exercise1marco;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/say")
@RequiredArgsConstructor
public class MarcoEndpoint {

    private final PoloClient poloClient;

    @GetMapping("/{message}")
    String say(@PathVariable String message){
        return poloClient.post(message);
    }
}
