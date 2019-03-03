package at.nacs.reflection.controller;

import org.springframework.stereotype.Component;

import java.util.stream.IntStream;

@Component
public class Primes {

    public boolean isPrime(int candidate) {
        Integer upperRange = candidate / 2;
        return candidate > 1 && IntStream.rangeClosed(2, upperRange)
                .noneMatch(divisor -> candidate % divisor == 0);
    }
}
