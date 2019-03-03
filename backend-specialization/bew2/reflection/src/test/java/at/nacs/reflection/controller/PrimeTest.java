package at.nacs.reflection.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PrimeTest {

    @Autowired
    Primes primes;

    @ParameterizedTest
    @CsvSource({
            "true, 2",
            "true, 3",
            "true, 97",
            "true, 997",
            "false, 0",
            "false, 1",
            "false, 4",
    })
    void isPrime(boolean expected, int input) {
        boolean actual = primes.isPrime(input);
        Assertions.assertEquals(expected, actual);
    }
}
