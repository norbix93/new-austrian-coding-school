package at.nacs.polo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

@SpringBootTest(webEnvironment = RANDOM_PORT)
class PoloEndpointTest {

    @Autowired
    TestRestTemplate testRestTemplate;
    String url = "/polo";

    @ParameterizedTest
    @CsvSource({
            "Marco, Polo",
            "marco, Polo",
            "Polo, What!"
    })

    @Test
    void post(String message, String expected) {
        String response = testRestTemplate.postForObject(url, message, String.class);
        assertThat(response).isEqualTo(expected);
    }
}