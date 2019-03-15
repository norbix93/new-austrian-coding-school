package at.nacs.morse_code_client;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequiredArgsConstructor
public class MorseClient {
    private final RestTemplate restTemplate;

    private String messageUrl = "http://localhost:9001/morse";

    public String encode(String message) {
        return restTemplate.postForObject(messageUrl, message, String.class);
    }
}
