package at.nacs.reflection.controller;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertTrue;


@SpringBootTest
class HandshakeConverterTest {

    @Autowired
    HandshakeConverter converter;

    @ParameterizedTest
    @CsvSource({
            "3, little finger grab",
            "5, tickles over palm",
            "6, bro knock"
    })
    void convert(int input, String expected) {
        List<String> convertedHandshakes = converter.convert(input);
        String actual = convertedHandshakes.stream()
                .collect(Collectors.joining());
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testNoHandshake() {
        List<String> actual = converter.convert(6);
        assertTrue(actual.isEmpty());
    }

    @Test
    void testConvertMultipleHandshakes() {
        List<String> actual = converter.convert(195);
        List<String> expected = Arrays.asList("Thousand knuckles", "Tickles over palm");
        Assertions.assertEquals(expected, actual);
    }
}
