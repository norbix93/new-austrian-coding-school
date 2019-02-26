package at.nacs.ex5thecalculator.controller.operation;

import at.nacs.ex5thecalculator.model.Expression;
import lombok.Builder;
import org.springframework.stereotype.Component;

@Builder
@Component
public class Division implements Operation {
    @Override
    public Double apply(Expression expression) {
        return expression.getNumber1() / expression.getNumber2();
    }

    @Override
    public boolean matches(Expression expression) {
        return expression.getSymbol().equals("/");
    }
}
