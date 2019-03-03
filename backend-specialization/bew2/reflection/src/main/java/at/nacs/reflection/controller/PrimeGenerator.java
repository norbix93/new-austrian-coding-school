package at.nacs.reflection.controller;

import com.sun.jdi.PathSearchingVirtualMachine;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Component
@RequiredArgsConstructor
public class PrimeGenerator {

    private final Primes primes;

    public List<Integer> generate(Integer number) {
        return IntStream.iterate(2, e -> e + 1)
                .boxed()
                .filter(primes::isPrime)
                .limit(number)
                .collect(Collectors.toList());
    }
}
