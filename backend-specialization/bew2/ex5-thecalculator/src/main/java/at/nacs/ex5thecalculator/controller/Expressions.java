package at.nacs.ex5thecalculator.controller;

import at.nacs.ex5thecalculator.model.Expression;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
@RequiredArgsConstructor
public class Expressions {

    private List<String> symbols = Arrays.asList("+", "-", "/", "*");

    public Expression from(String string) throws ArrayIndexOutOfBoundsException {
        String[] input = string.split(" ");
        if (input.length != 3) {
            throw new ArrayIndexOutOfBoundsException();
            //} else if (!symbols.contains(input)) {
            //  throw new IllegalArgumentException();
        } else return Expression.builder()
                .number1(Double.valueOf(input[0]))
                .symbol(input[1])
                .number2(Double.valueOf(input[2]))
                .build();
    }
}
