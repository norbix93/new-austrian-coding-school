package at.nacs.reflection.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PrimeAdderTest {

    @Autowired
    PrimeAdder primeAdder;

    @ParameterizedTest
    @CsvSource({
            "5, 28",
            "3, 10",
            "9, 100",
            "100, 24133",
    })
    void sum(int numberOfPrimes, int result) {
        int expected = primeAdder.sum(numberOfPrimes);
        int actual = result;
        Assertions.assertEquals(expected, actual);
    }
}