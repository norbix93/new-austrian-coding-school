package at.nacs.reflection.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class PrimeGeneratorTest {

    @Autowired
    PrimeGenerator generator;

    @ParameterizedTest
    @CsvSource({
            "10, 10",
            "24, 24",
            "100, 100",
    })
    void generate(int input, int actual) {
        int expected = generator.generate(input).size();
        Assertions.assertEquals(expected, actual);

    }
}