package at.nacs.reflection.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Component
@RequiredArgsConstructor
public class PrimeAdder {

    private final Primes primes;
    private List<Integer> validIntegers = IntStream.rangeClosed(0, 10)
            .boxed()
            .collect(Collectors.toList());

    public Integer sum(Integer numberOfPrimeNumbers) {
        return IntStream.iterate(2, e -> e + 1)
                .boxed()
                .filter(primes::isPrime)
                .limit(numberOfPrimeNumbers)
                .mapToInt(number -> number)
                .sum();
    }
}