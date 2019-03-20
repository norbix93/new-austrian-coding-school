package at.nacs.morse_code_server.communication;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = RANDOM_PORT)
class MorseEndpointTest {

    @Autowired
    TestRestTemplate restTemplate;

    String url = "/morse";

    @ParameterizedTest
    @CsvSource({
            "._, a",
            "...., h",
            "_._, k"
    })
    void encode(String expected, String message) {
        String actual = restTemplate.postForObject(url, message, String.class);

        assertThat(actual).isEqualTo(expected);
    }
}