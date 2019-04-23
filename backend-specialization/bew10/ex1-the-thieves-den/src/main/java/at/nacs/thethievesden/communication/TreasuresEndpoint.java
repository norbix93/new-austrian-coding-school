package at.nacs.thethievesden.communication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TreasuresEndpoint {

    @GetMapping
    String message() {
        return "1000000 gold coins!";
    }
}
