package at.nacs.exercise1marco;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class PoloClient {

    private final RestTemplateConfiguration restTemplate;

    @Value("${message.server.url}")
    private String url;

    public String post(String message) {
        return restTemplate.restTemplate().patchForObject(url, message, String.class);
    }
}
