package at.nacs.ex5thecalculator.controller.operation;


import at.nacs.ex5thecalculator.model.Expression;

public interface Operation {


    Double apply(Expression expression);
    boolean matches(Expression expression);

}
