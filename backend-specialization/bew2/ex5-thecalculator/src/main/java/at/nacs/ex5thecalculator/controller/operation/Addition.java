package at.nacs.ex5thecalculator.controller.operation;

import at.nacs.ex5thecalculator.model.Expression;
import lombok.Builder;
import org.springframework.stereotype.Component;


@Component
@Builder
public class Addition implements Operation {

    @Override
    public boolean matches(Expression expression) {
        return expression.getSymbol().equals("+");
    }

    @Override
    public Double apply(Expression expression) {
        return expression.getNumber1() + expression.getNumber2();
    }


}

