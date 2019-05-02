package at.nacs.morse_code_server.communication;

import at.nacs.morse_code_server.controller.MorseEncoder;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/morse")
@RequiredArgsConstructor
public class MorseEndpoint {

    private final MorseEncoder morseEncoder;

    @PostMapping
    public String encode(@RequestBody String letter) {
        String translated = morseEncoder.translate(letter);
        return translated;
    }
}
