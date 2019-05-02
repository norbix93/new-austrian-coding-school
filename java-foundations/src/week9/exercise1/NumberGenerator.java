package week9.exercise1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NumberGenerator {

    List<Integer> getEvenNumbers = generateNumbers().stream()
            .filter(number -> number % 2 == 0)
            .collect(Collectors.toList());

    List<Integer> getOddNumbers = generateNumbers().stream()
            .filter(number -> number % 2 == 1)
            .collect(Collectors.toList());

    List<Integer> getSpecialNumbers1 = generateNumbers().stream()
            .filter(number -> number % 3 == 0 && number > 10)
            .collect(Collectors.toList());

    List<Integer> getSpecialNumbers2 = generateNumbers().stream()
            .filter(number -> number < 5)
            .map(number -> number * 3)
            .collect(Collectors.toList());

    List<String> getSpecialNumbers3 = generateNumbers().stream()
            .filter(e -> e > 8)
            .filter(e -> e < 12)
            .map(e -> "Number " + e + " has " + e.toString().length() + " digits(s)")
            .collect(Collectors.toList());


    protected List<Integer> generateNumbers() {
        List<Integer> listOfNumbers = new ArrayList<>();
        for (int integer = 1; integer <= 20; integer++) {
            listOfNumbers.add(integer);
            integer = integer + 0;
        }
        return listOfNumbers;
    }
}
