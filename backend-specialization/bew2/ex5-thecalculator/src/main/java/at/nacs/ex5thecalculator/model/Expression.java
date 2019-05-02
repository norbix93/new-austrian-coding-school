package at.nacs.ex5thecalculator.model;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Expression {

    private Double number1;
    private String symbol;
    private Double number2;
}
