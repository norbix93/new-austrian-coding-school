package at.nacs.morse_code_client;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
@RequestMapping("/encode")
@RequiredArgsConstructor
public class EncoderEndpoint {
    private final MorseClient client;

    @GetMapping
    List<String> uploadLetter() {
        String message = "martin molnar";
        return Stream.of(message.split(""))
                .collect(Collectors.toList());
    }

    String getTranslation() {
        List<String> letters = uploadLetter();
        String joinedLetters = letters.stream().
                collect(Collectors.joining());
        return client.encode(joinedLetters);
    }

    @GetMapping("/translation")
    String show() {
        return getTranslation();
    }
}


